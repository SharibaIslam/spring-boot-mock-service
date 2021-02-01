package com.jpadb.jpa.service.impl;

import com.jpadb.jpa.entity.OTPRead;
import com.jpadb.jpa.repositories.ReadOTPRepository;
import com.jpadb.jpa.service.ReadOTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReadOTPServiceImpl implements ReadOTPService {

    @Autowired
    private ReadOTPRepository readOTPRepository;
    ;


    @Override
    public List<OTPRead> getAllMobileOTP() {
        return readOTPRepository.getAllMobileOTP();
    }

    @Override
    public String findBy_mobile(String mobile) {
        return readOTPRepository.findBy_mobile(mobile);
    }


}
