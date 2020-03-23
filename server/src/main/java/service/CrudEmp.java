package service;
import javax.jws.WebService;
import java.util.*;
import javax.jws.*;
import javax.jws.soap.*;
@WebService
public class CrudEmp {
    Dao dao=new Dao();

    public User showUser(int id){
        
        return dao.showUsers(id);
            
    }
     public String updateUser(User user){
        boolean flag=dao.updateUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row update";
        } 
    }
       public String addUser(User user){
        boolean flag=dao.insertUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row added";
        } 
    }
      public String deleteUser(User user){
        boolean flag=dao.deleteUser(user);
        if(flag){
            return "row add";
        }else{
            return "no row added";
        } 
    }
}
    

