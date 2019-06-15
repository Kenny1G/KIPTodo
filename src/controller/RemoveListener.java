package controller;

import model.TodoList;
import ui.TodoPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveListener implements ActionListener
{
    private TodoList todo;
    private TodoPane pane;

    public RemoveListener(TodoList todo, TodoPane pane)
    {
        this.todo = todo;
        this.pane = pane;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        int paneIndex = pane.tabbedPane.getSelectedIndex();
        if (paneIndex == 0)
        {
            this.todo.removeTask(this.todo.notDoneList.getSelectedIndex(), this.todo.notDoneModel, this.todo.notDone);
        } else {
            this.todo.removeTask(this.todo.doneList.getSelectedIndex(), this.todo.doneModel, this.todo.done);
        }
    }
}
