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
package com.zeperdi.demo.webapp.action.ajax;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;

import com.zeperdi.demo.webapp.action.BaseActionBean;
import com.zeperdi.demo.webapp.entity.Car;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class AjaxActionBean extends BaseActionBean {
    @ValidateNestedProperties({
        @Validate(field = "brand", required = true),
        @Validate(field = "model", required = true),
        @Validate(field = "fuel", required = true)
    })
    private Car car;

    @DefaultHandler
    @DontValidate
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/ajax/ajaxMain.jsp");
    }

    public Resolution submit() {
        context.getMessages().add(
                new LocalizableMessage("com.zeperdi.demo.webapp.action.ajax.AjaxActionBean.submit.success", car.getBrand(),
                        car.getModel(), car.getFuel()));
        return new RedirectResolution(AjaxActionBean.class);
    }

    /**
     * Gets the car.
     * 
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * Sets the car.
     * 
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }
}
