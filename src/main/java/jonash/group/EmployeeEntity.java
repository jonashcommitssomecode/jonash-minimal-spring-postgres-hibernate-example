package jonash.group;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer someId;

    @Lob
    @Type(type = "org.hibernate.type.MaterializedBlobType")
    private byte[] byteArray;

    private String someString;

    private Date someDate;

    // Hibernate expects entities to have a no-arg constructor,
    // though it does not necessarily have to be public.
    private EmployeeEntity() {}

    public EmployeeEntity(String someString, Date someDate, byte[] data) {
        this.someString = someString;
        this.someDate = someDate;
        this.byteArray = data;
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

    public byte[] getSomeByte() {
        return this.byteArray;
    }

}