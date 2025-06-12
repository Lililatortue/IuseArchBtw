package api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
/* Model for table CalUser
 *
 * */
@Entity
@Table(name = "CalUser")
public class UserModel{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  @Column(name = "name")
  private String username;

  @NotNull
  @Column(name = "email")
  private String email;

  @NotNull
  @Column(name = "password")
  private String password;
  
  //required for JPA
  public UserModel(){}

  public UserModel( String name, String email, String password){
    this.username = name;
    this.email = email;
    this.password = password;
  }

  public Long getId() {return id;}
  public String getName(){return username;} 
  public String getEmail(){return email;}
  public String getPassword(){return password;}
  }
