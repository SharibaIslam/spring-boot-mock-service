package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.EBLCardSdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EBLSDKServiceImpl implements EBLCardSdkService {

    @Autowired
    private RestEndpointsController restEndpointsController;

    @Override
    public String getEBLSuccess() {
        return "{\"merchant\":\"TEST20070005\",\"result\":\"SUCCESS\",0\"session\":{\"id\": \"SESSION0002348492203F8244964E76\", \"updateStatus\": \"SUCCESS\",\"version\": \"df6d6b2701\"},\"successIndicator\":\"****\"}";
     }
}
