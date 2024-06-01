package com.binode.mocktest.repository;


import com.binode.mocktest.model.Course_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepository extends JpaRepository<Course_Details,Long> {
}
