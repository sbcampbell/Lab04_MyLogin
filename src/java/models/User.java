/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author 816590
 */
public class User implements Serializable {
    private String username;
    private String password;
    
    public User(){
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    
}
