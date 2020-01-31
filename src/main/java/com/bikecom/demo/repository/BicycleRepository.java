package com.bikecom.demo.repository;

import com.bikecom.demo.model.Bicycle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BicycleRepository extends CrudRepository<Bicycle, Long> {

}
