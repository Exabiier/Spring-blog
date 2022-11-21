package codeup.codeupspringblog.Repository;

import codeup.codeupspringblog.Model.Post1;
import org.springframework.data.jpa.repository.JpaRepository;

// This is where we are able to connect  to the database
public interface PostRepository extends JpaRepository<Post1, Long>{

}
