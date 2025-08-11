
public class Especie {

	private Long id;
	private String nomeEspecie;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public Especie(Long id, String nomeEspecie) {

		setId(id);
		setNomeEspecie(nomeEspecie);
	}

}
