package codeup.codeupspringblog.Repository;

import codeup.codeupspringblog.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
