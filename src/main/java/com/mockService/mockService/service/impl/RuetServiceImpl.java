package com.mockService.mockService.service.impl;


import com.mockService.mockService.controller.RestEndpointsController;
import com.mockService.mockService.service.RuetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static sun.misc.Version.println;

@Service
public class RuetServiceImpl implements RuetService {

    @Autowired
    private RestEndpointsController restEndpointsController;

    @Override
    public String ruet_enquiry_application() {
        return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"reference_id\": \"1600197424467\"," +
                "\"name\": \"Fahmida Sammi\",\"fee\": \"500\"}}";
    }

    @Override
    public String ruet_payment_application() {
        return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"description\": \"Payment Information Updated Successfully\"," +
                "\"reference_id\": \"1600890465688\",\"name\": \"Jafar ullah\"," +
                "\"fee\": \"200\",\"transaction_id\": \"RB0000121095\",\"transaction_date\": \"2021-01-13 11:13:00\"}}";
    }

    @Override
    public String ruet_payment_application_timeout() {
        try {
            Thread.sleep(10000);
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public String ruet_reconcile_application() {

         return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"description\": \"Payment reconciled Successfully\"," +
                 "\"reference_id\": \"1600890465688\",\"name\": \"Jafar ullah\"," +
                 "\"fee\": \"200\",\"transaction_id\": \"RB0000121095\",\"transaction_date\": \"2021-01-13 11:13:00\"}}";

    }

    @Override
    public String ruet_reconcile_application_timeout() {
        try {
            Thread.sleep(10000);
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public String ruet_enquiry_admission() {
        return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"reference_id\": \"1600197424467\"," +
                "\"name\": \"Fahmida Sammi\",\"fee\": \"600\"}}";
    }

    @Override
    public String ruet_payment_admission() {
        return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"description\": \"Payment Information Updated Successfully\"," +
                "\"reference_id\": \"1600890465688\",\"name\": \"Jafar ullah\"," +
                "\"fee\": \"200\",\"transaction_id\": \"RB0000121095\",\"transaction_date\": \"2021-01-13 11:13:00\"}}";
    }

    @Override
    public String ruet_payment_admission_timeout() {
        try {
            Thread.sleep(10000);
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public String ruet_reconcile_admission() {
        return "{\"data\":{\"status\": \"SUCCESS\", \"statusCode\": \"200\",\"description\": \"Payment reconciled Successfully\"," +
                "\"reference_id\": \"1600890465688\",\"name\": \"Jafar ullah\"," +
                "\"fee\": \"200\",\"transaction_id\": \"RB0000121095\",\"transaction_date\": \"2021-01-13 11:13:00\"}}";
    }

    @Override
    public String ruet_reconcile_admission_timeout() {
        try {
            Thread.sleep(10000);
        }catch (Exception e){
        }
        return null;
    }


}
