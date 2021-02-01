package com.mockService.mockService.controller;

public class PDPDCResponse {

    private String status;
    private int statusCode;
    private String description;

    public  PDPDCResponse() {super();}

    public PDPDCResponse(String status, int statusCode, String description) {
        super();
        this.status = status;
        this.statusCode = statusCode;
        this.description = description;
    }


    public String getStatus() {
        return "SUCCESS";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return 200;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return "Updated successfully";
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
