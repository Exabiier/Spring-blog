package codeup.codeupspringblog.repositories;

import codeup.codeupspringblog.models.supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface supplierRepository extends JpaRepository<supplier, Long> {
}
