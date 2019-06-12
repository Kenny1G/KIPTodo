package ui;

import controller.AddListener;
import controller.DoneListener;
import controller.RemoveListener;
import model.TodoList;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable
{
    private JFrame frame;
    private TodoList todo = new TodoList();

    public UserInterface()
    {

    }

    @Override
    public void run()
    {
        // Basic group layout set up shenanigans
        frame = new JFrame("KIP");

        //MODIFIES: frame
        //EFFECT: adds all components to container
        Components(frame.getContentPane());

        //setting window size, placing window in center of screen when it starts and making our close button work
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }

    private void Components(Container container)
    {
        //setting our layout
        GroupLayout layout = new GroupLayout(container);
        container.setLayout(layout);

        //Making our components
        JTextField field = new JTextField(40);
        JScrollPane dummyTask = new JScrollPane(todo.finalList);
        JButton addButton = new JButton("add");
        JButton removeButton = new JButton("remove");
        JButton doneButton = new JButton("done");

        //event listeners
        AddListener addListener = new AddListener(todo,field);
        addButton.addActionListener(addListener);

        RemoveListener removeListener = new RemoveListener(todo);
        removeButton.addActionListener(removeListener);

        DoneListener doneListener = new DoneListener(todo);
        doneButton.addActionListener(doneListener);

        //It's not you it's me I just need some space
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //When creating a group layout one has to define the horizontal and vertical arrangement
        //setting horizontal layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(field)
                                .addComponent(addButton)
                                .addComponent(removeButton)
                                .addComponent(doneButton))
                        .addComponent(dummyTask)
        );

        //setting vertical layout
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(field,30, 30, 30)
                                .addComponent(addButton)
                                .addComponent(removeButton)
                                .addComponent(doneButton))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dummyTask)
        );
    }
}
