package com.bikecom.demo.model;

import javax.persistence.*;

@Entity
public class PostCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer zipCode;
    private String status;


    public PostCodes(){}

    public PostCodes(Long id, Integer zipCode, String status) {
        this.id = id;
        this.zipCode = zipCode;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer postCodes) {
        this.zipCode = postCodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PostCodes{" +
                "id=" + id +
                ", postCode=" + zipCode +
                ", status='" + status + '\'' +
                '}';
    }
}
