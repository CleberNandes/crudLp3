package teste;

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.SQLException; 
import persistencia.GerenteConexao;

public class TestaEnpregado {
	public static void main(String a[]){
		Connection con = GerenteConexao.getConexao();
		PreparedStatement pst = null;
		try{
			String sql = "INSERT INTO empregados(nome, age) VALUES(?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1,"Amanda");
			pst.setInt(2,30);
			pst.executeUpdate();
			System.out.println("Dados inseridos com sucesso!!!");
		}catch(SQLException sqle){
			System.out.println("N�o foi poss�vel inserir os dados!!");
		}
	}
}