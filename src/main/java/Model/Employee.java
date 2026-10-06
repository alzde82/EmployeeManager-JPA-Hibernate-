package Model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity

public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String fullName;
    @ManyToOne
    private Department department;
    @ManyToMany(mappedBy = "employee")
    private List<Project>project;


}
