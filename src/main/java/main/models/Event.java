/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sam
 */
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue
    long id;
    @Column
    String name;
    @Column
    String location;
    @Column
    String start;
    @Column
    String end;
    @Column
    String description;
    @Column
    long number_of_people;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", location=" + location + ", start=" + start + ", end=" + end + ", description=" + description + ", number_of_people=" + number_of_people + '}';
    }

    public Event(String name, String location, String start, String end, String description, long number_of_people) {
        this.name = name;
        this.location = location;
        this.start = start;
        this.end = end;
        this.description = description;
        this.number_of_people = number_of_people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNumber_of_people() {
        return number_of_people;
    }

    public void setNumber_of_people(long number_of_people) {
        this.number_of_people = number_of_people;
    }
    
    
}
