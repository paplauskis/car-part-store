package org.carpartstore.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Integer> {
}
