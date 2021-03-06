package com.winpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.winpoint.model.StudentCourseDetails;

public interface StudentCourseDetailsRepository extends JpaRepository<StudentCourseDetails, Integer>{

	@Query("FROM StudentCourseDetails a WHERE mappingUserProfile.userId = ?1 AND mappingStreams.streamId = ?2 AND mappingCourseType.courseTypeId = ?3")
	List<StudentCourseDetails> findByUserId(Integer userId, Integer streamId, Integer courseTypeId);

	@Query("FROM StudentCourseDetails a WHERE mappingUserProfile.userId = ?1")
	List<StudentCourseDetails> findByUserId(Integer userId);
	
//	void save(Integer userId, Integer courseId, String feeStatus);
	
}
