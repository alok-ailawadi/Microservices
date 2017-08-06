package com.bootcamptech.dao;

import com.bootcamptech.entities.Employee;
import com.sun.xml.internal.ws.message.EmptyMessageImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.sql.rowset.CachedRowSet;
import java.util.List;

/**
 * Created by Alok on 7/31/2017.
 */
@RestResource(path = "employee", rel = "employee")
public interface EmployeeDao extends CrudRepository<Employee, Long>{

    List<Employee> findAll();

}
