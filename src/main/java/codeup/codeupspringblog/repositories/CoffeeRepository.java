package codeup.codeupspringblog.repositories;


import codeup.codeupspringblog.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
