package app.petCare.service;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import app.petCare.entity.*;

@Repository
public class datos_mascotaService implements Idatos_mascota{

	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<datos_mascota> findAll() {
		
		return em.createQuery("from datos_mascota").getResultList();
	}

	
	@Override
	@Transactional(readOnly = true)
	public datos_mascota findOne(Long id) {
		
		return em.find(datos_mascota.class, id);
	}

	
	@Override
	public void save(datos_mascota data) {
		if(data.getId_mascota()!= null && data.getId_mascota()>0) 
		{
			em.merge(data);
		}else
		{
			em.persist(data);
		}
		
	}

	
	@Override
	public void delete(long id) {
		em.remove(findOne(id));
		
	}

}
