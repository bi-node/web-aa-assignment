package com.binode.lab4.repository;

import com.binode.lab4.entity.Exception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionRepository extends JpaRepository<Exception,Long> {
}
