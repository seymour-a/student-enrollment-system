package az.myproject.studentcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "authorities")
@Data
public class AuthorityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String username;
private String authority;
}
