/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import View.AddNewBao;
import View.AddNewSach;
import View.AddNewTC;
import DAO.FunctionHandling;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import models.Bao;
import models.Sach;
import models.TapChi;



/**
 *
 * @author chuon
 */
public class ThuVien extends javax.swing.JFrame {
    DefaultTableModel sachModelTable, tcModelTable, baoModeldTable;
    FunctionHandling handle;

    /**
     * Creates new form ThuVien
     */
    public ThuVien() {
        initComponents();
        setLocationRelativeTo(null);
        handle = new FunctionHandling();

        sachModelTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        sachModelTable.addColumn("Mã Tài Liệu");
        sachModelTable.addColumn("Tên NSB");
        sachModelTable.addColumn("Số bản Phát Hành");
        sachModelTable.addColumn("Tên Tác Giả");
        sachModelTable.addColumn("Số Trang");

        SetModelTableSach(handle.GetDataSach());
        SachTable.setModel(sachModelTable);

        tcModelTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        tcModelTable.addColumn("Mã Tài Liệu");
        tcModelTable.addColumn("Tên NSB");
        tcModelTable.addColumn("Số bản Phát Hành");
        tcModelTable.addColumn("Số Phát Hành");
        tcModelTable.addColumn("Tháng Phát Hành");

        SetModelTableTapChi(handle.GetDataTapChi());
        tapChiTable.setModel(tcModelTable);

        baoModeldTable = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };;

        baoModeldTable.addColumn("Mã Tài Liệu");
        baoModeldTable.addColumn("Tên NSB");
        baoModeldTable.addColumn("Số bản Phát Hành");
        baoModeldTable.addColumn("Ngày Phát Hành");

