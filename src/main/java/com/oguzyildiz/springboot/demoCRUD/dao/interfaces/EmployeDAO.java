package com.oguzyildiz.springboot.demoCRUD.dao.interfaces;

import com.oguzyildiz.springboot.demoCRUD.entity.Employee;

import java.util.List;

public interface EmployeDAO {
    List<Employee> findAll();
    Employee findById(Integer id);
    Employee save(Employee employee);
    void delete(Integer id);
}
