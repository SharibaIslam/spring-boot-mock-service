package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.Pran_rflService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PranRFLServiceImpl implements Pran_rflService {

    @Autowired
    private RestEndpointsController restEndpointsController;
    @Override
    public String getPranSuccessRes() {
        return "{\"status_code\":\"200\",\"Message\":\"Successful\",\"Trx_id\":\"R220523.0753.25001d\"}";
    }
}
