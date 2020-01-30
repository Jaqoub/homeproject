package com.bikecom.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Bicycle {

   @Id
    private Long id;
    private String name;
    private String city;
    @ManyToMany(cascade = CascadeType.ALL)
    private PostCodes postCodes;
    @JsonManagedReference
    private List<Bicycle> assignedBicycle;
    private int numberOfBicycles;


    public Bicycle(PostCodes postCodes){
     this.postCodes = postCodes;
    }

    public Bicycle(Long id, String name, List<Bicycle> assignedBicycle, PostCodes postCodes){
     this.postCodes = postCodes;
    }

    public List<Bicycle> getAssignedBicycle(){return assignedBicycle;}

    public void setAssignedBicycle(List<Bicycle> assignedBicycle){this.assignedBicycle = assignedBicycle;}

    public int getNumberOfBicycles(){return numberOfBicycles;}

    public void setNumberOfBicycles(int numberOfBicycles){this.numberOfBicycles = numberOfBicycles;}


 @Override
 public String toString() {
  return "Bicycle{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", assignedBicycle=" + assignedBicycle +
          ", numberOfBicycles=" + numberOfBicycles +
          '}';
 }
}
