/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sam
 */
public interface CarrierRepository extends CrudRepository<Carrier, Long>{
    List<Carrier> findByName(String name);
}
