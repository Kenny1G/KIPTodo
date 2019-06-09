package controller;

import model.TodoList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveListener implements ActionListener {
    private TodoList todo;
    private JList list;

    public RemoveListener(TodoList todo, JList list)
    {
        this.todo = todo;
        this.list = list;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int index = this.list.getSelectedIndex();
        this.todo.removeTask(index);
    }
}
