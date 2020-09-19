package user;

import persistence.Store;

public class Controller {
    public static Model login(String username, String password){
        Model actualUser = Store.getOne(username);
        if(actualUser.getPassword().equals(password)){
            System.out.println("Sesión iniciada");
            return actualUser;
        }else{
            //error
        }
        return null;
    }
}
