package com.bootcamptech.dao;

import com.bootcamptech.entities.Enterprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Alok on 7/31/2017.
 */
@RestResource(path = "enterprise" , rel = "enterprise")
public interface EnterpriseDao extends CrudRepository<Enterprise, Long>{

    List<Enterprise> findAll();
}
