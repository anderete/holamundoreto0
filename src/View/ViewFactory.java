package View;

public class ViewFactory {
    
    public View getView(){
        return new ViewImplementation();
    }
}
