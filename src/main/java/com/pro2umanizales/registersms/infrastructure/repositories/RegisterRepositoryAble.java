package com.pro2umanizales.registersms.infrastructure.repositories;

import com.pro2umanizales.registersms.infrastructure.repositories.entities.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepositoryAble extends JpaRepository<Register, Integer> {
}
