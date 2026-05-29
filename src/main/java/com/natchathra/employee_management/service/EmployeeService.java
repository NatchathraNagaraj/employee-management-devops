package com.natchathra.employee_management.service;

import com.natchathra.employee_management.entity.Employee;
import com.natchathra.employee_management.exception.EmployeeNotFoundException;
import com.natchathra.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById( Long id){
        return  employeeRepository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with id " + id
                        ));
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing =
                employeeRepository.findById(id)
                        .orElseThrow(() ->
                                new EmployeeNotFoundException(
                                        "Employee not found with id " + id
                                ));
        if(existing != null){
            existing.setName(employee.getName());
            existing.setEmail(employee.getEmail());
            existing.setDepartment(employee.getDepartment());
            existing.setSalary(employee.getSalary());
            existing.setJoiningDate(employee.getJoiningDate());
            return employeeRepository.save(existing);
        }

        return null;
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
