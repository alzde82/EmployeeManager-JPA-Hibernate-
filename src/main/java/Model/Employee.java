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

public class Employee implements ModelInterface{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String fullName;
    @ManyToOne(cascade= CascadeType.PERSIST)

    private Department department;
    @ManyToMany(mappedBy = "employee",cascade = CascadeType.REMOVE)
    private List<Project>project;

    public Employee(String fullName) {
        this.fullName = fullName;
    }
}
