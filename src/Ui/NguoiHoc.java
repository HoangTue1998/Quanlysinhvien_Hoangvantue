/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import DAO.ChuyenDeDAO;
import DAO.NguoiHocDao;
import static Ui.NhanVien.tb_fillNV;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NguoiHoc extends javax.swing.JFrame {

    Model.NhanVien nv;

    /**
     * Creates new form ChuyenDe
     */
    public NguoiHoc(Model.NhanVien nv) {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icon/Sharingan.jpg")));
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.nv = nv;
        NguoiHocDao.loadNguoiHoc();
    }

    public long parseDate(String ngay) {
        Date d = null;
        try {
            d = new SimpleDateFormat("MMM d, yyyy").parse(ngay);
        } catch (ParseException ex) {
            Logger.getLogger(NguoiHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d.getTime();
    }

    public void clear() {
        tf_ma.setText("");
        tf_hoten.setText("");
        dc_ngaysinh.setCalendar(null);
        rbtn_nam.setSelected(true);
        tf_sodienthoai.setText("");
        tf_email.setText("");
        ta_ghichu.setText("");
        dc_ngaydangky.setCalendar(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngr_gioitinh = new javax.swing.ButtonGroup();
        pn_main = new javax.swing.JPanel();
        lb_nguoihoc = new javax.swing.JLabel();
        lb_hoten = new javax.swing.JLabel();
        lb_ngaysinh = new javax.swing.JLabel();
        lb_gioitinh = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn_btn = new javax.swing.JPanel();
        tf_ma = new javax.swing.JTextField();
        tf_hoten = new javax.swing.JTextField();
        tf_sodienthoai = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtn_nam = new javax.swing.JRadioButton();
        rbtn_nu = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_ghichu = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_fillNH = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        dc_ngaysinh = new com.toedter.calendar.JDateChooser();
        dc_ngaydangky = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        btn_timkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NGƯỜI HỌC");

        lb_nguoihoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nguoihoc.setText("Mã người học:");

        lb_hoten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_hoten.setText("Họ tên:");

        lb_ngaysinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_ngaysinh.setText("Ngày sinh:");

        lb_gioitinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_gioitinh.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Điện thoại:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        pn_btn.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        tf_ma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_ma.setEnabled(false);

        tf_hoten.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tf_sodienthoai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tf_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trolai.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ghi chú:");

        btngr_gioitinh.add(rbtn_nam);
        rbtn_nam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn_nam.setSelected(true);
        rbtn_nam.setText("Nam");

        btngr_gioitinh.add(rbtn_nu);
        rbtn_nu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtn_nu.setText("Nữ");

        ta_ghichu.setColumns(20);
        ta_ghichu.setLineWrap(true);
        ta_ghichu.setRows(5);
        jScrollPane3.setViewportView(ta_ghichu);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Bảng người học:");

        tb_fillNH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã người học", "Họ tên", "Ngày sinh", "Giới tính", "Điện thoại", "Email", "Ghi chú", "Mã nhân viên", "Ngày đăng ký"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_fillNH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_fillNHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_fillNH);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ngày đăng ký:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NGƯỜI HỌC");

        btn_them.setBackground(new java.awt.Color(255, 255, 51));
        btn_them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them.png"))); // NOI18N
        btn_them.setText("Thêm    ");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sua.png"))); // NOI18N
        jButton2.setText("Sửa     ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(255, 255, 51));
        btn_xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoa.png"))); // NOI18N
        btn_xoa.setText("Xóa      ");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_lammoi.setBackground(new java.awt.Color(255, 255, 51));
        btn_lammoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_lammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lammoi.png"))); // NOI18N
        btn_lammoi.setText("Làm mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        btn_timkiem.setBackground(new java.awt.Color(255, 255, 51));
        btn_timkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(35, 35, 35)
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dc_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nguoihoc)
                                    .addComponent(lb_hoten)
                                    .addComponent(lb_ngaysinh)
                                    .addComponent(lb_gioitinh))
                                .addGap(38, 38, 38)
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pn_mainLayout.createSequentialGroup()
                                        .addComponent(rbtn_nam)
                                        .addGap(40, 40, 40)
                                        .addComponent(rbtn_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dc_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ma, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(tf_hoten))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pn_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(95, 95, 95)
                                .addComponent(tf_email))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addComponent(tf_sodienthoai))))
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel7)))
                .addContainerGap())
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_timkiem)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dc_ngaydangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_mainLayout.createSequentialGroup()
                        .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lb_nguoihoc))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tf_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_hoten))
                                .addGap(18, 18, 18)
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_ngaysinh)
                                    .addComponent(dc_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_gioitinh)
                                    .addComponent(rbtn_nam)
                                    .addComponent(rbtn_nu)))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pn_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6))
                            .addGroup(pn_mainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addGap(28, 28, 28)
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(jButton2)
                    .addComponent(btn_xoa)
                    .addComponent(btn_lammoi)
                    .addComponent(btn_timkiem))
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.out.println("trở lại");
        this.dispose();
        new Main(nv).setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        try {
            if (nv.getVaitro() == 1) {
                JOptionPane.showMessageDialog(this, "Chỉ trưởng phòng mới được dùng chức năng này");
                return;
            }
            String ma = tf_ma.getText();
            if (ma.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn người học cần xóa!");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa người học này?", "Xóa người học", JOptionPane.YES_NO_OPTION);
            if (hoi == JOptionPane.YES_OPTION) {
                int parseMa = Integer.parseInt(ma);
                NguoiHocDao.XoaNH(parseMa);
                NguoiHocDao.loadNguoiHoc();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                clear();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String hoTen = tf_hoten.getText().trim();
        if (hoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên!");
            return;
        }
        long ngaySinhLong = dc_ngaysinh.getDate().getTime();
        int gioiTinh = rbtn_nam.isSelected() ? 0 : 1;
        String soDienThoai = tf_sodienthoai.getText().trim();
        if (soDienThoai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            return;
        }
        String email = tf_email.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email!");
            return;
        }
        for (int i = 0; i < tb_fillNH.getRowCount(); i++) {
            if (tb_fillNH.getValueAt(i, 4).toString().equals(soDienThoai)) {
                JOptionPane.showMessageDialog(this, "Trùng số điện thoại!");
                return;
            }
            if (tb_fillNH.getValueAt(i, 5).toString().equals(email)) {
                JOptionPane.showMessageDialog(this, "Trùng email!");
                return;
            }
        }
        String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!email.matches(checkEmail)) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
            tf_email.setBackground(Color.yellow);
            tf_email.requestFocus();
            return;
        }
        String ghiChu = ta_ghichu.getText().trim();
        if (dc_ngaydangky.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày đăng ký!");
            return;
        }
        long ngayDangKyLong = dc_ngaydangky.getDate().getTime();
        NguoiHocDao.themNH(hoTen, ngaySinhLong, gioiTinh, soDienThoai, email, ghiChu, nv.getMaNv(), ngayDangKyLong);
        NguoiHocDao.loadNguoiHoc();
        JOptionPane.showMessageDialog(this, "Thêm thành công!");
    }//GEN-LAST:event_btn_themActionPerformed

    private void tb_fillNHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_fillNHMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
        int index = tb_fillNH.getSelectedRow();
        tf_ma.setText(String.valueOf(tb_fillNH.getValueAt(index, 0)));
        tf_hoten.setText(String.valueOf(tb_fillNH.getValueAt(index, 1)));
        try {
            dc_ngaysinh.setDate(sdf.parse(String.valueOf(tb_fillNH.getValueAt(index, 2))));
            dc_ngaydangky.setDate(sdf.parse(String.valueOf(tb_fillNH.getValueAt(index, 8))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (String.valueOf(tb_fillNH.getValueAt(index, 3)).equals("Nam")) {
            rbtn_nam.setSelected(true);
        } else {
            rbtn_nu.setSelected(true);
        }
        tf_sodienthoai.setText(String.valueOf(tb_fillNH.getValueAt(index, 4)));
        tf_email.setText(String.valueOf(tb_fillNH.getValueAt(index, 5)));
        ta_ghichu.setText(String.valueOf(tb_fillNH.getValueAt(index, 6)));
    }//GEN-LAST:event_tb_fillNHMouseClicked

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        // TODO add your handling code here:
        clear();
        NguoiHocDao.loadNguoiHoc();
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ma = tf_ma.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn người học cần sửa!");
            return;
        }
        int parseMa = Integer.parseInt(ma);
        String hoTen = tf_hoten.getText().trim();
        if (hoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên!");
            return;
        }
        long ngaySinhLong;
        try {
            ngaySinhLong = dc_ngaysinh.getDate().getTime();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng ngày sinh dd/MM/yyyy!");
            return;
        }
        int gioiTinh = rbtn_nam.isSelected() ? 0 : 1;
        String soDienThoai = tf_sodienthoai.getText().trim();
        if (soDienThoai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            return;
        }
        String email = tf_email.getText().trim();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email!");
            return;
        }
        String ghiChu = ta_ghichu.getText().trim();
        long ngayDangKyLong;
        try {
            ngayDangKyLong = dc_ngaydangky.getDate().getTime();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày đăng ký!");
            return;
        }
        NguoiHocDao.suaNH(parseMa, hoTen, ngaySinhLong, gioiTinh, soDienThoai, email, ghiChu, ngayDangKyLong);
        NguoiHocDao.loadNguoiHoc();
        JOptionPane.showMessageDialog(this, "Sửa thành công!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
        boolean check = false;
        String soDienThoai = tf_sodienthoai.getText().trim();
        if (soDienThoai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            return;
        }
        for (int i = 0; i < tb_fillNH.getRowCount(); i++) {
            if (soDienThoai.equals(tb_fillNH.getValueAt(i, 4))) {
                tb_fillNH.setRowSelectionInterval(i, i);
                int index = tb_fillNH.getSelectedRow();
                tf_ma.setText(String.valueOf(tb_fillNH.getValueAt(index, 0)));
                tf_hoten.setText(String.valueOf(tb_fillNH.getValueAt(index, 1)));
                if (String.valueOf(tb_fillNH.getValueAt(index, 3)).equals("Nam")) {
                    rbtn_nam.setSelected(true);
                } else {
                    rbtn_nu.setSelected(true);
                }
                tf_sodienthoai.setText(String.valueOf(tb_fillNH.getValueAt(index, 4)));
                tf_email.setText(String.valueOf(tb_fillNH.getValueAt(index, 5)));
                ta_ghichu.setText(String.valueOf(tb_fillNH.getValueAt(index, 6)));
                try {
                    dc_ngaysinh.setDate(sdf.parse(String.valueOf(tb_fillNH.getValueAt(index, 2))));
                    dc_ngaydangky.setDate(sdf.parse(String.valueOf(tb_fillNH.getValueAt(index, 8))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                check = true;
            }
        }
        if (check == false) {
            JOptionPane.showMessageDialog(this, "Người học không tồn tại");
            return;
        }
    }//GEN-LAST:event_btn_timkiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup btngr_gioitinh;
    private com.toedter.calendar.JDateChooser dc_ngaydangky;
    private com.toedter.calendar.JDateChooser dc_ngaysinh;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_gioitinh;
    private javax.swing.JLabel lb_hoten;
    private javax.swing.JLabel lb_ngaysinh;
    private javax.swing.JLabel lb_nguoihoc;
    private javax.swing.JPanel pn_btn;
    private javax.swing.JPanel pn_main;
    private javax.swing.JRadioButton rbtn_nam;
    private javax.swing.JRadioButton rbtn_nu;
    private javax.swing.JTextArea ta_ghichu;
    public static javax.swing.JTable tb_fillNH;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_hoten;
    private javax.swing.JTextField tf_ma;
    private javax.swing.JTextField tf_sodienthoai;
    // End of variables declaration//GEN-END:variables
}