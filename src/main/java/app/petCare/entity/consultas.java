package app.petCare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "consultas")
public class consultas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_consulta;
	
	
	private long id_mascota;
	
	private String motivo;
	
	private String servicio;

	public long getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(long id_consulta) {
		this.id_consulta = id_consulta;
	}

	public long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(long id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	
	
	
	

}
