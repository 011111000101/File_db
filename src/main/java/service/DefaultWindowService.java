package service;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DefaultWindowService implements WindowService {

    private final FileHandlerImp fileHandlerImp = new FileHandlerImp();
    private final Crypton crypton = new Crypton();

    @Override
    public JFrame draw(String args) {

        JFrame frame = new JFrame("F16 GPS AUTOMATIC FILLER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310, 730);
        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(40, 30);
        frame.add(textArea);

        JButton loadDb = new JButton("Load db");
        loadDb.addActionListener(e -> loadDb(textArea,args));
        frame.add(loadDb);

        JButton cryptToDb = new JButton("Crypt and save to db");
        cryptToDb.addActionListener(e -> cryptToDb(textArea));
        frame.add(cryptToDb);

        JButton buttonClearMemory = new JButton("CLR Mem");
        //buttonClearMemory.addActionListener();
        frame.add(buttonClearMemory);

        frame.setVisible(true);


        return frame;
    }
    private void cryptToDb(JTextArea textArea) {
        List<String> list = new ArrayList<>();
        list.add(textArea.getText().);
        System.out.println("prdel");
    }

    private void loadDb(JTextArea textArea, String args) {
        List<String> list = fileHandlerImp.fileToList(args);
        list.forEach(x -> textArea.append(x + "\n"));
    }

    private void clrMemory () {

    }

}
