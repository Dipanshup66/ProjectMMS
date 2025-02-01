package com.phone.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public abstract class BaseDAOImpl<T extends BaseDto, S extends BaseServiceInt<T>> implements BaseDAOInt<T> {

	@PersistenceContext
	public EntityManager entitymanager;

	public abstract Class<T> getDTOClass();

	public abstract List<Predicate> getWhereClause(CriteriaBuilder builder, Root qRoot, T dto);

	public long add(T dto) {
		entitymanager.persist(dto);
		return dto.getId();
	}

	public T findByUniqeKey(String attribute, String value) {

		CriteriaBuilder builder = entitymanager.getCriteriaBuilder();

		CriteriaQuery<T> cq = builder.createQuery(getDTOClass());

		Root<T> qRoot = cq.from(getDTOClass());

		Predicate condition = builder.equal(qRoot.get(attribute), value);

		cq.where(condition);

		TypedQuery<T> tq = entitymanager.createQuery(cq);

		List<T> list = tq.getResultList();

		T dto = null;

		if (list.size() > 0) {
			dto = list.get(0);
		}

		return dto;
	}

	public List search(T dto, int pageNo, int pageSize) {
		CriteriaBuilder builder = entitymanager.getCriteriaBuilder();
		CriteriaQuery<T> cq = builder.createQuery(getDTOClass());
		Root<T> qRoot = cq.from(getDTOClass());

		List<Predicate> predicateList = getWhereClause(builder, qRoot, dto);
		cq.where(predicateList.toArray(new Predicate[predicateList.size()]));
		TypedQuery<T> tq = entitymanager.createQuery(cq);
		if (pageSize > 0) {
			tq.setFirstResult(pageNo * pageSize);
			tq.setMaxResults(pageSize);
		}
		List<T> list = tq.getResultList();

	
		return list;
	}

	public void delete(T dto) {
		entitymanager.remove(dto);
	}

	@Override
	public T findByPk(long pk) {
		T dto = entitymanager.find(getDTOClass(), pk);
		return dto;
	}

	@Override
	public void update(T dto) {
		entitymanager.merge(dto);
	}

}
