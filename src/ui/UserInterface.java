package ui;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UserInterface implements Runnable
{
    private JFrame frame;
    @Override
    public void run()
    {
        // Basic group layout set up shenanigans
        frame = new JFrame("KIP");
        //MODIFIES: This
        //EFFECT: adds all components to container
        Components(frame.getContentPane());

        //setting window size, placing window in center of screen when it starts and making our close button work
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }

    private void Components(Container pane)
    {
        GroupLayout layout = new GroupLayout(pane);
        pane.setLayout(layout);


        // text field were users type in the task
        JTextField field = new JTextField(40);
        //dummy check box to represent task
        JCheckBox dummyTask = new JCheckBox();
        JButton addButton = new JButton("add");

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //When creating a group layout one has to define the horizontal and vertical arrangement
        //setting horizontal layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(field)
                                .addComponent(addButton))
                        .addComponent(dummyTask)
        );

        //setting vertical layout
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(field,30, 30, 30)
                                .addComponent(addButton))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dummyTask)
        );
    }
}
