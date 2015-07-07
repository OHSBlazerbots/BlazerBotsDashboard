/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.repositories;

import main.models.UserPrivilege;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sam
 */
public interface UserPrivilegeRepository extends CrudRepository<UserPrivilege, Long>{

}
