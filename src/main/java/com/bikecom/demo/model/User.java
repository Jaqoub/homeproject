package com.bikecom.demo.model;


import javax.persistence.*;


@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    private String name;
    private int numberOfBicycles;
    private String startTime;
    private String endTime;
    private String city;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postcode_id")
    private PostCodes postCodes;


    public User(){

    }
    public User(Long id, String name, String email){

    }

    public User(Long id, String address, String name, int numberOfBicycles, String startTime, String endTime, String city, PostCodes postCodes) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.numberOfBicycles = numberOfBicycles;
        this.startTime = startTime;
        this.endTime = endTime;
        this.city = city;
        this.postCodes = postCodes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public void setNumberOfBicycles(int numberOfBicycles) {
        this.numberOfBicycles = numberOfBicycles;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PostCodes getPostCodes() {
        return postCodes;
    }

    public void setPostCodes(PostCodes postCodes) {
        this.postCodes = postCodes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", numberOfBicycles=" + numberOfBicycles +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", city='" + city + '\'' +
                ", postCodes=" + postCodes +
                '}';
    }
}