package sigit.nurhanafi.my.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sigit.nurhanafi.my.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
    
}
