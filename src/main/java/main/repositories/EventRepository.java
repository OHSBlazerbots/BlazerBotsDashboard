/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.repositories;

import main.models.Event;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sam
 */
public interface EventRepository extends CrudRepository<Event, Long>{

}
