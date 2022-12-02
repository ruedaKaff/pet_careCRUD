package app.petCare.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.petCare.entity.*;

@Repository
public interface mascota_repository extends CrudRepository<datos_mascota, Integer>
{

}


