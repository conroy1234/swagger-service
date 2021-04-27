//package swagger.org.model;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "USER")
//public class Users {
//
//	@Id	
//	private Long id;
//	private String name;
//	@Column(name = "CURRENT_TIME")
//	private String time;
//	private String message;
//	//@JsonIgnore
//	//@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//	
//	private List<Posts> posts;
//
//	public Users() {
//
//	}
//
//	public Users(String name, String time, String message, List<Posts> posts) {
//		this.name = name;
//		this.time = time;
//		this.message = message;
//		this.posts = posts;
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
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getTime() {
//		return time;
//	}
//
//	public void setTime(String time) {
//		this.time = time;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
//	public List<Posts> getPosts() {
//		return posts;
//	}
//	
//	
//	public void setPosts(List<Posts> posts) {
//		this.posts = posts;
//	}
//
//	@Override
//	public String toString() {
//		return "Users [id=" + id + ", name=" + name + ", time=" + time + ", message=" + message + ", posts=" + posts
//				+ "]";
//	}
//
//}
