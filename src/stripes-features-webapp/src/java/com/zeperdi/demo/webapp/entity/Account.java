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

import java.util.Date;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class Account {
    private String number;
    private String currency;
    private Date open;

    public Account() {

    }

    public Account(String number, String currency, Date open) {
        this.number = number;
        this.currency = currency;
        this.open = open;
    }

    /**
     * Gets the number.
     * 
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * 
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the currency.
     * 
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     * 
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets the open.
     * 
     * @return the open
     */
    public Date getOpen() {
        return open;
    }

    /**
     * Sets the open.
     * 
     * @param open the open to set
     */
    public void setOpen(Date open) {
        this.open = open;
    }

}
