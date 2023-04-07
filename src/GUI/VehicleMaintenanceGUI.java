/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import DTO.TiepNhan;
import DTO.PhuTung;
import DTO.UserLoginDTO;
import java.util.Date;
//import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import GUI.View;
//import java.sql.Driver;
import java.util.List;
import controller.ControllerImp;
import java.awt.Frame;
//import controller.Controller;
public class VehicleMaintenanceGUI extends javax.swing.JFrame {
    
   private ArrayList<TiepNhan> listTN;
   
    //vị trí
    /**
     * Creates new form VehicleMaintenanceGUI
     */
   
    UserLoginDTO dtoUserLogin = null;
    
    public VehicleMaintenanceGUI(UserLoginDTO user) {
        initComponents();
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        listTN=new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tableTN.getModel();
        this.setVisible(true);
        dtoUserLogin = user;
        this.setSize(1000, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menuBar1 = new java.awt.MenuBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Phieu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenChuXe = new java.awt.TextField();
        txtBienSo = new java.awt.TextField();
        txtHieuXe = new java.awt.TextField();
        txtDiaChi = new java.awt.TextField();
        txtNgayTiepNhan = new java.awt.TextField();
        txtSDT = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTN = new javax.swing.JTable();
        txtThem = new javax.swing.JButton();
        txtXoa = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtXoaDong = new javax.swing.JButton();
        textUpdate = new javax.swing.JButton();

        jPanel2.setLayout(new java.awt.CardLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(47, 79, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phiếu tiếp nhận xe sửa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 6, 715, 78));

        btnBack.setBackground(new java.awt.Color(47, 79, 79));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow-left.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 38, -1));

