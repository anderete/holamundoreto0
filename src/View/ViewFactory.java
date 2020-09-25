package View;

public class ViewFactory {
    
    /**
     * 
     * @param option
     * @return 
     */
    public View getView(int option){
        switch(option){
            case 1:
                return new ViewImplementation();
        }
        return null;
        
    }
}
