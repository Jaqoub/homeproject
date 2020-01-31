package com.bikecom.demo.model;


import javax.persistence.*;

@Entity
public class Bicycle {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
    private int numberOfBicycles;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "postcode_id")
    private PostCodes postCodes;


 public Bicycle() {

 }

 public Bicycle(String name, String city, int numberOfBicycles, PostCodes postCodes) {
  this.name = name;
  this.city = city;
  this.numberOfBicycles = numberOfBicycles;
  this.postCodes = postCodes;
 }

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

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public int getNumberOfBicycles() {
  return numberOfBicycles;
 }

 public void setNumberOfBicycles(int numberOfBicycles) {
  this.numberOfBicycles = numberOfBicycles;
 }

 public PostCodes getPostCodes() {
  return postCodes;
 }

 public void setPostCodes(PostCodes postCodes) {
  this.postCodes = postCodes;
 }
}
