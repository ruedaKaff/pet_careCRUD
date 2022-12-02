package app.petCare.service;

import java.util.List;
import app.petCare.entity.*;

public interface IconsultasService {
	
	public List<consultas>findAll();
	public void save(consultas consulta);
	public consultas findOne(Long id);
	public void delete (long id);
	

}