        btnExit.setBackground(new java.awt.Color(47, 79, 79));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 0, 38, -1));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        Phieu.setBackground(new java.awt.Color(255, 250, 250));
        Phieu.setPreferredSize(new java.awt.Dimension(950, 580));
        Phieu.setRequestFocusEnabled(false);
        Phieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Tên chủ xe:");
        Phieu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 18, -1, 28));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Hiệu xe:");
        Phieu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 77, 105, 28));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Biển số:");
        Phieu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 18, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Địa chỉ:");
        Phieu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 139, 84, 28));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Số điên thoại:");
        Phieu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 77, -1, 28));

        txtTenChuXe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTenChuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenChuXeActionPerformed(evt);
            }
        });
        Phieu.add(txtTenChuXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 18, 262, 28));

        txtBienSo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });
        Phieu.add(txtBienSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 18, 270, 28));

        txtHieuXe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtHieuXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHieuXeActionPerformed(evt);
            }
        });
        Phieu.add(txtHieuXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 77, 262, 28));

        txtDiaChi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });
        Phieu.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 139, 715, 28));

        txtNgayTiepNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNgayTiepNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayTiepNhanActionPerformed(evt);
            }
        });
        Phieu.add(txtNgayTiepNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 215, 225, 28));

        txtSDT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        Phieu.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 77, 270, 28));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Ngày tiếp nhận:");
        Phieu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 215, -1, 28));

        tableTN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên chủ xe", "Biển số", "Hiệu xe", "Địa chỉ", "SĐT", "Ngày tiếp nhận"
            }
        ));
        tableTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTN);

        Phieu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 950, 180));

        txtThem.setText("Thêm");
        txtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemActionPerformed(evt);
            }
        });
        Phieu.add(txtThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 253, -1, -1));

        txtXoa.setText("Xóa");
        txtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoaActionPerformed(evt);
            }
        });
        Phieu.add(txtXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        jTextField1.setText("Tìm kiếm");
        Phieu.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 197, -1));

        txtXoaDong.setText("Xóa Dòng");
        txtXoaDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoaDongActionPerformed(evt);
            }
        });
        Phieu.add(txtXoaDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        textUpdate.setText("Update");
        textUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUpdateActionPerformed(evt);
            }
        });
        Phieu.add(textUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        jLayeredPane1.add(Phieu, "card2");

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 130, 950, 480));
        jLayeredPane1.getAccessibleContext().setAccessibleParent(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(!dtoUserLogin.equals(null)){
            HomeGUI home = new HomeGUI(dtoUserLogin);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void textUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUpdateActionPerformed
    /*
    try{
        TiepNhan p=new TiepNhan();
        p.setTenChuXe( txtTenChuXe.getText());
        p.setSDT(txtSDT.getText());
        p.setHieuXe(txtHieuXe.getText());
        p.setDiaChi(txtDiaChi.getText());
        p.setBienSo(txtBienSo.getText());
        
        try
        {
            p.setNgayTiepNhan((Date) new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayTiepNhan.getText()));
        } catch(Exception ex){
            //catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Đã hoàn thành công việc");
       
            System.out.println(p.toString());
        }
        list.add(p);
        showResult();// hiển thị kết quả
       }catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       
       }
        */
        
    }//GEN-LAST:event_textUpdateActionPerformed

    private void txtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoaActionPerformed
        // TODO add your handling code here:
       /*int TenXoa;
       int dong;
       dong = tableNhapPhieu.getSelectedRow();
       TenXoa=(int)tableNhapPhieu.getValueAt(tableNhapPhieu.getSelectedColumn(), 1);
       System.out.println(" "+TenXoa);
       xoa(idxoa);*/
        
        txtBienSo.setText(" ");
        txtDiaChi.setText(" ");
        txtHieuXe.setText(" ");
        txtNgayTiepNhan.setText(" ");
        txtSDT.setText(" ");
        txtTenChuXe.setText(" ");
       
    }//GEN-LAST:event_txtXoaActionPerformed

    private void txtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThemActionPerformed
        // TODO add your handling code here:
       /*PhieuNhap p=new PhieuNhap();
        p.setTenChuXe(txtTenChuXe.getText());
        p.setSDT(txtSDT.getText());
        p.setHieuXe(txtHieuXe.getText());
        p.setDiaChi(txtDiaChi.getText());
        p.setBienSo(txtBienSo.getText());
        try
        {
            p.setNgayTiepNhan((Date) new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayTiepNhan.getText()));
        } catch(Exception ex){
            //catch(ParseException ex){
            System.out.println(p.toString());
        }
        list.add(p);
        showResult();
        
        */
       /*txtThem.setToolTipText("Click để thêm");
      try{
        PhieuNhap p=new PhieuNhap();
        p.setTenChuXe(txtTenChuXe.getText());
        p.setSDT(txtSDT.getText());
        p.setHieuXe(txtHieuXe.getText());
        p.setDiaChi(txtDiaChi.getText());
        p.setBienSo(txtBienSo.getText());
        
        try
        {
            p.setNgayTiepNhan((Date) new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayTiepNhan.getText()));
        } catch(Exception ex){
            //catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Đã nhập thành công");
       
            System.out.println(p.toString());
        }
        list.add(p);
        showResult();// hiển thị kết quả
       }catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       
       }
      */
      
      
      
      //
        String TenChuXe= txtThem.getText();
        String BienSo=txtThem.getText();
        String HieuXe=txtThem.getText();
        String DiaChi=txtThem.getText();
        String SDT=txtThem.getText();
        String NgayTiepNhan=txtThem.getText();
        
        //Init table
        DefaultTableModel tbl_mod = (DefaultTableModel) tableTN.getModel();
        
        /*
        try
        {
            txtThem.NgayTiepNhan new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayTiepNhan.getText()));
        } catch(Exception ex){
            //catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Đã nhập thành công");
       
            System.out.println(txtThem.toString());
        } System.out.println(txtThem.toString());
        */
        
       // String distance = txtThem.getText();
       // String station = txtThem.getText();
        
        boolean isOk = true;
        
        if(TenChuXe.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Khoảng cách không được bỏ trống!");
            isOk = false;
        } else if(BienSo.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số điểm dừng không được bỏ trống!");
            isOk = false;
        } else if(HieuXe.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số điểm dừng không được bỏ trống!");
            isOk = false;
        } else if(DiaChi.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số điểm dừng không được bỏ trống!");
            isOk = false;
        } else if(SDT.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số điểm dừng không được bỏ trống!");
            isOk = false;
        } else if(NgayTiepNhan.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Số điểm dừng không được bỏ trống!");
            isOk = false;
        } 
        
        
        if(SDT.length() > 0 && !SDT.matches("\\d+")) {
            isOk = false;
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại chỉ có thể là số!");
        }
        
        if(isOk) {
            /*
            float dis  = Float.parseFloat(distance);
            int sta = Integer.parseInt(station);
            */
            float s = Float.parseFloat(SDT);
            String ten=String.valueOf(TenChuXe);
            String bs=String.valueOf(BienSo);
            String hx=String.valueOf(HieuXe);
            String dc=String.valueOf(DiaChi);
            Date n=Date.from(Instant.MIN);
            TiepNhan p =new TiepNhan(ten, bs, hx, dc, s, n);
            listTN.add(p);
        }
        
        
    }//GEN-LAST:event_txtThemActionPerformed



    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        if(this.isVisible())
        {
            String SDT=txtSDT.getText();
        String reg="^\\d{10}$";
        if(SDT.length()>0)
        {
            if(!SDT.matches(reg))// id sai định dạng
            {
                JOptionPane.showMessageDialog(rootPane, "Sai định dạng, nhập lại, chỉ nhận số");
                txtSDT.requestFocus();
            }
        } else{
            JOptionPane.showMessageDialog(rootPane, "Ten khong duoc bo trong");
            txtSDT.requestFocus();
        }
        }
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtNgayTiepNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayTiepNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTiepNhanActionPerformed

    /*
    public class testNgayTiepNhan
    {

       /**
        *
        * @param chuoi
        * @param mau
        * @return
        * @throws Exception
        */  /*
       public static Date parse(String chuoi, String mau) throws Exception
       {
           try
           {
               SimpleDateFormat SimpleDateFormat = new SimpleDateFormat();
               format.applyPattern(mau);
               Date d=fomat.parse(chuoi);
               return d;
           }
           catch(Exception e)
           {
               throw new Exception();
           }
       }
    }
*/
    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        TiepNhan p=new TiepNhan();
        int dc= p.getDiaChi().length();
        if(dc<=-1||dc>400)
            throw new ArithmeticException("Địa chỉ không hợp lệ");
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtHieuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHieuXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHieuXeActionPerformed

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void txtTenChuXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenChuXeActionPerformed
        // TODO add your handling code here:
        // Không được bỏ trống
        /* String TenChuXe=txtTenChuXe.getText();
        String reg="^\\w{1}\\d{2}\\w{4}\\d{3}$";
        if(TenChuXe.length()>0)
        {
            if(!TenChuXe.matches(reg))// id sai định dạng
            {
                JOptionPane.showMessageDialog(rootPane, "Sai định dạng, nhập lại, vd: Nguyễn Văn A");
            }
        } else{
            JOptionPane.showMessageDialog(rootPane, "Ten khong duoc bo trong");
        }*/
    }//GEN-LAST:event_txtTenChuXeActionPerformed

    private void txtXoaDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoaDongActionPerformed
        // TODO add your handling code here:
       /*
         String BienSo=txtBienSo.getText();
        String DiaCh=txtDiaChi.getText();
        String HieuXe=txtHieuXe.getText();
        String NgayTiepNhan=txtNgayTiepNhan.getText();
        String SDT=txtSDT.getText();
        String TenChuXe=txtTenChuXe.getText();
        try{
        TiepNhan p=new TiepNhan();
        p.setTenChuXe(txtTenChuXe.getText());
        p.setSDT(txtSDT.getText());
        p.setHieuXe(txtHieuXe.getText());
        p.setDiaChi(txtDiaChi.getText());
        p.setBienSo(txtBienSo.getText());
        
        try
        {
            p.setNgayTiepNhan((Date) new SimpleDateFormat("dd/MM/yyyy").parse(txtNgayTiepNhan.getText()));
        } catch(Exception ex){
            //catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Đã nhập thành công");
       
            System.out.println(p.toString());
        }
        list.add(p);
        showData();// hiển thị kết quả
        
        }catch(Exception e){
            System.out.println("Chèn thành công");
        }
        
        */
        
    }//GEN-LAST:event_txtXoaDongActionPerformed

    private void tableTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTNMouseClicked
        
      
    }//GEN-LAST:event_tableTNMouseClicked

    
    
    
    public void switchPanels(JPanel panel)
    {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint  ();
        jLayeredPane1.revalidate();
    
    }
