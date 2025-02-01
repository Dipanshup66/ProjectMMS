package com.phone.dao;

import org.springframework.stereotype.Repository;

import com.phone.common.BaseDAOImpl;
import com.phone.dto.MobileDTO;
import com.phone.service.MobileServiceInt;

@Repository
public class MobileDAOImpl extends BaseDAOImpl<MobileDTO, MobileServiceInt>implements MobileDAOInt {

}
