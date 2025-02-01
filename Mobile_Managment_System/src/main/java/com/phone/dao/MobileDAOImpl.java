package com.phone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.phone.common.BaseDAOImpl;
import com.phone.dto.MobileDTO;
import com.phone.service.MobileServiceInt;

@Repository
public class MobileDAOImpl extends BaseDAOImpl<MobileDTO, MobileServiceInt> implements MobileDAOInt {

	public Class<MobileDTO> getDTOClass() {
		return MobileDTO.class;
	}

	public List<Predicate> getWhereClause(CriteriaBuilder builder, Root qRoot, MobileDTO dto) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (dto != null) {
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));
			}
			if (dto.getMobileName() != null && dto.getMobileName().length() > 0) {
				whereCondition.add(builder.like(qRoot.get("mobileName"), dto.getMobileName() + "%"));
			}
			if (dto.getImeiNumber() != null && dto.getImeiNumber().length() > 0) {
				whereCondition.add(builder.like(qRoot.get("imeiNumber"), "%" + dto.getImeiNumber()));
			}
			if(dto.getId() != null && dto.getId()>0) {
				whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
			}
			if(dto.getBrandId() != null && dto.getBrandId()>0) {
				whereCondition.add(builder.equal(qRoot.get("brandId"), dto.getBrandId()));
			}

		}
		return whereCondition;
	}

	

	

}
