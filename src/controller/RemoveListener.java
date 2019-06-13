package controller;

import model.TodoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveListener implements ActionListener
{
    private TodoList todo;

    public RemoveListener(TodoList todo)
    {
        this.todo = todo;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        this.todo.removeTask(this.todo.notDoneList.getSelectedIndex());
    }
}
