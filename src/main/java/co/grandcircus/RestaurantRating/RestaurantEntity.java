package co.grandcircus.RestaurantRating;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_rating")
public class RestaurantEntity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	@Column(name="name")
	private String name;
	@Column(name="rating")
	private Long rating;
	
	public RestaurantEntity() {}

	public RestaurantEntity(Long id, String name, Long rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RestaurantEntity [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	
	
}//end class
