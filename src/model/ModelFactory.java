package model;

/**
 * Creates Model object instances.
 * @author aitor
 */
public class ModelFactory {
    /**
     * Creates an instance of the Model object.
     * @param option Specifies the returned Model instance.
     * @return A Model instance.
     */
    public Model getModel(int option){
        switch(option){
            case 1:
                return new ModelImplementation();
            default:
                return null;
        }
        
    }
}
