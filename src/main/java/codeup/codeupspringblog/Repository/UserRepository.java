package codeup.codeupspringblog.Repository;

import codeup.codeupspringblog.Model.Post1;
import codeup.codeupspringblog.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);
}
