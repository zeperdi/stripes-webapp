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
package com.zeperdi.demo.webapp.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

import com.zeperdi.demo.webapp.entity.PhoneNumber;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class FormatterActionBean extends BaseActionBean {
    private PhoneNumber phoneNumber;

    @DefaultHandler
    public Resolution main() {
        if (phoneNumber == null) {
            phoneNumber = new PhoneNumber("725", "785", "987");
        }
        return new ForwardResolution("/WEB-INF/jsp/formatter.jsp");
    }

    /**
     * Gets the phoneNumber.
     * 
     * @return the phoneNumber
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phoneNumber.
     * 
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
