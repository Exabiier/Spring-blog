package codeup.codeupspringblog.Repository;

import codeup.codeupspringblog.Model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}
