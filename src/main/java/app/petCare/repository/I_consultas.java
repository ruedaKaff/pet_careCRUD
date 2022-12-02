package app.petCare.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.petCare.entity.*;

@Repository
public interface I_consultas extends CrudRepository<consultas, Integer>{

}
