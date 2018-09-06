package org.com.cay.spring.boot.repository;

import org.com.cay.spring.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cay on 2018/5/17.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
