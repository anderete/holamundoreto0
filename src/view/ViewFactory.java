package view;

/**
 * Creates View object instances.
 * @author aitor
 */
public class ViewFactory {
    
    /**
     * Creates an instance of the object View.
     * @param option Specifies the returned View instance.
     * @return A View instance.
     */
    public View getView(int option){
        switch(option){
            case 1:
                return new ViewImplementation(); //Text UI
            case 2:
                return new ViewImplementationGUI(); //GUI
            default:
                return null;
        }
        
    }
}
