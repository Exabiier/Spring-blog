package codeup.codeupspringblog.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.jfr.ContentType;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="post_table")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String message;

    @ManyToOne
//    @JoinColumn(name="user_id")
    @JsonManagedReference
    User user;
}
