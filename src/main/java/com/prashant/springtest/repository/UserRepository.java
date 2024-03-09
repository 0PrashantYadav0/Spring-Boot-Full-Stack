package com.prashant.springtest.repository;

import com.prashant.springtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
