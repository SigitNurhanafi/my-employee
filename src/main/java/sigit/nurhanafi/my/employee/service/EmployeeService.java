package sigit.nurhanafi.my.employee.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import sigit.nurhanafi.my.employee.entity.Employee;
import sigit.nurhanafi.my.employee.model.CreateEmployeeRequest;
import sigit.nurhanafi.my.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Validator validator;

    public void create(CreateEmployeeRequest request){
        Set<ConstraintViolation<CreateEmployeeRequest>> constraintViolations = validator.validate(request);
        if (constraintViolations.size() != 0) {
            throw new ConstraintViolationException(constraintViolations);
        }

        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setGradeId(request.getGradeId());
        employee.setSalary((Long) request.getSalary());
        
        employeeRepository.save(employee);
    }
}
