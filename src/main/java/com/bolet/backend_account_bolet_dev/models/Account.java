package com.bolet.backend_account_bolet_dev.models;

import org.springframework.data.annotation.Id;


public class Account {
    @Id
    private String username;
    private Integer cedulaUser;
    private String email;
    private String telefono;
    
    public Account(String username, Integer cedulaUser, String email, String telefono){
        this.username= username;
        this.cedulaUser=cedulaUser;
        this.email=email;
        this.telefono= telefono;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the cedulaUser
     */
    public Integer getCedulaUser() {
        return cedulaUser;
    }

    /**
     * @param cedulaUser the cedulaUser to set
     */
    public void setCedulaUser(Integer cedulaUser) {
        this.cedulaUser = cedulaUser;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
         
}
