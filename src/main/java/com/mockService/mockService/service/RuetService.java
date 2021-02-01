package com.mockService.mockService.service;



import java.util.List;

public interface RuetService {

    /*Application*/
    public String ruet_enquiry_application();
    public String ruet_payment_application();
    public String ruet_payment_application_timeout() throws InterruptedException;
    public String ruet_reconcile_application();
    public String ruet_reconcile_application_timeout();

    /*Admission*/
    public String ruet_enquiry_admission();
    public String ruet_payment_admission();
    public String ruet_payment_admission_timeout();
    public String ruet_reconcile_admission();
    public String ruet_reconcile_admission_timeout();


}
