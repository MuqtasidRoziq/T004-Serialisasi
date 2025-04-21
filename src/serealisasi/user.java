package serealisasi; 
import java.io.Serializable; 

public class user implements Serializable{ 
    String username; 
    String password; 
 
    public user(String user, String pass) { 
        this.username = user; 
        this.password = pass; 
    } 
 
    @Override 
    public String toString() { 
        return "\r\nNama=" + username + "\r\nHarga=" + password + "\r\n"; 
    }     
}