
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class Fnew extends javax.swing.JInternalFrame {
    Connection con;
    String sr="";
    
    

    /**
     * Creates new form Flight
     */
    public Fnew() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        bfare = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        efare = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        dept = new javax.swing.JTextField();
        arr = new javax.swing.JTextField();
        cnt = new javax.swing.JButton();
        ffare = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        tdept = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airtbl = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        searchcombo = new javax.swing.JComboBox();
        sortcombo = new javax.swing.JComboBox();
        asc = new javax.swing.JRadioButton();
        desc = new javax.swing.JRadioButton();
        refresh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(38, 34));
        setPreferredSize(new java.awt.Dimension(1072, 735));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel5.setText("Number of Seats");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 230, 150, 16);
        getContentPane().add(bfare);
        bfare.setBounds(820, 130, 147, 28);

        jLabel6.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel6.setText("Time of Departure");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(44, 248, 180, 16);
        getContentPane().add(seats);
        seats.setBounds(820, 230, 147, 28);

        jLabel7.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel7.setText("First Class Fare");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 90, 150, 16);
        getContentPane().add(efare);
        efare.setBounds(820, 180, 147, 28);

        jLabel8.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel8.setText("Business Class Fare");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 140, 180, 16);

        add.setText("Add Record");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(470, 500, 100, 23);

        jLabel9.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel9.setText("Economy Class Fare");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(620, 190, 190, 16);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(530, 550, 71, 23);
        getContentPane().add(dept);
        dept.setBounds(238, 163, 147, 28);
        getContentPane().add(arr);
        arr.setBounds(238, 202, 147, 28);

        cnt.setText("Count");
        cnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntActionPerformed(evt);
            }
        });
        getContentPane().add(cnt);
        cnt.setBounds(530, 450, 71, 23);
        getContentPane().add(ffare);
        ffare.setBounds(820, 80, 147, 28);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(420, 450, 67, 23);
        getContentPane().add(tdept);
        tdept.setBounds(238, 241, 147, 28);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel2.setText("Airlines Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 131, 170, 16);

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel3.setText("Arrival");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 209, 130, 16);
        getContentPane().add(aname);
        aname.setBounds(238, 124, 147, 28);

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel4.setText("Departure");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 170, 160, 16);
        getContentPane().add(aid);
        aid.setBounds(238, 85, 147, 28);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel1.setText("Airlines ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(44, 92, 100, 16);

        airtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FLIGHT ID", "FLIGHT  NAME", "DEPARTURE", "ARRIVAL", "TIME", "SEATS", "FIRST CLASS", "BUSINESS CLASS ", "ECONOMY CLASS "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airtbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 310, 872, 89);

        jLabel10.setFont(new java.awt.Font("Castellar", 1, 16)); // NOI18N
        jLabel10.setText("Flight Details");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(357, 22, 187, 45);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search & Sort By"));
        jPanel3.setOpaque(false);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Flight ID", "Flight Name", "Departure", "Arrival" }));

        sortcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Airlines Name", "Airlines ID", "Time", " " }));
        sortcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortcomboActionPerformed(evt);
            }
        });

        buttonGroup1.add(asc);
        asc.setSelected(true);
        asc.setText("Ascending");
        asc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascActionPerformed(evt);
            }
        });

        buttonGroup1.add(desc);
        desc.setText("Descending");
        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel11.setText("Sort By");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(searchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asc)
                    .addComponent(sortcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(sortcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search)
                    .addComponent(asc))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(desc)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 440, 340, 150);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(430, 550, 67, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TRAVEL AGENCY TV COMMERCIAL ADVERTISEMENT.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 430, 302, 176);

        jLabel13.setFont(new java.awt.Font("Castellar", 1, 13)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flight1320x742.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-170, 10, 1220, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        try{
        String ai = aid.getText();
        String an = aname.getText();
        String dep = dept.getText();
        String ar = arr.getText();
        String n = seats.getText();
        String tdep = tdept.getText();
        String bf = bfare.getText();
        String ff = ffare.getText();
        String ef = efare.getText();
        
        
        String q = "Insert into ftbl values('"+ai+"','"+an+"','"+dep+"','"+ar+"','"+tdep+"',"+n+","+ff+","+bf+","+ef+")";
        Statement st = con.createStatement();
        st.executeUpdate(q);
        display();
        JOptionPane.showMessageDialog(this, " Record has been added successfully");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addActionPerformed

    private void cntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntActionPerformed
        // TODO add your handling code here:
        try{
            String q = "Select count(*) from ftbl";
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(q);
            
            int c = 0;
            if(rs.next())
                c= rs.getInt(1);
            
            JOptionPane.showMessageDialog(this," NUMBER OF RECORDS =" + c);
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cntActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            String a=JOptionPane.showInputDialog("Enter Flight ID to be deleted.");
            String q="Delete from ftbl where A_ID='"+a+"'";
            Statement st=(Statement)con.createStatement();
            st.executeUpdate(q);
            
            display();
            JOptionPane.showMessageDialog(this,"The record has been successfully deleted.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        opencon();
        display();
    }//GEN-LAST:event_formInternalFrameOpened

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
          aid.setText("");
          aname.setText("");
          dept.setText("");
          arr.setText("");
          seats.setText("");
          tdept.setText("");
          bfare.setText("");
          ffare.setText("");
          efare.setText("");
          
    }//GEN-LAST:event_clearActionPerformed

    private void ascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascActionPerformed
        display();
    }//GEN-LAST:event_ascActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
            String s=(String)searchcombo.getSelectedItem();
            if(s.equalsIgnoreCase("flight id"))
                sr=JOptionPane.showInputDialog(" Enter Flight ID");
            else if(s.equalsIgnoreCase("flight name"))
                sr=JOptionPane.showInputDialog(" Enter Airlines Name");
            else if(s.equalsIgnoreCase("departure"))
                sr=JOptionPane.showInputDialog(" Enter Departure");
            else if(s.equalsIgnoreCase("arrival"))
                sr=JOptionPane.showInputDialog("Arrival");

            display();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        display();
    }//GEN-LAST:event_descActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
      sortcombo.setSelectedItem("Airlines Name");
      searchcombo.setSelectedItem("Flight");
      asc.setSelected(true);
        display();
        
    }//GEN-LAST:event_refreshActionPerformed

    private void sortcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortcomboActionPerformed
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_sortcomboActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_closeActionPerformed
void opencon(){
    try{
        Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/fm","root",null);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
}
void display() {
        try{
            String q="Select * from ftbl ";
            
            String s=(String)searchcombo.getSelectedItem();
            if(s.equalsIgnoreCase("flight id")){
                q+="where A_ID like '%"+sr+"%'";
            }
            else if(s.equalsIgnoreCase("flight name")){
                q+="where A_Name like '%"+sr+"%'";
            }
            else if(s.equalsIgnoreCase("departure")){
                q+="where dep like '%"+sr+"%'";
            }
            else if(s.equalsIgnoreCase("arrival")){
                q+="where arr like '%"+sr+"%'";
            }
               
            
            String srt=(String) sortcombo.getSelectedItem();
            if(srt.equalsIgnoreCase("Airlines Name") && asc.isSelected())
                q+=" order by A_Name";
            else if(srt.equalsIgnoreCase("Airlines Name") && desc.isSelected())
                q+=" order by A_Name desc";
            if(srt.equalsIgnoreCase("Airlines ID") && asc.isSelected())
                q+=" order by A_ID";
            else if(srt.equalsIgnoreCase("Airlines ID") && desc.isSelected())
                q+=" order by A_ID desc";
            if(srt.equalsIgnoreCase("Time") && asc.isSelected())
                q+=" order by dep_time";
            else if(srt.equalsIgnoreCase("Time") && desc.isSelected())
                q+=" order by dep_time desc";
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(q);
            DefaultTableModel dtm=(DefaultTableModel)airtbl.getModel();
            String ai,an,dep,ar,tdep,ff,bf,ef,n;
            
            while(dtm.getRowCount()>0)
                dtm.removeRow(0);
            
            while(rs.next()){
                ai=rs.getString(1);
                an=rs.getString(2);
                dep = rs.getString(3);
                ar = rs.getString(4);
                tdep = rs.getString(5);
                n = rs.getString(6);
                ff = rs.getString(7);
                bf = rs.getString(8);
                ef = rs.getString(9);   
                
              Object nr[]={ai,an,dep,ar,tdep,n,ff,bf,ef};
                dtm.addRow(nr);
            }
            sr="";
            if(dtm.getRowCount()==0)
                JOptionPane.showMessageDialog(this,"No Matching Records Found");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField aid;
    private javax.swing.JTable airtbl;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField arr;
    private javax.swing.JRadioButton asc;
    private javax.swing.JTextField bfare;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JButton cnt;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dept;
    private javax.swing.JRadioButton desc;
    private javax.swing.JTextField efare;
    private javax.swing.JTextField ffare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JComboBox searchcombo;
    private javax.swing.JTextField seats;
    private javax.swing.JComboBox sortcombo;
    private javax.swing.JTextField tdept;
    // End of variables declaration//GEN-END:variables
}
