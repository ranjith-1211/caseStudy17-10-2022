package com.gl.caseStudy.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy.bean.MyUser;


@Repository
public interface UserRepository extends JpaRepository<MyUser, String> {
	 @Query("select max(userId) from MyUser")
		public Long findMaxuserId();
}
