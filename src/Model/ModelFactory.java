package Model;

public class ModelFactory {
    public Model getModel(){
        return new ModelImplementation();
    }
}
