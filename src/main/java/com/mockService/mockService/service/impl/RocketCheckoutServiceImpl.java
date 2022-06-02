package com.mockService.mockService.service.impl;

import com.mockService.mockService.service.RocketCheckoutService;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlElement;

@Service
public class RocketCheckoutServiceImpl implements RocketCheckoutService {
    @Override
    @XmlElement
    public String getTxnId() {
        return
                        "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                        "<S:Body>\n"+
                        " <ns2:getransidResponse xmlns:ns2=\"http://ecom.dbbl/\">" +
                        "<return>TRANSACTION_ID:yf9pPNY66m2w8S2q1LotByY5Ilw=</return>" +
                        "</ns2:getransidResponse>"+
                        "</S:Body>" +
                        "</S:Envelope>";
    }

    @Override
    public String getResultField() {
        return "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<S:Body>"+
                "<ns2:getresultfieldResponse xmlns:ns2=\"http://ecom.dbbl/\">" +
                "<return>RESULT>OK^RESULT_CODE>000^3DSECURE>0^RRN>210115751446^APPROVAL_CODE>500008^CARD_NUMBER>999999*********5751^AMOUNT>1000^CARDNAME>mobile account^DESCRIPTION>6a9bce3566124ad7c^TRANS_DATE>2022-04-11 15:12:47 PM</return>" +
                "</ns2:getresultfieldResponse>"+
                "</S:Body>" +
                "</S:Envelope>";
    }
}
