package modelo.dao.especie;

import modelo.entidade.especie.Especie;

public interface EspecieDao {
	
	void inserirEspecie(Especie especie);

	void deletarEspecie(Especie especie);

	void atualizarNomeEspecie(Especie especie, String novoNome);

}
