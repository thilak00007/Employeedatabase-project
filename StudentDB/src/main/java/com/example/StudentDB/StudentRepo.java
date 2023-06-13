package com.example.StudentDB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface StudentRepo extends JpaRepository<Student, Integer>{
	@Query(value="select * from Student where designation=?1",nativeQuery=true)
	List<Student> findBytecher(String techer);
	@Query(value="select * from student where fees<=?1",nativeQuery=true)

	List<Student> empByFees(Double fees);
}
