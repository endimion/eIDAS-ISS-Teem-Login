/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.swellrt.pojo;

import java.util.Map;

/**
 *
 * @author nikos
 */
public class UserCredentials {
 
    private String username;
    private String password;
    private String email;
    private String status;
     private Map<String, ReceivedStorkAttribute> attributes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, ReceivedStorkAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, ReceivedStorkAttribute> attributes) {
        this.attributes = attributes;
    }
    
    
    
    
}
