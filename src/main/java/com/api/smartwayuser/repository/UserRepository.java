package com.api.smartwayuser.repository;

import com.api.smartwayuser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUserId(Long userId);
}
