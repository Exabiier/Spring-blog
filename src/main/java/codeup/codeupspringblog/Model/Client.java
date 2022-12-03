package codeup.codeupspringblog.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
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
//@JsonIgnoreType

@Table(name="users")

public class Client {
//    @JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSXXX", locale = "en_SG", timezone = "Asia/Singapore")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(nullable = false, name="username", unique = true)
    @JsonIgnore
    private String username;

    @Column(nullable = false, name="email", length=255)
    @JsonIgnore
    private String email;

    @Column(nullable = false, name="password", length=400 )
    @JsonIgnore
    private String password;

    // Deleting a supplier will cascade to all coffees (and all coffees will be deleted)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @JsonBackReference
    private List<Post1> post;
}
