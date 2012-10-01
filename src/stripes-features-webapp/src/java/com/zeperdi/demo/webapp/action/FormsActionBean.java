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

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.validation.EmailTypeConverter;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;

import com.zeperdi.demo.webapp.entity.User;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class FormsActionBean extends BaseActionBean {
    @ValidateNestedProperties({ 
        @Validate(field = "name", required = true, minlength = 2, maxlength = 64),
        @Validate(field = "username", required = true, minlength = 6, maxlength = 10),
        @Validate(field = "password", required = true, minlength = 6, maxlength = 16),
        @Validate(field = "email", required = true, converter = EmailTypeConverter.class),
        @Validate(field = "phone", required = true), 
        @Validate(field = "gender", required = true) 
    })
    private User user;
    @Validate(required = true, expression = "${this eq user.password}")
    private String confirmPassword;
    private List<String> preferencesList;

    @DefaultHandler
    @DontValidate
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/form.jsp");
    }

    public Resolution submit() {
        context.getMessages()
                .add(new LocalizableMessage("com.zeperdi.demo.webapp.action.FormsActionBean.submit.success", user
                        .getName()));
        return new RedirectResolution(FormsActionBean.class);
    }

    @Before(stages = LifecycleStage.BindingAndValidation)
    private void fillData() {
        preferencesList = new ArrayList<String>();
        preferencesList.add("Sports");
        preferencesList.add("Music");
        preferencesList.add("Economy");
        preferencesList.add("Politics");
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
     * Gets the confirmPassword.
     * 
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Sets the confirmPassword.
     * 
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * Gets the preferencesList.
     * 
     * @return the preferencesList
     */
    public List<String> getPreferencesList() {
        return preferencesList;
    }
}
