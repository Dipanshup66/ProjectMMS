package com.phone.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.phone.common.BaseServiceImpl;
import com.phone.dao.MobileDAOImpl;
import com.phone.dto.MobileDTO;

@Service
@Transactional
public class MobileServiceImpl extends BaseServiceImpl<MobileDTO, MobileDAOImpl> implements MobileServiceInt {

}
