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

public class Department implements ModelInterface{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;
    @OneToMany(mappedBy ="department",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Employee> employee;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
}
