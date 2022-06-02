package com.mockService.mockService.service.impl;

import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.RocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlElement;

@Service
public class RocketServiceImpl implements RocketService {

    @Autowired
    private RestEndpointsController restEndpointsController;
    @Override
    @XmlElement
    public String getTxnEligibility() {
        return
                "<TransactionValidationResponse>" +
                "<Header>"+
                " <ResponseCode>ERR-000</ResponseCode>" +
                " <ResponseMessage>Success</ResponseMessage>" +
                "</Header>"+
                "<Body>" +
                "<ChargeAmount>7.56</ChargeAmount>" +
                "</Body>" +
                "</TransactionValidationResponse>";
    }

    @Override
    public String doTxn() {
        // success
        /*return "<DoTransactionResponse>" +
                "<Header>"+
                " <ResponseCode>ERR-001</ResponseCode>" +
                " <ResponseMessage>Transaction Successfully Received </ResponseMessage>" +
                "</Header>"+
                "</DoTransactionResponse>";*/

       //failed/timeout
        return "<DoTransactionResponse>" +
                "<Header>"+
                " <ResponseCode>ERR-100</ResponseCode>" +
                " <ResponseMessage>Timeout. Please inquire after some time </ResponseMessage>" +
                "</Header>"+
                "</DoTransactionResponse>";
    }

    @Override
    public String doInquiry() {
        return "<TransactionInquiryResponse>" +
                "<Header>"+
                " <ResponseCode>ERR-000</ResponseCode>" +
                " <ResponseMessage>Success</ResponseMessage>" +
                "</Header>"+
                "<Body>" +
                "<DBBLTxnId>4968713658</DBBLTxnId>" +
                "<DBBLTxnDate>20-08-201813:36:01</DBBLTxnDate>" +
                "</Body>" +
                "</TransactionInquiryResponse>";
    }

    @Override
    public String getTxnStatus() {
        return "<ReceiveTransactionStatusResponse>" +
                "<Header>"+
                " <ResponseCode>ERR-000</ResponseCode>" +
                " <ResponseMessage>Success</ResponseMessage>" +
                "</Header>"+
                "<Body/>" +
                "</ReceiveTransactionStatusResponse>";
    }

    @Override
    public String callBackURL() {
        return "{\"ResponseCode\":\"00\",\"ResponseMessage\":\"Successful\"}";
    }
}
