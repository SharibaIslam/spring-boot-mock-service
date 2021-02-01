package com.mockService.mockService.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RobiRechargeResp {

    @XmlElement
    private int respCode;

    public RobiRechargeResp(){super();}
    public RobiRechargeResp(int respCode) {
        super();
        this.respCode = respCode;
    }
    @XmlElement
    public int getResp() {
        return 418;
    }

    public void setResp(int respCode) {
        this.respCode = respCode;
    }

}
