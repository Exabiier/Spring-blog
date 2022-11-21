package codeup.codeupspringblog.Model;

import codeup.codeupspringblog.Repository.PostRepository;

import javax.persistence.*;

@Entity
@Table(name="")
public class Post1 {


    private long id;
    private String title;

    private String message;

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
}
