package view;

/**
 * View implementation to show greeting in a text type UI.
 * @author Ander Vicente
 */
public class ViewImplementation implements View {
    /**
     * Shows a greeting in UI.
     * @param greeting A String containing the greeting to be shown.
     */
    @Override
    public void showGreeting (String greeting){
        System.out.print(greeting + "\n");
    }
}
