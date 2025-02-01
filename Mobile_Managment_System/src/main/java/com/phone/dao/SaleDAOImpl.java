package com.phone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.phone.common.BaseDAOImpl;
import com.phone.dto.SaleDto;
import com.phone.service.SaleServiceInt;

@Repository
public class SaleDAOImpl extends BaseDAOImpl<SaleDto, SaleServiceInt> implements SaleDAOInt {

	public Class<SaleDto> getDTOClass() {

		return SaleDto.class;
	}

	public List<Predicate> getWhereClause(CriteriaBuilder builder, Root qRoot, SaleDto dto) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (dto != null) {
			if (dto.getMobileName() != null && dto.getMobileName().length() > 0) {
				whereCondition.add(builder.like(qRoot.get("mobileName"), dto.getMobileName() + "%"));
			}
			if (dto.getImeiNumber() != null && dto.getImeiNumber().length() > 0) {
				whereCondition.add(builder.like(qRoot.get("imeiNumber"), "%" + dto.getImeiNumber()));
			}

		}
		return whereCondition;
	}

}
