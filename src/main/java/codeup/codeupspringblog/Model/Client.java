package codeup.codeupspringblog.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class Client {

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
}
