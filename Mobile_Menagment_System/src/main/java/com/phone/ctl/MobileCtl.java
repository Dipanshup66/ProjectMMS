package com.phone.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phone.common.BaseCtl;
import com.phone.dto.MobileDTO;
import com.phone.form.MobileForm;
import com.phone.service.MobileServiceInt;

@RestController
@RequestMapping(value = "Mobile")
public class MobileCtl extends BaseCtl<MobileForm, MobileDTO, MobileServiceInt>{

}
