package com.oguzyildiz.springboot.demoCRUD.dao.concretes;

import com.oguzyildiz.springboot.demoCRUD.dao.interfaces.EmployeDAO;
import com.oguzyildiz.springboot.demoCRUD.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeDAO {

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee ",Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class,id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee emp = entityManager.merge(employee);
        return emp;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Employee emp = entityManager.find(Employee.class,id);
        entityManager.remove(emp);
    }
}
