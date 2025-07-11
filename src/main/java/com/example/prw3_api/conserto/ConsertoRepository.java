package com.example.prw3_api.conserto;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsertoRepository extends JpaRepository<Conserto, Long> {

    List<Conserto> findAllByAtivoTrue();
}
