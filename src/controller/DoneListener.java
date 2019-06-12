package controller;

import model.TodoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoneListener implements ActionListener
{
    TodoList todo;
    public DoneListener(TodoList todo)
    {
        this.todo = todo;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        this.todo.toggleDone(todo.notDone.get(this.todo.finalList.getSelectedIndex()));
    }
}
