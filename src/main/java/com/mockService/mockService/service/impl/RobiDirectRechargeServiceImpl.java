package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.controller.RobiRechargeResp;
import com.mockService.mockService.service.RobiDirectRechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Service
public class RobiDirectRechargeServiceImpl implements RobiDirectRechargeService {

    @Autowired
    RestEndpointsController restEndpointsController;
    @Override
    @XmlElement
    public String getRechargeRes() {

        return "<?xml version=\"1.0\"?>" +
                "<COMMAND>" +
                "<TYPE>EXRCTRFRESP</TYPE>" +
                "<TXNSTATUS>200</TXNSTATUS>" +
                "<DATE>15/09/2020 18:07:03</DATE>" +
                "<EXTREFNUM>RB00501903878</EXTREFNUM>" +
                "<TXNID>R200915.1807.670022</TXNID>" +
                "<MESSAGE>Recharge 20 Tk to 1853312734 is successful. Transaction number is R200805.2347.620004.Your new balance is 598443 TAKA. Thank You.</MESSAGE>" +
                "</COMMAND>";
    }

    @Override
    public RobiRechargeResp getRechargeResTimeout() {
        RobiRechargeResp robiRechargeResp=new RobiRechargeResp();
        return robiRechargeResp;
    }

    @Override
    public String getRechargeResNotEnoughMoney() {
        return "<?xml version=\"1.0\"?>" +
                "<COMMAND>" +
                "<TYPE>EXRCTRFRESP</TYPE>" +
                "<TXNSTATUS>3006201</TXNSTATUS>" +
                "<DATE>15/09/2020 18:07:03</DATE>" +
                "<EXTREFNUM>RB00501903878</EXTREFNUM>" +
                "<TXNID>R200915.1807.670022</TXNID>" +
                "<MESSAGE>The mobile number 1880754506 cannot use the same recharge service within 2.00 minutes of last successful transaction as last transfer amount is same as current requested amount.</MESSAGE>" +
                "</COMMAND>";
    }


}
