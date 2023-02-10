package service;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DefaultWindowService implements WindowService {

    private final FileHandlerImp fileHandlerImp = new FileHandlerImp();

    @Override
    public JFrame draw(String args) {

        JFrame frame = new JFrame("F16 GPS AUTOMATIC FILLER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310, 730);
        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(40, 30);
        frame.add(textArea);

        JButton buttonFillGps = new JButton("Load db");
        buttonFillGps.addActionListener(e -> loadDb(textArea,args));
        frame.add(buttonFillGps);

        JButton buttonDelete = new JButton("Delete GPS");
        //buttonDelete.addActionListener();
        frame.add(buttonDelete);

        JButton buttonClearMemory = new JButton("CLR Mem");
        //buttonClearMemory.addActionListener();
        frame.add(buttonClearMemory);

        frame.setVisible(true);


        return frame;
    }
    private void load() {

    }

    private void loadDb(JTextArea textArea, String args) {
        List<String> list = fileHandlerImp.fileToList(args);
        list.forEach(x -> textArea.append(x + "\n"));
    }

    private void clrMemory () {

    }

}
