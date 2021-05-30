package library;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import static library.WestminsterLibraryManager.obj1;

public class Library_gui extends JPanel {

    WestminsterLibraryManager west=obj1;
    JTable jt;
    JButton jb;
    GridBagConstraints gbc=new GridBagConstraints();
    JPanel jp=new JPanel();



    public Library_gui(List<LibraryItem> books){
        ImageIcon icon=new ImageIcon("image.jpg");

        jp.setLayout(new GridLayout(2,1,5,10));
        jb=new JButton("Search");
        jp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        jp.add(jb);
        add(jp);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_gui sc=new Search_gui();
            }
        });

        String[] colomn={"ISBN","Title","Availability"};
        Object [][] data= new String[books.size()][3];

        for(int i=0;i<books.size();i++){

                data[i][0] = books.get(i).getISBN();
                data[i][1] = books.get(i).getTitle();
                if(west.checkAvailablity(books.get(i).getISBN())){
                    data[i][2] = "available";
                   // Arrays.fill(data[i][2],icon);
                }else{
                    data[i][2] = "not available";
                }
        }


        DefaultTableModel model=new DefaultTableModel(data,colomn);
        jt= new JTable(model){
            public boolean isCellEditable(int data,int col){
                return false;
            }
        };

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.0;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        jp.add(jt, gbc);
        add(jp);

        JScrollPane jsp=new JScrollPane(jt);
        jt.setPreferredScrollableViewportSize(new Dimension(500,50 ));
        jt.setFillsViewportHeight(true);
       // jt.getColumn("Availability").setCellRenderer(new LableRender());
        jsp.setVisible(true);
        add(jsp);

    }
}