// lấy dữ liệu từ bảng
    private void Display(int current) {
       /*
         TiepNhan p=list.get(current);
                //PhieuNhap p=new PhieuNhap();
        txtBienSo.setText(p.BienSo);
        txtDiaChi.setText(p.DiaChi);
        txtHieuXe.setText(p.HieuXe);
        //txtNgayTiepNhan.setText.(p.NgayTiepNhan);
        Date d =p.NgayTiepNhan;
        txtSDT.setText(p.SDT);
        txtTenChuXe.setText(p.TenChuXe);
        */
        
        
    }

   
    public class PhieuNhapView extends javax.swing.JFrame
    {
        private ArrayList<TiepNhan> list;
        DefaultTableModel model;
        public PhieuNhapView()
        {
            initComponents();
            this.setLocationRelativeTo(null);
            list=new ArrayList<>();
            model=(DefaultTableModel)tableTN.getModel();
        }
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(VehicleMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        //</editor-fold>
//
//        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                //new PhieuNhapView().setVisible(true);
                }
           });
        }
        
 public class Control extends javax.swing.JFrame implements View{
     
    private List<TiepNhan> listTN;
    private DefaultTableModel modelTN;
    private DefaultTableModel modelPT;
    private List<PhuTung> listPT;
    private ControllerImp controller;

     public Control() {
        initComponents();
        this.setLocationRelativeTo(null);
        listTN = new ArrayList<>();
        modelTN = (DefaultTableModel) tableTN.getModel();
        controller = new ControllerImp();
        //listPT = new ArrayList<>();
        //modelPT = (DefaultTableModel) tablePN.getModel();
        //listManager = new ArrayList<>();
        //modelManager = (DefaultTableModel) tblManager.getModel();
        //modelStat = (DefaultTableModel) tblStat.getModel();
        showTN();
    }
    
    public void addTN(TiepNhan TN) {
        listTN.add(TN);
        this.showData(listTN, modelTN);
        controller.writeToFile(listTN, "TUYEN.TXT");
    }
    
    public <T> void showData(List<T> list, DefaultTableModel modelTN) {
        modelTN.setRowCount(0);
        for (T t : list) {
            if (t instanceof TiepNhan) {
                TiepNhan p = (TiepNhan) t;
                modelTN.addRow(new Object[]{
                    p.getTenChuXe(), p.getBienSo(), p.getHieuXe(), p.getDiaChi(),  p.getSDT(), p.getNgayTiepNhan()
                });
            
        }
    }    
    }
        
    private void showTN() {
        listTN = controller.readDataFromFile("LX.TXT");
        if (listTN.size() > 0) {
            int mId = listTN.get(listTN.size() - 1).getstt();
            TiepNhan.setstt(mId + 1);
        }
        this.showData(listTN, modelTN);
    }
 
 
 }
        
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Phieu;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tableTN;
    private javax.swing.JButton textUpdate;
    private java.awt.TextField txtBienSo;
    private java.awt.TextField txtDiaChi;
    private java.awt.TextField txtHieuXe;
    private java.awt.TextField txtNgayTiepNhan;
    private java.awt.TextField txtSDT;
    private java.awt.TextField txtTenChuXe;
    private javax.swing.JButton txtThem;
    private javax.swing.JButton txtXoa;
    private javax.swing.JButton txtXoaDong;
    // End of variables declaration//GEN-END:variables
}
