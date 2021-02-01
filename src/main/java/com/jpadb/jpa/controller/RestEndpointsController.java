package com.jpadb.jpa.controller;

import com.jpadb.jpa.entity.OTPRead;
import com.jpadb.jpa.service.ReadOTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class RestEndpointsController {

    @Autowired
    private ReadOTPService readOTPService;
    private Object List;

    @RequestMapping(method = RequestMethod.GET,value = "/get/all/code")
    public List<OTPRead> getAllData(){
        return readOTPService.getAllMobileOTP();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/get/mobile/otp/code",consumes = "application/json",produces = "application/json")
    public String getMobileWiseOTP(@RequestParam(value = "mobile",required = true)String mobile){
        return readOTPService.findBy_mobile(mobile);
    }

}
