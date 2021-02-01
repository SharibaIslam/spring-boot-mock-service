package com.jpadb.jpa.service;

import com.jpadb.jpa.entity.OTPRead;

import java.util.List;

public interface ReadOTPService {
    List<OTPRead> getAllMobileOTP();
    public String findBy_mobile(String mobile);


}
