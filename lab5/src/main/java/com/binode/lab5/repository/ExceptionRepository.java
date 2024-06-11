package com.binode.lab5.repository;

import com.binode.lab5.entity.Exception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionRepository extends JpaRepository<Exception,Long> {
}
