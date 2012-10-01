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
public class PhoneNumber {
    private String areaCode;
    private String prefix;
    private String sufix;

    public PhoneNumber() {
    }

    public PhoneNumber(String areaCode, String prefix, String sufix) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.sufix = sufix;
    }

    /**
     * Gets the areaCode.
     *
     * @return the areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the areaCode.
     *
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the prefix.
     *
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix.
     *
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Gets the sufix.
     *
     * @return the sufix
     */
    public String getSufix() {
        return sufix;
    }

    /**
     * Sets the sufix.
     *
     * @param sufix the sufix to set
     */
    public void setSufix(String sufix) {
        this.sufix = sufix;
    }
    
    public String toString() {
        return  areaCode + prefix + sufix;
    }
}
