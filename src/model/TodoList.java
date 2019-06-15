/** TodoList is made up of 2 parts, done and not done.
 * Each part comprises of an array list, a Default list model and a JList.
 * The Array list holds the task objects while the Model and thus JList hold the task label for ui
 * purposes */

package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TodoList
{
    public List<Task> notDone = new ArrayList<Task>();
    public List<Task> done = new ArrayList<Task>();
    public DefaultListModel notDoneModel = new DefaultListModel();;
    public DefaultListModel doneModel = new DefaultListModel();
    public JList notDoneList;
    public JList doneList;

    public TodoList()
    {
        notDoneList = new JList(notDoneModel);
        doneList = new JList(doneModel);
        notDoneList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public  void addTask(String label)
    {
        Task task = new Task(label);
        notDone.add(task);
        notDoneModel.addElement(task.getLabel());
    }
    public void removeTask(int index, DefaultListModel model, List array)
    {
        if (index >=0 && index < array.size())
        {
            array.remove(index);
            model.remove(index);
        }
    }

    public void toggleDone(Task task)
    {
        task.setDone(!task.getDone());
        if (task.getDone())
        {
            done.add(task);
            doneModel.addElement(task.getLabel());
            notDone.remove(task);
            notDoneModel.remove(notDoneList.getSelectedIndex());
        } else {
            notDone.add(task);
            notDoneModel.addElement(task.getLabel());
            done.remove(task);
            doneModel.remove(doneList.getSelectedIndex());
        }

    }
}
