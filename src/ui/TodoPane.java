package ui;

import model.TodoList;

import javax.swing.*;
import java.awt.*;

public class TodoPane extends JPanel {
    private TodoList todo;

    public TodoPane(TodoList todo)
    {
        super (new GridLayout(1,1));
        this.todo = todo;

        JTabbedPane tabbedPane = new JTabbedPane();
        JScrollPane notDonePane = new JScrollPane(todo.notDoneList);
        JScrollPane donePane = new JScrollPane(todo.doneList);

        tabbedPane.addTab("Tasks", notDonePane);
        tabbedPane.addTab("Completed", donePane);

        add(tabbedPane);
    }
}
