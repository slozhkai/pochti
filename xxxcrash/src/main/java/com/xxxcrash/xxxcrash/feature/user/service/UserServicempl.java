package com.xxxcrash.xxxcrash.feature.user.service;


import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOReceive;
import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOResponce;
import com.xxxcrash.xxxcrash.feature.user.entity.UserEntity;
import com.xxxcrash.xxxcrash.feature.user.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServicempl implements UserSevice {
    private final UserRepository repository;

    public UserServicempl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDTOResponce registerUser(UserDTOResponce userDTOResponce) {
        if (repository.findByEmail(userDTOResponce.getEmail()) == null) {
            repository.save(new UserEntity(
                    userDTOResponce.getId(),
                    userDTOResponce.getLogin(),
                    userDTOResponce.getEmail(),
                    userDTOResponce.getPassword(),
                    userDTOResponce.getDate(),
                    userDTOResponce.getBalance()
            ));
            return repository.findByEmail(userDTOResponce.getEmail());
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User is already exist!");
        }
    }

    @Override
    public UserDTOResponce authUser(UserDTOReceive userDTOReceive) {
        UserDTOResponce user = repository.findByEmail(userDTOReceive.getEmail());
        if (user != null && user.getPassword().equals(userDTOReceive.getPassword())) {
            return user;
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Invalid email or password");
        }
    }

    @Override
    public String deleteUser(Long id) {
        repository.deleteById(id);
        return "User" + id + " deleted";
    }
}
