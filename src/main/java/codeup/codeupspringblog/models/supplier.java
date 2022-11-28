package codeup.codeupspringblog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "suppliers")
public class supplier {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    private String name;

//    the connect between the coffees and supliers
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "supplier")
    private List<Coffee> coffees;

//     getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public supplier() {

    }

    public supplier(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
