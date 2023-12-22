package com.oguzyildiz.springboot.demoCRUD.service.concretes;

import com.oguzyildiz.springboot.demoCRUD.dao.interfaces.EmployeDAO;
import com.oguzyildiz.springboot.demoCRUD.entity.Employee;
import com.oguzyildiz.springboot.demoCRUD.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeDAO employeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeDAO employeDAO) {
        this.employeDAO = employeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeDAO.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeDAO.save(employee);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        employeDAO.delete(id);
    }
}
