package sigit.nurhanafi.my.employee.model;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {
    @NotBlank
    private String name;
    
    @NotNull
    @Range(min=1000)
    private long salary;

    @NotNull
    @Range(min=1)
    private Integer gradeId;
}
