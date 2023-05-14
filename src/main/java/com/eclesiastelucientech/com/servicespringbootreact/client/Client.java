package com.eclesiastelucientech.com.servicespringbootreact.client;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;
    
    @NotNull
    @Size(min = 7, message = "Email should have at least 6 characters")
    private String email;

   
    public Client() {
        super();
    }

    public Client(Long id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}