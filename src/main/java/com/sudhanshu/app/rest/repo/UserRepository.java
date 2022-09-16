package com.sudhanshu.app.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhanshu.app.rest.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
