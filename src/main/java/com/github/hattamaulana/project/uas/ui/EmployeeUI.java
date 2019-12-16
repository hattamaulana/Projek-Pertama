/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.hattamaulana.project.uas.ui;

import com.github.hattamaulana.controller.CustomerController;
import com.github.hattamaulana.controller.TransactionController;
import com.github.hattamaulana.dao.ProductDao;
import com.github.hattamaulana.model.ListTableModel;
import com.github.hattamaulana.project.uas.entities.Angsuran;
import com.github.hattamaulana.project.uas.entities.Customer;
import com.github.hattamaulana.project.uas.entities.Product;
import com.github.hattamaulana.project.uas.entities.Transaction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ngub
 */
public class EmployeeUI extends javax.swing.JFrame 
        implements ListSelectionListener {
    
    private CustomerController customer = new CustomerController();
    private TransactionController transaction = new TransactionController();
    private ListTableModel<Customer> customerTableModel;
    private ListTableModel<Transaction> transactionTableModel;
    private List<Product> products;
    
    private String[] headerCustomerTable = {
        "Customer Id", "Nama", "Alamat", "No. Hp." };
    private String[] headerTransactionTable = {
        "Tanggal", "Nama Product", "Jenis Angsuran", "Status" };
    
    /**
     * Creates new form Employee
     */
    public EmployeeUI() {
        initComponents();
        tableCustomer.getSelectionModel().addListSelectionListener(this);
        customerTableModel = new ListTableModel(headerCustomerTable);
        transactionTableModel = new ListTableModel(headerTransactionTable);
        
        tableCustomer.setModel(customerTableModel);
        tableTransaction.setModel(transactionTableModel);
        
        customerTableModel.setItems(customer.showCustomer());
        
        cmBoxCustomer.addActionListener(customerActionListener());
        cmBoxKredit.addActionListener(kreditActionListener());
        
        btnSearch.setEnabled(false);
        btnAngsuran.setEnabled(false);
        
        // Set Product Name
        setProduct();
    }
    
    private void setProduct() {
        ProductDao dao = new ProductDao();
        products = dao.all();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel();
        
        for (Product p: products) {
            model.addElement(p.getNama());
        }
        
        cmBoxNameProduct.setModel(model);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtNid = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAngsuran = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnNewTransaction = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAngsuran = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTransaction = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        cmBoxCustomer = new javax.swing.JComboBox<>();
        cmBoxNameProduct = new javax.swing.JComboBox<>();
        cmBoxTipeAngsuran = new javax.swing.JComboBox<>();
        cmBoxKredit = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No Id");

        jLabel2.setText("Alamat");

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableCustomer);

        jLabel3.setText("No Telp");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtNid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNidFocusLost(evt);
            }
        });
        txtNid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNidActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Product");

        jLabel5.setText("Tipe Angsuran");

        jLabel6.setText("Angsuran");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel8.setText("Nama");

        btnNewTransaction.setText("Buat Transaksi");
        btnNewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTransactionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Software Kredit Motor");

        btnAngsuran.setText("Bayar Angsuran");
        btnAngsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngsuranActionPerformed(evt);
            }
        });

        tableTransaction.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableTransaction);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        cmBoxCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tambah Customer Baru", "Cari Customer Lama" }));

        cmBoxTipeAngsuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Per Bulan", "Per Minggu", "Per Hari" }));

        cmBoxKredit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buat Kredit", "Bayar Setoran" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(txtNoTelp)
                            .addComponent(txtNid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(cmBoxCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAngsuran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNewTransaction)
                                .addGap(18, 18, 18)
                                .addComponent(btnAngsuran)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmBoxNameProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmBoxTipeAngsuran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmBoxKredit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmBoxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmBoxKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch)
                                .addComponent(btnRefresh)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmBoxNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmBoxTipeAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNewTransaction)
                            .addComponent(btnAngsuran))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTransactionActionPerformed
        String id = txtNid.getText();
        String nameProduct = (String) cmBoxNameProduct.getSelectedItem();
        String tipeAngsuran = (String) cmBoxTipeAngsuran.getSelectedItem();
        
        if (! "".equals(id)) {
            Transaction t = new Transaction();
            t.setTipeAngsuran(tipeAngsuran);
            
            Customer c = new Customer();
            c.setId(id);
            t.setCustomer(c);
            
            Product p = new Product();
            
            for(Product product: products) 
                if (nameProduct.equals(product.getNama()))
                    p.setId(product.getId());

            t.setProduct(p);
            if (transaction.create(t)) {
                List<Transaction> transactions = transaction
                    .showHistoryTransaction(Integer.valueOf(id));
            
                transactionTableModel.setItems(transactions);
            }
        } else {
            
        }
        
        txtAngsuran.setText("");
    }//GEN-LAST:event_btnNewTransactionActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNidActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String id           = txtNid.getText();
        String nama         = txtNama.getText();
        String alamat       = txtAlamat.getText();
        String nomorTelepon = txtNoTelp.getText();
        
        Customer customer   = new Customer(nama, alamat, nomorTelepon);
        
        if (this.customer.addCustomer(customer)) {
            txtNama.setText("");
            txtAlamat.setText("");
            txtNoTelp.setText("");
            
            customerTableModel.setItems(this.customer.showCustomer());
        } else {
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String nama         = txtNama.getText();
        String alamat       = txtAlamat.getText();
        String nomorTelepon = txtNoTelp.getText();
        
        customerTableModel.setItems(
                customer.searchCustomer(nama, alamat, nomorTelepon)
        );
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtNidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNidFocusLost
        String nid = txtNid.getText();
        
        if (! "".equals(nid)) {
            customerTableModel.setItems(customer.searchById(nid));
        }
    }//GEN-LAST:event_txtNidFocusLost

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        customerTableModel.setItems(customer.showCustomer());
        
        txtNid.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtNoTelp.setText("");
        
        System.out.println("Log: OK");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAngsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngsuranActionPerformed
        if (tableTransaction.getSelectedRow() > -1) {
            int row = tableTransaction.getSelectedRow();
            String date = tableTransaction.getValueAt(row, 0).toString();
            String angsuran = txtAngsuran.getText();
            
            int id = -1;
            for (Transaction t: transactionTableModel.getItems())
                if (date.equals(t.getDate()))
                    id = t.getId();
            
            Transaction transaksi = transaction.search(id);
            Angsuran angsur       = new Angsuran();
            angsur.setTransaction(transaksi);
            angsur.setAngsuran(Integer.valueOf(angsuran));
            
            if (transaction.setorAngsuran(angsur)) {
                String custId = txtNid.getText();
                List<Transaction> transactions = transaction
                        .showHistoryTransaction(Integer.valueOf(custId));
                transactionTableModel.setItems(transactions);
                
                txtAngsuran.setText("");
            } else {
                System.out.println("Log: Failed");
            }
        }
    }//GEN-LAST:event_btnAngsuranActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAngsuran;
    private javax.swing.JButton btnNewTransaction;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmBoxCustomer;
    private javax.swing.JComboBox<String> cmBoxKredit;
    private javax.swing.JComboBox<String> cmBoxNameProduct;
    private javax.swing.JComboBox<String> cmBoxTipeAngsuran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTable tableTransaction;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAngsuran;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNid;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent arg0) {
        if (tableCustomer.getSelectedRow() > -1) {
            int row = tableCustomer.getSelectedRow();
            String id = tableCustomer.getValueAt(row, 0).toString();
            String name = tableCustomer.getValueAt(row, 1).toString();
            String address = tableCustomer.getValueAt(row, 2).toString();
            String phonenumber = tableCustomer.getValueAt(row, 3).toString();
            
            txtNid.setText(id);
            txtNama.setText(name);
            txtAlamat.setText(address);
            txtNoTelp.setText(phonenumber);

            List<Transaction> transactions = transaction
                    .showHistoryTransaction(Integer.valueOf(id));
            
            transactionTableModel.setItems(transactions);
        }
    }
    
    private ActionListener kreditActionListener() {
        return (ActionEvent arg0) -> {
            int item = (int) cmBoxKredit.getSelectedIndex();
            
            switch (item) {
                case 0 :
                    btnNewTransaction.setEnabled(true);
                    btnAngsuran.setEnabled(false);
                    break;
                
                case 1 :
                    btnNewTransaction.setEnabled(false);
                    btnAngsuran.setEnabled(true);
                    break;
            }
        };
    }
    
    private ActionListener customerActionListener() {
        return (ActionEvent arg0) -> {
            String item = (String) cmBoxCustomer.getSelectedItem();
            
            switch(item) {
                case "Tambah Customer Baru" :
                    txtNid.setText("");
                    txtNid.setEditable(false);
                    btnAdd.setEnabled(true);
                    btnSearch.setEnabled(false);
                    break;
                
                case "Cari Customer Lama" :
                    btnSearch.setEnabled(true);
                    btnAdd.setEnabled(false);
                    txtNid.setEditable(true);
                    break;
            }
        };
    }
}
