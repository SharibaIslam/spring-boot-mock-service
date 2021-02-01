package com.mockService.mockService.controller;

import com.mockService.mockService.service.PdpdcService;
import com.mockService.mockService.service.PranRFlRechargeService;
import com.mockService.mockService.service.RobiDirectRechargeService;
import com.mockService.mockService.service.RuetService;
import com.mockService.mockService.service.impl.PdpdcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.XMLStreamException;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class RestEndpointsController {

    @Autowired
    private RuetService ruetService;
    @Autowired
    private PdpdcService pdpdcService;
    @Autowired
    private RobiDirectRechargeService robiDirectRechargeService;
    @Autowired
    private PranRFlRechargeService pranRFlRechargeService;




    @RequestMapping(method = RequestMethod.GET,value = "/payment/verification/Application/**",produces = "application/json")
    public String ruetEnquiryApplication(){
        return ruetService.ruet_enquiry_application();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/payment/confirmation/Application/**",produces = "application/json")
    public String ruetPaymentApplication(){
        return ruetService.ruet_payment_application();
    }

    /*For payment timeout*/
    /*@RequestMapping(method = RequestMethod.GET,value = "/payment/confirmation/Application/**",produces = "application/json")
    public String ruetPaymentApplicationTimout(){
        return ruetService.ruet_payment_application_timeout();*/

    @RequestMapping(method = RequestMethod.GET,value = "/payment/reconciliation/Application/**",produces = "application/json")
    public String ruetPaymentApplicationRecon(){
        return ruetService.ruet_reconcile_application();
    }

    /*For payment timeout*/
    /*@RequestMapping(method = RequestMethod.GET,value = "/payment/reconciliation/Application/**",produces = "application/json")
    public String ruetPaymentApplicationReconTimeout() {
        return ruetService.ruet_reconcile_application_timeout();
    }*/

    @RequestMapping(method = RequestMethod.GET,value = "/payment/verification/Admission/**",produces = "application/json")
    public String ruetEnquiryAdmission(){
        return ruetService.ruet_enquiry_admission();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/payment/confirmation/Admission/**",produces = "application/json")
    public String ruetPaymentAdmission(){
        return ruetService.ruet_payment_admission();
    }

    /*For payment timeout*/
    /*@RequestMapping(method = RequestMethod.GET,value = "/payment/confirmation/Admission/**",produces = "application/json")
    public String ruetPaymentAdmissionTimout(){
        return ruetService.ruet_payment_admission_timeout();*/

    @RequestMapping(method = RequestMethod.GET,value = "/payment/reconciliation/Admission/**",produces = "application/json")
    public String ruetPaymentadmissionRecon(){
        return ruetService.ruet_reconcile_admission();
    }

    /*For payment timeout*/
    /*@RequestMapping(method = RequestMethod.GET,value = "/payment/reconciliation/Admission/**",produces = "application/json")
    public String ruetPaymentadmissionReconTimeout() {
        return ruetService.ruet_reconcile_admission_timeout();
    }*/

    @RequestMapping(method = RequestMethod.POST, value = "/pdpdc/enquiry",consumes = "application/json",produces = "application/json")
    public PDPDCResponse pdpdcEnquiry(@RequestBody PdpdcImpl pdpdcService){
        return pdpdcService.pdpdcEnquiryPost();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pretups/C2SReceiver/**",produces=MediaType.APPLICATION_XML_VALUE,consumes = "application/xml")
    public String robiEnquiry() throws XMLStreamException {
        /*Map<String, Object> props = new HashMap<>();
        props.put(SOAPMessage.WRITE_XML_DECLARATION, "true");*/
        return robiDirectRechargeService.getRechargeRes();
    }
 /*Robi recharge timeout*/
    /*@RequestMapping(method = RequestMethod.POST, value = "/pretups/C2SReceiver/**",produces=MediaType.APPLICATION_XML_VALUE,consumes = "application/xml")
    public RobiRechargeResp robiEnquiryTimeout() throws XMLStreamException {
        *//*Map<String, Object> props = new HashMap<>();
        props.put(SOAPMessage.WRITE_XML_DECLARATION, "true");*//*
        return robiDirectRechargeService.getRechargeResTimeout();
    }*/
    /*Robi recharge not enough credit check*/
    /*@RequestMapping(method = RequestMethod.POST, value = "/pretups/C2SReceiver/**",produces=MediaType.APPLICATION_XML_VALUE,consumes = "application/xml")
    public String robiEnquiryNotEnoughCredit() throws XMLStreamException {
        *//*Map<String, Object> props = new HashMap<>();
        props.put(SOAPMessage.WRITE_XML_DECLARATION, "true");*//*
        return robiDirectRechargeService.getRechargeResNotEnoughMoney();
    }*/

    @RequestMapping(method = RequestMethod.POST, value = "/pranRFL/**",produces="application/json",consumes = "application/json")
    public String pranRFLEnquiry() {
        /*Map<String, Object> props = new HashMap<>();
        props.put(SOAPMessage.WRITE_XML_DECLARATION, "true");*/
        return pranRFlRechargeService.getPranRflSuccessRes();
    }

}
