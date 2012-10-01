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

import java.util.Collection;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.TypeConverter;
import net.sourceforge.stripes.validation.ValidationError;

import com.zeperdi.demo.webapp.entity.PhoneNumber;

/**
 * Interface TypeConverter: Interface for all type converters in the validation system that provide facilities for
 * converting from String to a specific object type.
 * 
 * @see More info abaout Interface TypeConverter <a
 *      href="http://stripes.sourceforge.net/docs/current/javadoc/net/sourceforge/stripes/validation/TypeConverter.html"
 *      >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class PhoneNumberTypeConverter implements TypeConverter<PhoneNumber> {
    private static final Pattern PATTERN = Pattern.compile("\\(?(\\d{3})\\)?[-. ]?(\\d{3})[-. ]?(\\d{4})");

    @Override
    public PhoneNumber convert(String input, Class<? extends PhoneNumber> type, Collection<ValidationError> errors) {
        PhoneNumber result = null;
        Matcher matcher = PATTERN.matcher(input);
        if (matcher.matches()) {
            result = new PhoneNumber(matcher.group(1), matcher.group(2), matcher.group(3));
        } else {
            errors.add(new SimpleError("{1} is not a valid {0}!"));
        }
        return result;
    }

    @Override
    public void setLocale(Locale arg0) {
    }

}
