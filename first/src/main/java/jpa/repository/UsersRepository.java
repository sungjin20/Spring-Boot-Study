package jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
