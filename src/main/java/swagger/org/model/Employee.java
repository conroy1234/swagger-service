package swagger.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "EMPLOYEE")
@ApiModel
public class Employee {

	@ApiModelProperty("Id for primary key")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ApiModelProperty("name cannot be null")
	private String name;
	@ApiModelProperty("address cannot be empty")
	private String address;
	@ApiModelProperty("email field")
	private String email;

	public Employee() {

	}

	public Employee(Long id, String name, String address, String email) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}

}
