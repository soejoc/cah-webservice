package io.jochimsen.cahwebservice.repository;

import io.jochimsen.cahwebservice.entity.WhiteCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhiteCardRepository extends JpaRepository<WhiteCard, Long> {
}
