package sigit.nurhanafi.my.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sigit.nurhanafi.my.employee.model.CreateEmployeeRequest;
import sigit.nurhanafi.my.employee.model.WebResponse;
import sigit.nurhanafi.my.employee.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(
        path = "/api/employees", 
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> create(@RequestBody CreateEmployeeRequest request){
         employeeService.create(request);
         return WebResponse.<String>builder().data("OK").build();
    }
}
