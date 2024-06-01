package com.binode.midtermmocktest.Repository;

import com.binode.midtermmocktest.model.Course_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepository extends JpaRepository <Course_Details,Long> {
}
