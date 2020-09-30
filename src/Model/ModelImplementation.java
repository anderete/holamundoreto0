package Model;

import control.DAO;

public class ModelImplementation implements Model {
   @Override
    public String getGreeting (){
        DAO dao = new DAO();
        
        return dao.getGreetingBD();
    }
}
