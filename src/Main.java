import model.TodoList;
import ui.UserInterface;

import javax.swing.*;
import java.awt.*;

public class Main
{

    private static TodoList todo;
    public static void main(String[] args)
    {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);

    }

}
