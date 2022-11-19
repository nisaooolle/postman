package com.table.hindu.repository;


import com.table.hindu.model.Hindu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HinduRepository extends JpaRepository<Hindu, Long> {
    void deleteHinduById(Long id);
}
