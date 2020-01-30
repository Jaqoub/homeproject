package com.bikecom.demo.repository;

import com.bikecom.demo.model.Bicycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BicycleRepository extends CrudRepository<Bicycle, Long> {

    List<Bicycle> findAll();
}
