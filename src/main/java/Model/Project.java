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
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int projectId;
    private String projectName;
    @ManyToMany
    private List<Employee> employee;



}
