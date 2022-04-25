package io.bq.sl.apps.japp.model;

import javax.validation.constraints.NotNull;

/**
 * User
 */
public class User {

    private Long id = null;

    @NotNull
    private String username;

    private String firstName = null;


    private String lastName = null;


    private String email = null;


    private String password = null;


    private String phone = null;

    /**
     * Get id
     *
     * @return id
     **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get username
     *
     * @return username
     **/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Get firstName
     *
     * @return firstName
     **/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get email
     *
     * @return email
     **/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get password
     *
     * @return password
     **/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
