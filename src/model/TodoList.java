package model;

import model.Task;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoList
{

    public List<Task> notDone = new ArrayList<Task>();
    public List<Task> Done = new ArrayList<Task>();
    public DefaultListModel listModel;
    public JList finalList;

    public TodoList()
    {
        listModel = new DefaultListModel();
        finalList = new JList(listModel);
        finalList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public  void addTask(String label)
    {
        Task task = new Task(label);
        notDone.add(task);
        listModel.addElement(task.getLabel());
    }
    public void removeTask(int index)
    {
        notDone.remove(index);
        listModel.remove(index);
    }

    public void toggleDone(Task task)
    {
        task.setDone(!task.getDone());
        notDone.remove(task);
        Done.add(task);

    }

//    public void displayTodos()
//    {
//        for(Task task : notDone)
//        {
//            System.out.println(task.getLabel());
//            System.out.println(task.getDone());
//        }
//    }
}
