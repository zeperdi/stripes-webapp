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
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.Wizard;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;

import com.zeperdi.demo.webapp.entity.Account;
import com.zeperdi.demo.webapp.entity.Car;
import com.zeperdi.demo.webapp.entity.User;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
@Wizard(startEvents = { "begin" })
public class WizardActionBean extends BaseActionBean {
    
    @ValidateNestedProperties({ 
        @Validate(field = "name", required = true, on = "accountForm"),
        @Validate(field = "username", required = true, on = "accountForm"),
        @Validate(field = "password", required = true, on = "accountForm") 
    })
    private User user;
    
    @ValidateNestedProperties({ 
        @Validate(field = "number", required = true, on = "carForm"),
        @Validate(field = "currency", required = true, on = "carForm"),
        @Validate(field = "open", required = true, on = "carForm") 
    })
    private Account account;
    
    @ValidateNestedProperties({
        @Validate(field = "brand", required = true, on = "submit"),
        @Validate(field = "model", required = true, on = "submit"),
        @Validate(field = "fuel", required = true, on = "submit")
    })
    private Car car;

    @DefaultHandler
    public Resolution begin() {
        return new ForwardResolution("/WEB-INF/jsp/wizard/begin.jsp");
    }

    public Resolution accountForm() {
        return new ForwardResolution("/WEB-INF/jsp/wizard/midle.jsp");
    }
    
    public Resolution carForm() {
        return new ForwardResolution("/WEB-INF/jsp/wizard/end.jsp");
    }

    public Resolution cancel() {
        return new RedirectResolution(WizardActionBean.class);
    }

    public Resolution submit() {
        context.getMessages().add(
                new LocalizableMessage("com.zeperdi.demo.webapp.action.WizardActionBean.submit.success", user
                        .toString(), account.getNumber()));
        return new RedirectResolution(WizardActionBean.class);
    }

    /**
     * Gets the user.
     * 
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user.
     * 
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets the account.
     * 
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the account.
     * 
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
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
