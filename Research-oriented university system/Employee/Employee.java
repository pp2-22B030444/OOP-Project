/*НЕ ЗАКОНЧЕНА!!!*/ 
 
package Employee; 
import java.io.*;

public abstract class Employee extends User implements Message, Serializable{ 
  
 private String id; 
  
 public Employee(){ 
   
 } 
 
  public Employee(String name, String surname, String birthDate, String phoneNumber, String login, String password) { 
         super(name, surname, birthDate, phoneNumber, login, password); 
          this.id = id;
     } 
 
  
  
    public void sendMessage(String message) { 
        System.out.println("Sending message: " + message); 
        /*Логика нужна*/ 
    } 
 
    public void makeRequest(String request) { 
        System.out.println("Making request: " + request); 
        /*Логика нужна*/ 
    } 
 
    public void makeOrder(String order) { 
        System.out.println("Making order: " + order); 
        /*Логика нужна*/ 
    } 
 
 
 @Override 
 public String toString() { 
  return "Employee [id=" + id + ", fullName=" + fullName + "]"; 
 } 
 
 
 
  
  
}
