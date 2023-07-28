package sigit.nurhanafi.my.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sigit.nurhanafi.my.employee.entity.Employee;
import sigit.nurhanafi.my.employee.exception.ResourceNotFoundException;
import sigit.nurhanafi.my.employee.repository.EmployeeRepository;
import sigit.nurhanafi.my.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("Employee", "Id", id));
    }
    
    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existEmployee = employeeRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("Employee", "Id", id));

        existEmployee.setName(employee.getName());
        existEmployee.setSalary(employee.getSalary());
        existEmployee.setGradeId(employee.getGradeId());

        return employeeRepository.save(existEmployee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("Employee", "Id", id));
        employeeRepository.deleteById(id);
    }
}
