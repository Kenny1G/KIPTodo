package controller;

import model.TodoList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddListener implements ActionListener
{
    private JTextField taskField;
    private TodoList todo;

    public AddListener(TodoList todo, JTextField taskField)
    {
        this.taskField = taskField;
        this.todo = todo;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        this.todo.addTask(this.taskField.getText().trim());
        this.taskField.setText("");

    }
}
