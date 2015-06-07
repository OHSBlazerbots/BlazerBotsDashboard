/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

/**
 *
 * @author Sam
 */
public class CustomPasswordEncoder extends ShaPasswordEncoder{
    private String salt;
    
    public CustomPasswordEncoder(String salt){
        this.salt = salt;
    }
    
    @Override
    public String encodePassword(String raw, Object salt){
        return super.encodePassword(raw, this.salt);
    }
}
