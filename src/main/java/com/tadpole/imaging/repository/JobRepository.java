package com.tadpole.imaging.repository;

import com.tadpole.imaging.domain.Job;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Job entity.
 */
public interface JobRepository extends JpaRepository<Job,Long> {

}
