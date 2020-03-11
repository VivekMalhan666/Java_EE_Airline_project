/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Raghda
 */
public class validation {
    
    public  boolean ValidateLogIn(String email, String Password)
    {
        if(email.isEmpty() || Password.isEmpty())
            return false;
        
        else if(Password.length()<8)
            return false;
      
        return true;      
    }
    public  boolean ValidateSignUp(String FName, String LName, String email, String Password, String Contact) 
    {
        
       
        if(FName.isEmpty() || (LName.isEmpty()) || email.isEmpty() || Password.isEmpty() || Contact.isEmpty()){
            return false;
        }
        else if(FName.length()<3 || LName.length()<3 || ( !(FName.matches("[A-Za-z]+")) || !(LName.matches("[A-Za-z]+"))))
            return false;
        
        else if(Contact.length() >11 || Contact.length() <11 || (!Contact.matches("[0-9]+"))){
            return false;
        }
        else if(Password.length() < 8) 
            return false;

        return true;
    }


}
