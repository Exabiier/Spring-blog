package codeup.codeupspringblog.Model;

import codeup.codeupspringblog.Repository.PostRepository;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name="post_table")
public class Post1 {

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
    Users user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Post1() {
    }

    public Post1(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public Post1(long id, String title, String message) {
        this.id = id;
        this.title = title;
        this.message = message;
    }

    public Post1(String title, String message, Users user) {
        this.title = title;
        this.message = message;
        this.user = user;
    }
}
