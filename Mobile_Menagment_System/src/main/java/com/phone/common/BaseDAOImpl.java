package com.phone.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.phone.dto.MobileDTO;

public class BaseDAOImpl<T extends BaseDto, S extends BaseServiceInt<T>> implements BaseDAOInt<T> {

	@PersistenceContext
	public EntityManager entitymanager;

	public long add(MobileDTO dto) {
		entitymanager.persist(dto);
		return dto.getId();
	}

	public MobileDTO findByUniqeKey(String attribute, String value) {

		CriteriaBuilder builder = entitymanager.getCriteriaBuilder();

		CriteriaQuery<MobileDTO> cq = builder.createQuery(MobileDTO.class);

		Root<MobileDTO> qRoot = cq.from(MobileDTO.class);

		Predicate condition = builder.equal(qRoot.get(attribute), value);

		cq.where(condition);

		TypedQuery<MobileDTO> tq = entitymanager.createQuery(cq);

		List<MobileDTO> list = tq.getResultList();

		MobileDTO dto = null;

		if (list.size() > 0) {
			dto = list.get(0);
		}

		return dto;
	}

}
