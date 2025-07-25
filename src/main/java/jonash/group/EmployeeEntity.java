package jonash.group;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer someId;

    private String someString;

    private Date someDate;

    // Hibernate expects entities to have a no-arg constructor,
    // though it does not necessarily have to be public.
    private EmployeeEntity() {}

    public EmployeeEntity(String someString, Date someDate) {
        this.someString = someString;
        this.someDate = someDate;
    }

    public Integer getSomeId() {
        return this.someId;
    }

    public String getSomeString() {
        return this.someString;
    }

    public Date getSomeDate() {
        return this.someDate;
    }
}