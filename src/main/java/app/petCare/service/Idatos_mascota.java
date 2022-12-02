package app.petCare.service;
import java.util.List;
import app.petCare.entity.*;


public interface Idatos_mascota {

	public List<datos_mascota>findAll();
	public void save (datos_mascota data);
	public datos_mascota findOne(Long id);
	public void delete (long id);
	
}
