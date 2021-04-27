//package swagger.org.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "POST")
//public class Posts {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String discription;
//
//	@ManyToOne	
//	@JsonIgnore
//	private Users users;
//
//	public Posts() {
//
//	}
//
//	public Posts(String discription, Users users) {
//		this.discription = discription;
//		this.users = users;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getDiscription() {
//		return discription;
//	}
//
//	public void setDiscription(String discription) {
//		this.discription = discription;
//	}
//
//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//
//	@Override
//	public String toString() {
//		return "Posts [id=" + id + ", discription=" + discription + ", users=" + users + "]";
//	}
//
//}
