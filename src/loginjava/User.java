/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    //CRONOS TEK///
 */
package loginjava;

/**
 *
 * @author noemi.oliveira
 */
public class User {
    
    String name;
    String password;
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean validatePassword() {
        
        String nameExampleBD = "Paulo";
        String passwordExampleBD = "123456789";
        
        if(name.equalsIgnoreCase(nameExampleBD) && password.equalsIgnoreCase(passwordExampleBD)){
            return true;
        }else{
            return false;
        }
    }
    
}
