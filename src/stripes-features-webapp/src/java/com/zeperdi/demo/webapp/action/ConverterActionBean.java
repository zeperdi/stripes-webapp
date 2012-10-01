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
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;

import com.zeperdi.demo.webapp.entity.PhoneNumber;
import com.zeperdi.demo.webapp.extensions.PhoneNumberTypeConverter;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class ConverterActionBean extends BaseActionBean {
    @Validate(required = true, converter = PhoneNumberTypeConverter.class)
    private PhoneNumber phoneNumber;

    @DefaultHandler
    @DontValidate
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/converter.jsp");
    }

    public Resolution submit() {
        context.getMessages().add(
                new LocalizableMessage("com.zeperdi.demo.webapp.action.ConverterActionBean.submit.success", phoneNumber
                        .toString()));
        return new RedirectResolution(ConverterActionBean.class);
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
