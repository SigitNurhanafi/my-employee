package sigit.nurhanafi.my.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    
    @Transient
    private static final int MANAGER = 1;

    @Transient
    private static final int SUPERVISOR = 2;

    @Transient
    private static final int STAFF = 3;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private long salary;

    private Integer gradeId;

    @Transient
    public  Long getTotalBonus(){
        if (gradeId == Employee.MANAGER) {
            return (long) (salary + (long) salary * 0.1);
        } else if (gradeId == Employee.SUPERVISOR) {
            return (long) (salary + (long) salary * 0.06);
        } else if (gradeId == Employee.STAFF) {
            return (long) (salary + (long) salary * 0.03);
        } else {
            return salary;
        }
    }
}
