package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.PranRFlRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PranRFlRechargeServiceImpl implements PranRFlRechargeService {
    @Autowired
    private RestEndpointsController restEndpointsController;
    @Override
    public String getPranRflSuccessRes() {
        return "{\"Message\":\"Successful\",\"status_code\":200,\"Trx_id\":\"BD08251053160527\"}";
    }
}
