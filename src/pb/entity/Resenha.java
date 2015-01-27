package pb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resenha implements AbstractEntity {
	private int id, nota;
	private String texto;
	private static final long serialVersionUID = 5326833736706249574L;

	public Resenha() {
		super();
	}

	public Resenha(int id, int nota, String texto) {
		super();
		this.id = id;
		this.nota = nota;
		this.texto = texto;
	}

	@Id
	@Override
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Number getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}