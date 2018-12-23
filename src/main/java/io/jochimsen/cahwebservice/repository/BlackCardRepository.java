package io.jochimsen.cahwebservice.repository;

import io.jochimsen.cahwebservice.entity.BlackCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackCardRepository extends JpaRepository<BlackCard, Long> {
}
