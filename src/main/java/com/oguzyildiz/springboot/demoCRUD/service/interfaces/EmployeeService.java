package com.oguzyildiz.springboot.demoCRUD.service.interfaces;

import com.oguzyildiz.springboot.demoCRUD.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Integer id);
    Employee save(Employee employee);
    void delete(Integer id);
}
