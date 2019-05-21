package io.upepo.baharirestapi.model;

import org.hibernate.annotations.NaturalId;
import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    @NotBlank(message = "Customer name must be entered")
    private String name;

    @Column(name="customer_type")
    @NotBlank(message = "Customer name must be entered")
    String customertype;

    @Column(name="id_number")
    @NotBlank(message="Customer type must be entered")
    String idnumber;

    @Column(name="pin_number")
    @NotBlank(message = "KRA PIN must be entered")
    String pinnumber;

    @Column(name="postal_address")
    String postaladdress;

    @Column(name="postal_code")
    String postalcode;

    @Column(name="phone")
    String phone;

    @Email(message = "Email format must be valid")
    @Column(name="email")
    String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType()
    {
        return this.customertype;
    }

    public void setCustomerType(String type)
    {
        this.customertype=type;
    }

    public String getIdNumber()
    {
        return this.idnumber;
    }

    public void setIdNumber(String number)
    {
        this.idnumber=number;
    }

    public String getPinNumber()
    {
        return this.pinnumber;
    }

    public void setPinNumber(String number)
    {
        this.pinnumber=number;
    }

    public String getPostalAddress()
    {
        return this.postaladdress;
    }

    public void setPostalAddress(String address)
    {
        this.postaladdress=address;
    }

    public String getPostalCode()
    {
        return this.postalcode;
    }

    public void setPostalCode(String code)
    {
        this.postalcode= code;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
}
