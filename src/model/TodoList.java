package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TodoList
{

    //TodoList is a arraylist of task objects and a default list model used to
    // show the list in our user interface
    public List<Task> notDone = new ArrayList<Task>();
    public List<Task> done = new ArrayList<Task>();
    public DefaultListModel notDoneModel;
    public DefaultListModel doneModel;
    public JList finalList;

    public TodoList()
    {
        notDoneModel = new DefaultListModel();
        doneModel = new DefaultListModel();
        finalList = new JList(notDoneModel);
        finalList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public  void addTask(String label)
    {
        Task task = new Task(label);
        notDone.add(task);
        notDoneModel.addElement(task.getLabel());
    }
    public void removeTask(int index)
    {
        if (index >=0 && index < notDone.size())
        {
            notDone.remove(index);
            notDoneModel.remove(index);
        }

    }

    public void toggleDone(Task task)
    {
        task.setDone(!task.getDone());
        if (task.getDone())
        {
            // when task is done add it to done list
            done.add(task);
            doneModel.addElement(task.getLabel());
            // and remove it from notDone list
            notDone.remove(task);
            notDoneModel.remove(finalList.getSelectedIndex());

        }
        else {
            // reverse for when task is undone
            notDone.add(task);
            notDoneModel.addElement(task.getLabel());
            done.remove(task);
            doneModel.remove(finalList.getSelectedIndex());

        }


    }
}
