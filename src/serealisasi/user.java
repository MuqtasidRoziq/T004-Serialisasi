package serealisasi; 
import java.io.Serializable; 
import java.util.List;

public class user implements Serializable{ 
    String username; 
    String password; 
    private List<user> items; 
 
    public user(String user, String pass) { 
        this.username = user; 
        this.password = pass; 
    } 
    
    public user() {
        this.username = "";
        this.password = "";
    }
     
    public void setItems(List<user> items) { 
        this.items = items; 
    } 

 
    @Override 
    public String toString() { 
        return "\r\nNama=" + username + "\r\nHarga=" + password + "\r\n"; 
    }     
}