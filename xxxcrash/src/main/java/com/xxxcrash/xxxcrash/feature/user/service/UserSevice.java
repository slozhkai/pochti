package com.xxxcrash.xxxcrash.feature.user.service;

import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOReceive;
import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOResponce;
import org.springframework.stereotype.Service;

@Service
public interface UserSevice {

    UserDTOResponce registerUser(UserDTOResponce userDTOResponce);

    UserDTOResponce authUser(UserDTOReceive userDTOReceive);

    String deleteUser(Long id_user);

}
