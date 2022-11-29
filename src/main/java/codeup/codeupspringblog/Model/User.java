package codeup.codeupspringblog.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
public class User {

//    how to use column definition in @column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name="username", unique = true)
    private String username;

    @Column(nullable = false, name="email", length=255)
    private String email;

    @Column(nullable = false, name="password", length=400 )
    private String password;

    // Deleting a supplier will cascade to all coffees (and all coffees will be deleted)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @JsonBackReference
    private List<Post1> post;



//    /////////  Getters & Setters  ////////////


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(long id) {
        this.id = id;
    }

//    //////////  Cunstructor  //////////
    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
