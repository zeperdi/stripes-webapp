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
package com.zeperdi.demo.webapp.extensions;

import java.util.Locale;

import net.sourceforge.stripes.exception.StripesRuntimeException;
import net.sourceforge.stripes.format.Formatter;

import com.zeperdi.demo.webapp.entity.PhoneNumber;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class PhoneNumberFormatter implements Formatter<PhoneNumber> {
    private String formatType = "dashes";

    @Override
    public String format(PhoneNumber phoneNumber) {
        String format = null;
        if ("dashes".equalsIgnoreCase(formatType)) {
            format = "%s-%s-%s";
        } else if ("parens".equalsIgnoreCase(formatType)) {
            format = "(%s) %s-%s";
        } else {
            throw new StripesRuntimeException(String.format(
                    "Invalid phone number formatType: %s. Valid values are 'dashes' and 'parens'.", formatType));
        }
        return String.format(format, phoneNumber.getSufix(), phoneNumber.getPrefix(), phoneNumber.getSufix());
    }

    @Override
    public void init() {
    }

    @Override
    public void setFormatPattern(String pattern) {
    }

    @Override
    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    @Override
    public void setLocale(Locale locale) {
    }

}
