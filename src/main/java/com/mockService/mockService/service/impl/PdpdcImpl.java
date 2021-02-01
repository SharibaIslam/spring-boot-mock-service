package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.PDPDCResponse;
import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.PdpdcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PdpdcImpl implements PdpdcService {

    @Autowired
    private RestEndpointsController restEndpointsController;

    @Override
    public PDPDCResponse pdpdcEnquiryPost() {
        PDPDCResponse pdpdcResponse=new PDPDCResponse();
        return pdpdcResponse;
    }

}
