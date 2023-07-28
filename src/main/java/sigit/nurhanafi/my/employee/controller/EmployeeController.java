package sigit.nurhanafi.my.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sigit.nurhanafi.my.employee.entity.Employee;
import sigit.nurhanafi.my.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}


    // @PostMapping(
    //     path = "/api/employees", 
    //     consumes = MediaType.APPLICATION_JSON_VALUE, 
    //     produces = MediaType.APPLICATION_JSON_VALUE
    // )
    // public WebResponse<String> create(@RequestBody EmployeeRequest request){
    //      employeeService.saveEmployee(request);
    //      return WebResponse.<String>builder().data("OK").build();
    // }

    // @GetMapping(
    //         path = "/api/employees/{employeeId}",
    //         produces = MediaType.APPLICATION_JSON_VALUE
    // )
    // public WebResponse<String> getEmployeeById(@PathVariable("employeeId") long employeeId) {
    //     return WebResponse.<String>builder().data(Long.toString(employeeId)).build();
    // }

}
