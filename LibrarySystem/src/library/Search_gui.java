package library;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static library.WestminsterLibraryManager.books;
import static library.WestminsterLibraryManager.obj1;

public class Search_gui {
    GridBagConstraints gbc=new GridBagConstraints();

     JPanel panel1=new JPanel();
     private String myString;

     WestminsterLibraryManager west=obj1;

    public Search_gui(){
          panel1.setLayout(new GridBagLayout()) ;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.ipady = 10;
        gbc.ipadx = 10;

        JFrame jFrame=new JFrame();
        jFrame.setTitle("Library Management System");
        jFrame.setSize(950,1000);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JButton jButton=new JButton("Search");
        gbc.gridx=2;
        gbc.gridy=0;
        panel1.add(jButton,gbc);

        JTextField jTextField=new JTextField(20);
        gbc.gridx=1;
        gbc.gridy=0;
        panel1.add(jTextField,gbc);

        JLabel jLabel=new JLabel();
        jLabel.setText("Enter Item Title : ");
        gbc.gridx=0;
        gbc.gridy=0;
        panel1.add(jLabel,gbc);

        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        jFrame.add(panel1);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object [][] data= new String[books.size()][6];

                 myString=jTextField.getText();
                 jTextField.setText("");
                 for(int i=0;i<obj1.books.size();i++){
                     if(myString.equals(books.get(i).getTitle())){

                             data[i][0] = books.get(i).getISBN();
                             data[i][1] = books.get(i).getTitle();
                             data[i][2] = books.get(i).getPublication_date();
                             data[i][3] =books.get(i).getSector();
                             data[i][4] =books.get(i).getAuthor();
                             data[i][5] =books.get(i).getPublisher();

                     }
                 }

                String[] colomn={"ISBN","Title","PublicationDate","sector","Author","Publisher"};
                DefaultTableModel model=new DefaultTableModel(data,colomn);
                //model=data,colomn
                JTable jt= new JTable(model){
                    public boolean isCellEditable(int data,int col){
                        return false;
                    }
                };
                gbc.gridx=-1;
                gbc.gridy=1;
                jt.setVisible(true);
                JScrollPane scrollPane = new JScrollPane(jt);
                scrollPane.setBounds(5, 218, 884, 194);
                panel1.add(scrollPane,gbc);

            }
        });

    }

}
