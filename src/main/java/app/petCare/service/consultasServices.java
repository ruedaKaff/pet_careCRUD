package app.petCare.service;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import app.petCare.entity.*;


@Repository
public class consultasServices implements IconsultasService {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<consultas> findAll() {
		
		return em.createQuery("from consultas").getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public consultas findOne(Long id) {
	
		return em.find(consultas.class,id);
	}

	@Override
	public void save(consultas consulta) {
		if (consulta.getId_consulta()>0) {
			em.merge(consulta);
		}else {
			em.persist(consulta);
		}
		
	}
	@Override
	public void delete(long id) {
		em.remove(findOne(id));
		
	}

	

}
