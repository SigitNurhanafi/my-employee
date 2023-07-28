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
        employee.setTotalBonus(calculateTotalBonus(employee.getGradeId(), employee.getSalary()));
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        for (int i = 0; i < employees.size(); i++) {
            long totalBonus = this.calculateTotalBonus(employees.get(i).getGradeId(), employees.get(i).getSalary());
            employees.get(i).setTotalBonus(totalBonus);
        }

        return employees;
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> 
						new ResourceNotFoundException("Employee", "Id", id));
    }
    
    protected Long calculateTotalBonus(int gradeCode, long salary){
        switch (gradeCode) {
            case 1:
                    return (long) (salary + (long) salary * 0.1);
            case 2:
                    return (long) (salary + (long) salary * 0.06);
            case 3:
                    return (long) (salary + (long) salary * 0.03);
            default:
                    return salary;
        }
    }

    // @Override
    // public Employee updateEmployee(Employee employee, long id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    // }

    // @Override
    // public void deleteEmployee(long id) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
    // }
}
