package com.poc.repository;

import com.poc.domain.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
