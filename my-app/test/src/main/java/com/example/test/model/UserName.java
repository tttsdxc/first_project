package com.example.test.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Login_Information")
public class UserName {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="UserName")
    private String UserName;
    private String Passward;

    public UserName(){

    }
    public UserName(String UserName){
        this.UserName=UserName;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id= id;
    }

    public Long getPassward(){
        return id;
    }
    public void setPassward(String Passward){
        this.Passward= Passward;
    }
}
