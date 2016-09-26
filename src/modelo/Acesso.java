package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Acesso {
    private int id;
    private String dataAcesso;
    private String horaAcesso;
    private String nomeUsuario;
    
    public Acesso(){
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd:MM:yyyy");
        dataAcesso = sdf2.format(new Date());
        horaAcesso = sdf.format(new Date().getTime());
    }
    
    public int getId() { return id; }
    public String getDataAcesso() { return dataAcesso; }
    public String getHoraAcesso() { return horaAcesso; }
    public String getNomeUsuario() { return nomeUsuario; }
    public void setDataAcesso(String dataAcesso) { this.dataAcesso = dataAcesso; }
    
    public void setId (int id) { this.id = id; }
    public void sethoraAcesso(String horaAcesso) { this.horaAcesso = horaAcesso; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }
}