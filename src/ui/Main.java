package ui;

import model.TodoList;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        // threading to get it all running properly
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);

    }

}
