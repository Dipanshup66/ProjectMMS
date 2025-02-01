package com.phone.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.phone.common.BaseDAOImpl;
import com.phone.dto.BrandDto;
import com.phone.service.BrandServiceInt;

@Repository
public class BrandDAOImpl extends BaseDAOImpl<BrandDto, BrandServiceInt> implements BrandDAOInt {

	@Override
	public Class<BrandDto> getDTOClass() {
		return BrandDto.class;
	}

	@Override
	public List<Predicate> getWhereClause(CriteriaBuilder builder, Root qRoot, BrandDto dto) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (dto != null) {

			if (dto.getId() != null && dto.getId() > 0) {
				whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
			}
		}
		return whereCondition;
	}

}
