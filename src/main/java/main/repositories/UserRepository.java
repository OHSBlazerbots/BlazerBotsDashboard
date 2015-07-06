/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.repositories;

import main.models.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sam
 */
public interface UserRepository extends CrudRepository<User, Long>{
    
    List<User> findByUsername(String username);
    List<User> findByEmail(String email);
    List<User> findByPhoneNumber(String phone_number);
}
