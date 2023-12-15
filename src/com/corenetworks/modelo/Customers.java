package com.corenetworks.modelo;

import java.util.Objects;

public class Customers {
    private String customer_id;
    private String contact_name;
    private String company_name;

    public Customers() {
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id='" + customer_id + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }

    public Customers(String customer_id, String contact_name, String company_name) {
        this.customer_id = customer_id;
        this.contact_name = contact_name;
        this.company_name = company_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return Objects.equals(customer_id, customers.customer_id) && Objects.equals(contact_name, customers.contact_name) && Objects.equals(company_name, customers.company_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_id, contact_name, company_name);
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}

