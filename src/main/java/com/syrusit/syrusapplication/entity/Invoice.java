package com.syrusit.syrusapplication.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="InvoiceRepository")
public class Invoice {

    @Id//use to configure the primary key of emp table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //use to configure auto increment constrain
    @Column(name="id") //use to configure the column for below variable in Employee tabel
    private Integer id;

    @Column(name="invoicenumber")
    @Size(min = 3)
    @NotEmpty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String invoicenumber;

    @Column(name="senderName")
    @Size(min = 3)
    @NotEmpty
    private String senderName;

    @Column(name = "billingAddress")
    @Size(min = 3)
    @Size(max = 200)
    private String billingAddress;

    @Column(name = "senderEmail")
    @Email
    private String senderEmail;

    @Column(name = "invoiceDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;

    @Column(name = "dueDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;

    @Column(name = "term")
    private String term;



    public  Invoice(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
            }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }



    public Invoice(@Size(min = 3) @NotEmpty String invoicenumber, @Size(min = 3) @NotEmpty String senderName, @Size(min = 3) @Size(max = 200) String billingAddress, @Email String senderEmail, Date invoiceDate, Date dueDate, String term) {
        this.invoicenumber = invoicenumber;
        this.senderName = senderName;
        this.billingAddress = billingAddress;
        this.senderEmail = senderEmail;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.term = term;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                '}';
    }
}
