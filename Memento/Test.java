package Patterns.Memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {


    public static void main(String[] args){

        new Test();

    }

    private JButton saveButton,undoButton,redoButton;
    private JTextArea theArticle= new JTextArea(40,60);

    Caretaker caretaker= new Caretaker();
    Originator originator = new Originator();

    int saveFile=0,currentArticle=0;

    public Test(){

        this.setSize(750,780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel1= new JPanel();
        JPanel panel= new JPanel();
        panel.add(new JLabel("Article"));

        panel1.add(theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();


        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);


        panel1.add(saveButton);
        panel1.add(undoButton);
        panel1.add(redoButton);

        this.add(panel);
        this.add(panel1);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == saveButton){

                String textIn=theArticle.getText();
                originator.set(textIn);

                caretaker.addMemento(originator.storeInMemento());

                saveFile++;
                currentArticle++;

                System.out.println("Save Files "+saveFile);

                undoButton.setEnabled(true);
            }else if(e.getSource() == undoButton){

                if(currentArticle >=1){

                    currentArticle--;
                    String textBoxString= originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                    theArticle.setText(textBoxString);

                    redoButton.setEnabled(true);
                }else{

                    undoButton.setEnabled(false);
                }


            }else if(e.getSource() == redoButton){

                if((saveFile -1) > currentArticle){


                    currentArticle++;

                    String textBoxString= originator.restoreFromMemento(caretaker.getMemento(currentArticle));

                    theArticle.setText(textBoxString);

                    undoButton.setEnabled(true);
                }else{

                    redoButton.setEnabled(false);
                }

            }
        }
    }
}
