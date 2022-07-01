package com.railnavigator.demo.pgrepositories;

import com.railnavigator.demo.pgmodels.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	Users getUsersByUserId(Long userId);

}
