package jonash.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("/")
public class MyRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public Iterable<EmployeeEntity> myCustomHandler() {
        Date date = new Date();
        EmployeeEntity em = new EmployeeEntity("someStringContent", date);
        employeeRepository.save(em);
        System.out.println("Following entity stuff saved to DB. See Browser response.");
        return this.employeeRepository.findAll();
    }
}