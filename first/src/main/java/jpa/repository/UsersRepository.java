package jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpa.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	
}
