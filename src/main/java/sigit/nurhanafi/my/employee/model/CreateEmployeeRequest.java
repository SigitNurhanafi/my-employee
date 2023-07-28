package sigit.nurhanafi.my.employee.model;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateEmployeeRequest {
    @NotBlank
    private String name;
    
    @NotNull
    @Range(min=1000)
    private Long salary;

    @NotNull
    @Range(min=1)
    private Integer gradeId;
}
