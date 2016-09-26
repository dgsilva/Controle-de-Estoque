package dao;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Acesso;
import modelo.Fornecedor;
import modelo.Login;
import modelo.Produto;

public class Banco {

    private Connection conexao;

    public Banco() throws Exception {
        this.conexao = Criaconexao.getConexao();
    }

    public void adicionaProduto(Produto ctt) throws SQLException {
        String sql = "insert into Produto(nome,fornecedor,quantidade,preco,descricao)"
                + "values(?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, ctt.getnome());
        stmt.setString(2, ctt.getfornecedor());
        stmt.setString(3, ctt.getquantidade());
        stmt.setString(4, ctt.getpreco());
        stmt.setString(5, ctt.getdescricao());
        stmt.execute();
        stmt.close();

    }

    public Produto consultaProdutocodigo(int codigo) throws Exception {
        Produto c = new Produto();
        String pesq = ("Select *from contato where codigo = ?");
        PreparedStatement stmt = this.conexao.prepareStatement(pesq);
        stmt.setInt(1, codigo);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            c.setcodigo(Integer.parseInt(rs.getString("codigo")));
            c.setnome(rs.getString("nome"));
            c.setfornecedor(rs.getString("fornecedor"));
            c.setquantidade(rs.getString("quantidade"));
            c.setpreco(rs.getString("preco"));
            c.setdescricao(rs.getString("descricao"));

        }
        return c;
    }

    public Produto consultaProdutonome(String nome) throws Exception {
        Produto c = new Produto();
        String pesq = ("Select *from Fornecedor where nome = ?");
        PreparedStatement stmt = this.conexao.prepareStatement(pesq);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            c.setcodigo(Integer.parseInt(rs.getString("codigo")));
            c.setnome(rs.getString("nome"));
            c.setfornecedor(rs.getString("fornecedor"));
            c.setquantidade(rs.getString("quantidade"));
            c.setdescricao(rs.getString("descricao"));

        }
        return c;
    }

    public void excluirProduto(int codigo) throws Exception {
        String sql = ("Delete from produto where codigo ='" + codigo + "'");
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }

    public void alterarProduto(Produto ctt) throws Exception {
        Produto c = new Produto();
        String sql = "update Produto set nome=?, fornecedor=?,quantidade=?, preco=?,descricao=? where codigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, ctt.getnome());
        stmt.setString(2, ctt.getfornecedor());
        stmt.setString(3, ctt.getquantidade());
        stmt.setString(4, ctt.getpreco());
        stmt.setString(5, ctt.getdescricao());
        stmt.setInt(6, ctt.getcodigo());
        stmt.execute();
        stmt.close();
    }

    public void adicionarFornecedor(Fornecedor ctt) throws SQLException {
        String sql = "insert into Fornecedor(nomefornecedor,contatofornecedor)"
                + "values(?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, ctt.getnomefornecedor());
        stmt.setString(2, ctt.getcontatofornecedor());
        stmt.execute();
        stmt.close();

    }

    public Fornecedor consultarFornecedorcodigo(int codigofornecedor) throws Exception {
        Fornecedor c = new Fornecedor();
        String pesq = ("Select *from Fornecedor where codigofornecedor = ?");
        PreparedStatement stmt = this.conexao.prepareStatement(pesq);
        stmt.setInt(1, codigofornecedor);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            c.setcodigofornecedor(Integer.parseInt(rs.getString("codigofornecedor")));
            c.setnomefornecedor(rs.getString("nomefornecedor"));
            c.setcontatofornecedor(rs.getString("contatofornecedor"));

        }
        return c;
    }

    public Fornecedor consultarFornecedor(String nomefornecedor) throws Exception {
        Fornecedor c = new Fornecedor();
        String pesq = ("Select *from Fornecedor where nomefornecedor = ?");
        PreparedStatement stmt = this.conexao.prepareStatement(pesq);
        stmt.setString(1, nomefornecedor);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            c.setcodigofornecedor(Integer.parseInt(rs.getString("codigofornecedor")));
            c.setnomefornecedor(rs.getString("nomefornecedor"));
            c.setcontatofornecedor(rs.getString("contatofornecedor"));

        }
        return c;
    }

    public void excluirFornecedor(int codigo) throws Exception {
        String sql = ("Delete from produto where codigo ='" + codigo + "'");
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }

    public void alterarFornecedor(Fornecedor ctt) throws Exception {
        Fornecedor c = new Fornecedor();
        String sql = "update Fornecedor set nomefornecedor=?, contatofornecedor=? where codigofornecedor=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, ctt.getnomefornecedor());
        stmt.setString(2, ctt.getcontatofornecedor());
        stmt.setInt(6, ctt.getcodigofornecedor());
        stmt.execute();
        stmt.close();
    }

    public List<Produto> getLista(String nome) throws SQLException {
        String sql = "select * from produto where nome ilike ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        ResultSet rs = stmt.executeQuery();

        List<Produto> minhaLista = new ArrayList<Produto>();

        while (rs.next()) {

            Produto c = new Produto();
            c.setcodigo(Integer.valueOf(rs.getInt("codigo")));
            c.setnome(rs.getString("nome"));
            c.setfornecedor(rs.getString("fornecedor"));
            c.setquantidade(rs.getString("quantidade"));
            c.setpreco(rs.getString("preco"));
            c.setdescricao(rs.getString("descricao"));
            minhaLista.add(c);
        }
        rs.close();
        stmt.close();
        return minhaLista;
    }

    public void removeItemTabela(Produto ctt) throws SQLException {
        String sql = "delete from produto where codigo=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, ctt.getcodigo());
        stmt.execute();
        stmt.close();
    }

    public void excluirProduct(int codigo) throws Exception {
        String sql = ("delete from produto where codigo = '" + codigo + "'");
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.execute();
        stmt.close();
    }

    public void alterarProduct(Produto ctt) throws Exception {
        Produto c = new Produto();
        String sql = "upadate produto set nome=?, fornecedor=?, quantidade=?, preco=?, descricao=? where codigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, ctt.getnome());
        stmt.setString(2, ctt.getfornecedor());
        stmt.setString(3, ctt.getquantidade());
        stmt.setString(4, ctt.getpreco());
        stmt.setString(5, ctt.getdescricao());
        stmt.setInt(6, ctt.getcodigo());

        stmt.execute();
        stmt.close();
    }

    public void alterarFornecer(Fornecedor ctt) throws Exception {
        Fornecedor c = new Fornecedor();
        String sql = "upadate produto set nomefornecedor=?, contatofornecedor=? where codigofornecedor=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, ctt.getnomefornecedor());
        stmt.setString(2, ctt.getcontatofornecedor());
        stmt.setInt(6, ctt.getcodigofornecedor());

        stmt.execute();
        stmt.close();
    }

     public boolean ValidarLogin(String nomeUsuario, String senha) throws SQLException {
        boolean autenticado = false;
        String sql;
        sql = "Select nome_usuario, senha from login where nome_usuario = ? and senha = ?";
        PreparedStatement stmt;
        
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeUsuario);
        stmt.setString(2, senha);
        
        ResultSet rs = stmt.executeQuery();
        
         if(rs.next()); {
            Login login = new Login();
            login.setNomeUsuario(rs.getString("nome_usuario"));
            login.setSenha(rs.getString("senha"));
            autenticado = true;
            EntradaAcesso(nomeUsuario);
    }
    rs.close();
    stmt.close();
    return autenticado;
    }    
    
    public void EntradaAcesso(String nome_usuario) throws SQLException{
        String sql = "insert into acesso(nome_usuario,data_acesso,hora_acesso)"
                + "values(?,?,?)";
        
        Acesso acesso = new Acesso();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, nome_usuario);
        stmt.setString(2, acesso.getDataAcesso());
        stmt.setString(3, acesso.getHoraAcesso());
        stmt.execute();
        stmt.close();
        
    }

           }

