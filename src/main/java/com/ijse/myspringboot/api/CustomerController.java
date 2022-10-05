package com.ijse.myspringboot.api;

public class CustomerController {

    public String saveCustomer(){return  "Customer Saved";}
    public String deleteCustomer(String id){return  "Customer Deleted" +id;}
    public String updateCustomer(){return  "Customer Updated";}
    public String getCustomer(String id){return  "Customer get" +id;}
    public String getAllCustomer(){return  "All Customer get";}
}


