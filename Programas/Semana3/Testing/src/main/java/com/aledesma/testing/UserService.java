package com.aledesma.testing;

//Este es el service que vamos a consumir, posiblemente desde el controller
public class UserService {

    public UserEntity findUserById(int id){
        return UserRepository.findById(id);
    }

    public UserEntity createUser(String username, String password, String role, boolean active){
        UserEntity userEntity = new UserEntity(null,username, password, role, active);
        return UserRepository.save(userEntity);
    }

    public UserEntity updateUser(Integer id,String username, String password, String role, boolean active){
        UserEntity userEntity = new UserEntity(id,username, password, role, active);
        return UserRepository.save(userEntity);
    }

    public void deleteUserById(Integer id){
        UserRepository.deleteById(id);
    }
}
