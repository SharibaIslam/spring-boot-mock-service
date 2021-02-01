package com.mockService.mockService.service;

import com.mockService.mockService.controller.RobiRechargeResp;

public interface RobiDirectRechargeService {
    public String getRechargeRes();
    public RobiRechargeResp getRechargeResTimeout();
    public String getRechargeResNotEnoughMoney();
}
