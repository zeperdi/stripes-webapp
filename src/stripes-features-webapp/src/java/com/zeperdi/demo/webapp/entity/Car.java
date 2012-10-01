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

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class Car {
    private String brand;
    private String model;
    private Fuel fuel;

    public Car() {
    }

    public Car(String brand, String model, Fuel fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    /**
     * Gets the brand.
     * 
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand.
     * 
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the model.
     * 
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model.
     * 
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the fuel.
     * 
     * @return the fuel
     */
    public Fuel getFuel() {
        return fuel;
    }

    /**
     * Sets the fuel.
     * 
     * @param fuel the fuel to set
     */
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

}
