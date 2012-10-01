/*
 * $Id$
 *
 * Copyright (c) PT Inovação SA, All Rights Reserved.
 * (http://www.ptinovacao.pt/)
 *
 * This software is intellectual property of PT Inovação SA.
 * Use is subject to license terms.
 *
 * Last changed on $Date$
 * Last changed by $Author$
 */
package com.zeperdi.demo.webapp.entity;

import java.util.List;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class User {
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String gender;
    private List<String> preferences;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the username.
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * 
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * 
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone.
     * 
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * 
     * @param pnohe the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * 
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the preferences.
     * 
     * @return the preferences
     */
    public List<String> getPreferences() {
        return preferences;
    }

    /**
     * Sets the preferences.
     * 
     * @param preferences the preferences to set
     */
    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }
}
