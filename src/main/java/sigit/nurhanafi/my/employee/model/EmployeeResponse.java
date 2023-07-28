package sigit.nurhanafi.my.employee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {

    private long Id;

    private String name;
    
    private long salary;
    
    private Integer gradeId;
}
