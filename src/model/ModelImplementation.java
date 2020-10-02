package model;

import control.DAO;

/**
 * Model implementation that accesses a DB to get a greeting
 * @author aitor
 */
public class ModelImplementation implements Model {
    
    /**
     * Accesses a DB to get a greeting
     * @return A greeting
     */
   @Override
    public String getGreeting (){
        DAO dao = new DAO();
        
        return dao.getGreeting();
    }
}
