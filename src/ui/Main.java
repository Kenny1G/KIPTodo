package ui;

import model.TodoList;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        super("KIP");
        initUI();
    }
    // All necessary ui setups.
     private void initUI(){
        // Basic group layout set up shenanigans
        Container pane = getContentPane();
        GroupLayout layout = new GroupLayout(pane);
        pane.setLayout(layout);


        // text field were users type in the task
        JTextField field = new JTextField(15);
        //dummy check box to represent task
         JCheckBox dummyTask = new JCheckBox("this is a dummy task its like a normal task but with dummy in it");

         layout.setAutoCreateGaps(true);
         layout.setAutoCreateContainerGaps(true);

        //When creating a group layout one has to define the horizontal and vertical arrangement
         //setting horizontal layout
         layout.setHorizontalGroup(
                 layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(field)
                    .addComponent(dummyTask)

         );

         //setting vertical layout
         layout.setVerticalGroup(
                 layout.createSequentialGroup()
                    .addComponent(field,30, 30, 30 )
                         .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dummyTask)
         );

         //setting window size, placing window in center of screen when it starts and making our close button work
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

     }
    public static void main(String[] args) {
        // threading to get it all running properly
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame finale = new Main();
                finale.setVisible(true);
            }
        });

    }

}
