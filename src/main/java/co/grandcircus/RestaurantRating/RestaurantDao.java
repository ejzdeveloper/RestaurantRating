package co.grandcircus.RestaurantRating;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository

@Transactional
public class RestaurantDao {

	@PersistenceContext
    EntityManager em;

//	public List<RestaurantEntity> findAll() {
//		return em.createQuery("FROM RestaurantEntity", RestaurantEntity.class).getResultList();
//	}//end findAll
	
	public List<RestaurantEntity> sortRating() {
		return em.createQuery("FROM RestaurantEntity ORDER BY rating DESC", RestaurantEntity.class).getResultList();
	}//end sortRating
	
	public List<RestaurantEntity> sortName() {
		return em.createQuery("FROM RestaurantEntity ORDER BY name", RestaurantEntity.class).getResultList();
	}//end sortRating
	
//	public List<RestaurantEntity> upVote() {
//		return em.createQuery("UPDATE RestaurantEntity SET rating = ", RestaurantEntity.class).getResultList();
//	}//end sortRating
	
	public RestaurantEntity findById(Long id) {
		return em.find(RestaurantEntity.class, id);
	}//end findById
	
	public RestaurantEntity findByRating(Long rating) {
		return em.find(RestaurantEntity.class, rating);
	}//end findByRating
	
	
	public void update(RestaurantEntity restaurant) {
		em.merge(restaurant);
	}//end update


}//end class
