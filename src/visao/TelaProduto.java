/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import dao.Banco;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

/**
 *
 * @author labc
 */
public class TelaProduto extends javax.swing.JFrame {

    DefaultTableModel tmProduto = new DefaultTableModel (null, new String[]{ "codigo","nome","fornecedor","quantidade","preco","descricao"});

List<Produto> produtos;

ListSelectionModel lsmProduto;
    /**
     * Creates new form Produto
     */
    public TelaProduto() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaproduto = new javax.swing.JTable();
        quantidade = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pesquisarproduto = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fornecedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");
        setUndecorated(true);
        setResizable(false);

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Preço unitário:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        tabelaproduto.setModel(tmProduto);
        tabelaproduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmProduto = tabelaproduto.getSelectionModel();
        lsmProduto.addListSelectionListener( new ListSelectionListener() {
            public void valueChanged (ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    tabelaprodutoLinhaSelecionada (tabelaproduto);
                }
            }
        }
    );
    jScrollPane2.setViewportView(tabelaproduto);

    jLabel6.setText("Descrição:");

    pesquisarproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisar.png"))); // NOI18N
    pesquisarproduto.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            pesquisarprodutoActionPerformed(evt);
        }
    });

    codigo.setEditable(false);
    codigo.setBackground(new java.awt.Color(204, 204, 204));
    codigo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            codigoActionPerformed(evt);
        }
    });

    jLabel1.setText("Codigo:");

    fornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Saraiva", "Ricardo Eletro", "Lojas Americanas", "Extra" }));
    fornecedor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            fornecedorActionPerformed(evt);
        }
    });

    jLabel2.setText("Nome:");

    jLabel3.setText("Fornecedor:");

    sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close.png"))); // NOI18N
    sair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            sairActionPerformed(evt);
        }
    });

    excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lixeira.png"))); // NOI18N
    excluir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            excluirActionPerformed(evt);
        }
    });

    editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Editar.png"))); // NOI18N
    editar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editarActionPerformed(evt);
        }
    });

    salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
    salvar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            salvarActionPerformed(evt);
        }
    });

    novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Novo.png"))); // NOI18N
    novo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            novoActionPerformed(evt);
        }
    });

    jLabel7.setText("Pesquisar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6)
                .addComponent(jLabel4)
                .addComponent(jLabel3)
                .addComponent(jLabel2)
                .addComponent(jLabel1)
                .addComponent(jLabel5)
                .addComponent(jLabel7))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fornecedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(preco, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(descricao)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editar)
                        .addComponent(salvar)
                        .addComponent(novo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(pesquisarproduto))
                    .addGap(10, 10, 10))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pesquisarproduto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(novo)
                    .addGap(3, 3, 3)
                    .addComponent(salvar)
                    .addGap(3, 3, 3)
                    .addComponent(editar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(excluir)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sair))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(54, Short.MAX_VALUE))
    );

    setSize(new java.awt.Dimension(453, 396));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void pesquisarprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarprodutoActionPerformed
        try {
            ListarProdutos ();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"erro no campo de pesquisa" + ex);
        }
    }//GEN-LAST:event_pesquisarprodutoActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
             limpar();
    }                                       

    public void limpar(){
        nome.setText("");
        fornecedor.setSelectedItem("");
        quantidade.setText("");
        preco.setText("");
        descricao.setText("");
        nome.requestFocus();
    }//GEN-LAST:event_novoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            Produto c = new Produto();
            c.setnome(nome.getText());
            c.setfornecedor(fornecedor.getToolTipText());
            c.setquantidade(quantidade.getText());
            c.setpreco(preco.getText());
            c.setdescricao(descricao.getText());
            Banco dao = new Banco();
            dao.adicionaProduto(c);
            JOptionPane.showMessageDialog(null, "incluido com sucesso");
            limpar();
            desabilitar();
            habilitar ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_salvarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
               try{
            int opcao=JOptionPane.showConfirmDialog(null, "Deseja realizar  alteração no registro?","Atenção",JOptionPane.YES_NO_OPTION);
            if(opcao==JOptionPane.YES_NO_OPTION){
                Produto c=new Produto();
                c.setcodigo(Integer.valueOf(codigo.getText()));
                c.setnome(String.valueOf(nome.getText()));
                c.setfornecedor(String.valueOf(fornecedor.getSelectedObjects()));
                c.setquantidade(String.valueOf(quantidade.getText()));
                c.setpreco(String.valueOf(preco.getText()));
                c.setdescricao(String.valueOf(descricao.getText()));
                Banco banco =new Banco();
                banco.alterarProduto(c);
                JOptionPane.showConfirmDialog(null, "Alteração Efetuada com sucesso");
                desabilitaDados();
                editar.setEnabled(false);
                excluir.setEnabled(true);
                sair.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Alteração não realizada");
                desabilitaDados();         
            }
        } catch(Exception e ){
//            e.printStackTrace();
        }
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
     try{
         Banco banco = new Banco();
         banco.excluirProduto(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo a ser excluido")));
         JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso");
         LimparDados();
         desabilitaDados();
         sair.setEnabled(true);
         excluir.setEnabled(false);
         novo.setEnabled(true);
         editar.setEnabled(false);
     } catch(Exception e ){
         System.out.println(e.getMessage());
     }   
    }//GEN-LAST:event_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JComboBox fornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novo;
    private javax.swing.JButton pesquisarproduto;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quantidade;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    private javax.swing.JTable tabelaproduto;
    // End of variables declaration//GEN-END:variables
    
    private void desabilitar() {
        nome.setEditable(false);
        fornecedor.setEditable(false);
        quantidade.setEditable(false);
        preco.setEditable(false);
        descricao.setEditable(false);
       
    }

    private void habilitar() {
        nome.setEditable(true);
        fornecedor.setEditable(true);
        quantidade.setEditable(true);
        preco.setEditable(true);
        descricao.setEditable(true);
    }
    
    public void LimparDados (){
        nome.setText("");
        fornecedor.setSelectedItem("");
        quantidade.setText("");
        preco.setText("");
        descricao.setText("");
    } 
    
    public void habilitaDados () {
        nome.setEditable(true);
        fornecedor.setEditable(true);
        quantidade.setEditable(true);
        preco.setEditable(true);
        descricao.setEditable(true);
    }
    public boolean verificaDados() {
if (!nome.getText().equals("")&& !quantidade.getText().equals("")){
return true;
} else {
JOptionPane.showMessageDialog(null, "Os campos nome ou quantidade nao foram preenchidos");
return false;
}
    }
   
     public void desabilitaDados () {
        codigo.setEditable(false);
        nome.setEditable(false);
        fornecedor.setEditable(false);
        quantidade.setEditable(false);
        preco.setEditable(false);
        descricao.setEditable(false);
} 
     private void ListarProdutos () throws Exception {
         Banco dao = new Banco ();
         produtos = dao.getLista("%" + nome.getText() + "%");
         mostrarpesquisa (produtos);
     }
     
      private void mostrarpesquisa (List <Produto> produtos){
while (tmProduto.getRowCount() > 0) {
tmProduto.removeRow(0);
}
if (produtos.size() == 0) {
JOptionPane.showMessageDialog (null, "nenhum Produto Cadastrado");
} else {
String[] linha = new String[] {null, null, null, null, null, null};
for (int i = 0; i < produtos.size(); i++){

tmProduto.addRow(linha);
tmProduto.setValueAt (produtos.get(i).getcodigo(), i, 0);
tmProduto.setValueAt (produtos.get(i).getnome(), i, 1);
tmProduto.setValueAt (produtos.get(i).getfornecedor(), i, 2);
tmProduto.setValueAt (produtos.get(i).getquantidade(), i, 3);
tmProduto.setValueAt (produtos.get(i).getpreco(), i, 4);
tmProduto.setValueAt (produtos.get(i).getdescricao(), i, 5);
}
}
}
      private void tabelaprodutoLinhaSelecionada (JTable tabela){
if (tabelaproduto.getSelectedRow() != -1){
habilitaDados();
codigo.setText (String.valueOf (produtos.get(tabela.getSelectedRow()).getcodigo()));
nome.setText(produtos.get(tabela.getSelectedRow()).getnome());
fornecedor.setToolTipText(produtos.get(tabela.getSelectedRow()).getfornecedor());
quantidade.setText(produtos.get(tabela.getSelectedRow()).getquantidade());
preco.setText(produtos.get(tabela.getSelectedRow()).getpreco());
descricao.setText(produtos.get(tabela.getSelectedRow()).getdescricao());
} else {
LimparDados ();
}
      }    
private void alterarProduto () throws Exception {
if (tabelaproduto.getSelectedRow() != -1) {
if (verificaDados()){
Produto c1 = new Produto ();
Banco dao = new Banco();
c1.setcodigo(Integer.valueOf(codigo.getText()));
c1.setnome(String.valueOf(nome.getText()));
c1.setfornecedor(String.valueOf(fornecedor.getSelectedItem()));
c1.setquantidade(String.valueOf(quantidade.getText()));
c1.setpreco(String.valueOf(preco.getText()));
c1.setdescricao(String.valueOf(descricao.getText()));
dao.alterarProduct (c1);
JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
}
}
}

}