        SetModelTableBao(handle.GetDataBao());
        baoTable.setModel(baoModeldTable);
    }

    public void SetModelTableSach(List<Sach> sachs) {
        for (Sach sach : sachs) {
            sachModelTable.addRow(new Object[]{sach.getMaTaiLieu(), sach.getTenNSB(),
                 sach.getSoBanPhatHanh(), sach.getTenTG(), sach.getSoTrang()});
        }
    }

    public void SetModelTableTapChi(List<TapChi> TCs) {
        for (TapChi tc : TCs) {
            tcModelTable.addRow(new Object[]{tc.getMaTaiLieu(), tc.getTenNSB(),
                 tc.getSoBanPhatHanh(), tc.getSoPhatHanh(), tc.getThangPhatHanh()});
        }
    }

    public void SetModelTableBao(List<Bao> baos) {
        for (Bao bao : baos) {
            baoModeldTable.addRow(new Object[]{bao.getMaTaiLieu(), bao.getTenNSB(),
                 bao.getSoBanPhatHanh(), bao.getNgayPhatHanh()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        baoTable = new javax.swing.JTable();
        themBaoButton = new javax.swing.JButton();
        xoaBaoButton = new javax.swing.JButton();
        dongBaoButton = new javax.swing.JButton();
        TKButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        themSachButton = new javax.swing.JButton();
        xoaSachButton = new javax.swing.JButton();
        dongSachButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        SachTable = new javax.swing.JTable();
        TKButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tapChiTable = new javax.swing.JTable();
        themTCButton = new javax.swing.JButton();
        xoaTCButton = new javax.swing.JButton();
        dongTCButton = new javax.swing.JButton();
        TKButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(baoTable);

        themBaoButton.setText("Thêm");
        themBaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBaoButtonActionPerformed(evt);
            }
        });

        xoaBaoButton.setText("Xoá");
        xoaBaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBaoButtonActionPerformed(evt);
            }
        });

        dongBaoButton.setText("Đóng");
        dongBaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongBaoButtonActionPerformed(evt);
            }
        });

        TKButton.setText("Tìm Kiếm");
        TKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themBaoButton)
                .addGap(18, 18, 18)
                .addComponent(xoaBaoButton)
                .addGap(18, 18, 18)
                .addComponent(TKButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dongBaoButton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themBaoButton)
                    .addComponent(xoaBaoButton)
                    .addComponent(dongBaoButton)
                    .addComponent(TKButton))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bao", jPanel4);

        themSachButton.setText("Thêm");
        themSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSachButtonActionPerformed(evt);
            }
        });

        xoaSachButton.setText("Xoá");
        xoaSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaSachButtonActionPerformed(evt);
            }
        });

        dongSachButton.setText("Đóng");
        dongSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongSachButtonActionPerformed(evt);
            }
        });

        SachTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(SachTable);

        TKButton2.setText("Tìm Kiếm");
        TKButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themSachButton)
                .addGap(18, 18, 18)
                .addComponent(xoaSachButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TKButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dongSachButton)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themSachButton)
                    .addComponent(xoaSachButton)
                    .addComponent(dongSachButton)
                    .addComponent(TKButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sach", jPanel1);

        tapChiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tapChiTable);

        themTCButton.setText("Thêm");
        themTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTCButtonActionPerformed(evt);
            }
        });

        xoaTCButton.setText("Xoá");
        xoaTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTCButtonActionPerformed(evt);
            }
        });

        dongTCButton.setText("Đóng");
        dongTCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongTCButtonActionPerformed(evt);
            }
        });

        TKButton3.setText("Tìm Kiếm");
        TKButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themTCButton)
                .addGap(18, 18, 18)
                .addComponent(xoaTCButton)
                .addGap(18, 18, 18)
                .addComponent(TKButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dongTCButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themTCButton)
                    .addComponent(xoaTCButton)
                    .addComponent(dongTCButton)
                    .addComponent(TKButton3))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tap Chi", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themBaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBaoButtonActionPerformed
        new AddNewBao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_themBaoButtonActionPerformed

    private void xoaBaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBaoButtonActionPerformed
        int row = baoTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ThuVien.this, "Select the row you want to delete!",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmDelete = JOptionPane.showConfirmDialog(ThuVien.this, "Are You sure?");
            if (confirmDelete == JOptionPane.YES_OPTION) {
                String maTL = String.valueOf(baoModeldTable.getValueAt(row, 0));
                handle.DeleteRowBao(maTL);
                baoModeldTable.setRowCount(0);
                SetModelTableBao(handle.GetDataBao());
            }
        }
    }//GEN-LAST:event_xoaBaoButtonActionPerformed

    private void dongBaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongBaoButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_dongBaoButtonActionPerformed

    private void themSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSachButtonActionPerformed
        AddNewSach newBookFrame = new AddNewSach();
        newBookFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_themSachButtonActionPerformed

    private void xoaSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaSachButtonActionPerformed
        int row = SachTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ThuVien.this, "Select the row you want to delete!",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmDelete = JOptionPane.showConfirmDialog(ThuVien.this, "Are You sure?");
            if (confirmDelete == JOptionPane.YES_OPTION) {
                String maTL = String.valueOf(sachModelTable.getValueAt(row, 0));
                handle.DeleteRowSach(maTL);
                sachModelTable.setRowCount(0);
                SetModelTableSach(handle.GetDataSach());
            }
        }
    }//GEN-LAST:event_xoaSachButtonActionPerformed

    private void dongSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongSachButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_dongSachButtonActionPerformed

    private void themTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themTCButtonActionPerformed
        new AddNewTC().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_themTCButtonActionPerformed

    private void xoaTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTCButtonActionPerformed
        int row = tapChiTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ThuVien.this, "Select the row you want to delete!",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmDelete = JOptionPane.showConfirmDialog(ThuVien.this, "Are You sure?");
            if (confirmDelete == JOptionPane.YES_OPTION) {
                String maTL = String.valueOf(tcModelTable.getValueAt(row, 0));
                handle.DeleteRowTC(maTL);
                tcModelTable.setRowCount(0);
                SetModelTableTapChi(handle.GetDataTapChi());
            }
        }
    }//GEN-LAST:event_xoaTCButtonActionPerformed

    private void dongTCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongTCButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_dongTCButtonActionPerformed

    private void TKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TKButtonActionPerformed

    private void TKButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TKButton2ActionPerformed

    private void TKButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TKButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SachTable;
    private javax.swing.JButton TKButton;
    private javax.swing.JButton TKButton2;
    private javax.swing.JButton TKButton3;
    private javax.swing.JTable baoTable;
    private javax.swing.JButton dongBaoButton;
    private javax.swing.JButton dongSachButton;
    private javax.swing.JButton dongTCButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tapChiTable;
    private javax.swing.JButton themBaoButton;
    private javax.swing.JButton themSachButton;
    private javax.swing.JButton themTCButton;
    private javax.swing.JButton xoaBaoButton;
    private javax.swing.JButton xoaSachButton;
    private javax.swing.JButton xoaTCButton;
    // End of variables declaration//GEN-END:variables
}
