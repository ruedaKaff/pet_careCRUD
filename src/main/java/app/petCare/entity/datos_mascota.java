package app.petCare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos_mascota")
public class datos_mascota  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_mascota;
	private String tipo_mascota;
	private String nombre_mascota;
	private String edad_mascota;
	private String foto_mascota;
	public Long getId_mascota() {
		return id_mascota;
	}
	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}
	public String getTipo_mascota() {
		return tipo_mascota;
	}
	public void setTipo_mascota(String tipo_mascota) {
		this.tipo_mascota = tipo_mascota;
	}
	public String getNombre_mascota() {
		return nombre_mascota;
	}
	public void setNombre_mascota(String nombre_mascota) {
		this.nombre_mascota = nombre_mascota;
	}
	public String getEdad_mascota() {
		return edad_mascota;
	}
	public void setEdad_mascota(String edad_mascota) {
		this.edad_mascota = edad_mascota;
	}
	public String getFoto_mascota() {
		return foto_mascota;
	}
	public void setFoto_mascota(String foto_mascota) {
		this.foto_mascota = foto_mascota;
	}
	
	

	
}
