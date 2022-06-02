package com.mockService.mockService.controller;

import com.mockService.mockService.service.*;
import com.mockService.mockService.service.EBLCardSdkService;
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
    @Autowired
    private EBLCardSdkService eblCardSdkService;
    @Autowired
    private RocketService rocketService;
    @Autowired
    private RocketCheckoutService rocketCheckoutService;
    @Autowired
    private Pran_rflService pran_rflService;
    @Autowired
    private CityBankService cityBankService;






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

    @RequestMapping(method = RequestMethod.POST,value = "/api/rest/version/60/merchant/**",produces = "application/json")
    public String eblEnquiry(){
        return eblCardSdkService.getEBLSuccess();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/v1/transactionValidation",produces = "application/xml")
    public String rocketTxnValidation(){
        return rocketService.getTxnEligibility();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/v1/doTransaction",produces = "application/xml")
    public String rocketDoTxn(){
        return rocketService.doTxn();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/v1/transactionInquiry",produces = "application/xml")
    public String rocketDoInquiry(){
        return rocketService.doInquiry();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/v1/recieveTransactionStatus",produces = "application/xml")
    public String rocketGetTxnStatus(){
        return rocketService.getTxnStatus();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/getransid",produces = "application/xml")
    public String rocketGetTxnId(){
        return rocketCheckoutService.getTxnId();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/getresultfield",produces = "application/xml")
    public String rocketGetResultField(){
        return rocketCheckoutService.getResultField();
    }
    @RequestMapping(method = RequestMethod.POST,value = "/callbackapi/**",produces = "application/json")
    public String rocketCallBackURL(){
        return rocketService.callBackURL();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/SendTopUp",produces = "application/json")
    public String pranRFLTallyPay()
    {
        return pran_rflService.getPranSuccessRes();
    }
    @RequestMapping(method = RequestMethod.POST,value = "/api/mock-bank-txn/other-bank-status",produces = "application/xml")
    public String getCityOtherBankTxnStatus(){
        return cityBankService.getPendingEftTxnStatus();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/doDebitTransaction",produces = "application/xml")
    public String cityBankCashIn(){
        return cityBankService.doDebitTxn();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/doCreditTransaction",produces = "application/xml")
    public String cityBankCashOut(){
        return cityBankService.doCreditTxn();
    }

}
