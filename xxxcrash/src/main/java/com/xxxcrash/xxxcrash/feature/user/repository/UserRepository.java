package com.xxxcrash.xxxcrash.feature.user.repository;


import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOResponce;
import com.xxxcrash.xxxcrash.feature.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserDTOResponce findByEmail(String email);

}
