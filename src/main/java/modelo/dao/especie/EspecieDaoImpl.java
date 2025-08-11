package modelo.dao.especie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.entidade.especie.Especie;
import modelo.entidade.usuario.Usuario;


public class EspecieDaoImpl implements EspecieDao {
	
public void inserirEspecie(Especie especie) {
		
		Connection conexao = null;
		PreparedStatement insert = null;
		

		
		
		try { 
			
		    
			
			conexao = conectarBanco();
			insert = conexao.prepareStatement("INSERT INTO especice (nome_especie) VALUES (?)");
		
			insert.setString(1, especie.getNomeEspecie());
			
			System.out.println("Especie Salva!");
			insert.execute();
		} catch (SQLException erro) {
			erro.printStackTrace();
		}
		finally {

			try {

				if (insert != null)
					insert.close();

				if (conexao != null)
					conexao.close();

			} catch (SQLException erro) {

				erro.printStackTrace();
			}
		}
	}

public void deletarEspecie(Especie especie) {
	
	Connection conexao = null;
	PreparedStatement delete = null;

	try {

		conexao = conectarBanco();
		delete = conexao.prepareStatement("DELETE FROM especie WHERE id_especie = ?");

		delete.setLong(1, especie.getId());

		delete.execute();

	} catch (SQLException erro) {
		erro.printStackTrace();
	}

	finally {

		try {

			if (delete != null)
				delete.close();

			if (conexao != null)
				conexao.close();

		} catch (SQLException erro) {

			erro.printStackTrace();
			
		}
	}
}

public void atualizarNomeEspecie(Especie especie, String novoNome) {
	
	Connection conexao = null;
	PreparedStatement update = null;

	try {

		conexao = conectarBanco();
		update = conexao.prepareStatement("UPDATE especie SET nome_especie = ? WHERE id_especie = ?");
		
		update.setString(1, novoNome);
		update.setLong(2, especie.getId());

		update.execute();

	} catch (SQLException erro) {
		erro.printStackTrace();
	}

	finally {

		try {

			if (update != null)
				update.close();

			if (conexao != null)
				conexao.close();

		} catch (SQLException erro) {

			erro.printStackTrace();
			}
		}
	}


private Connection conectarBanco() throws SQLException {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	return DriverManager.getConnection("jdbc:mysql://localhost/projeto?user=root&password=root&serverTimezone=America/Sao_Paulo");
	}
}