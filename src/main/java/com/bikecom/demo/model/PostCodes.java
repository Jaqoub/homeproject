package com.bikecom.demo.model;

import javax.persistence.*;

@Entity
public class PostCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer postCodes;
    private Long id;
    private String status;


    public PostCodes(){}



    public PostCodes(Long id, Integer postCode, String status) {
        this.id = id;
        this.postCodes = postCode;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPostCode() {
        return postCodes;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public void setPostCodes(Integer postCodes) {
        this.postCodes = postCodes;
    }

    @Override
    public String toString() {
        return "PostCodes{" +
                "id=" + id +
                ", postCode=" + postCodes +
                ", status='" + status + '\'' +
                '}';
    }
}
