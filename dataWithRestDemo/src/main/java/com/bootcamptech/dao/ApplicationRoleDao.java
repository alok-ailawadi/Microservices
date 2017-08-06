package com.bootcamptech.dao;

import com.bootcamptech.entities.ApplicationRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Alok on 7/31/2017.
 */
@RestResource(path = "applicationRole" , rel = "applicationRole" )
public interface ApplicationRoleDao extends CrudRepository<ApplicationRole, Long>{

    List<ApplicationRole> findAll();
}
