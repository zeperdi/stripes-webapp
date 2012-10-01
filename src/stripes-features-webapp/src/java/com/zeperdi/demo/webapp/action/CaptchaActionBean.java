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

import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.validation.EmailTypeConverter;
import net.sourceforge.stripes.validation.LocalizableError;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;
import net.sourceforge.stripes.validation.ValidationState;
import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaFactory;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class CaptchaActionBean extends BaseActionBean {
    @Validate(required = true, maxlength = 64)
    private String name;
    @Validate(required = true, converter = EmailTypeConverter.class)
    private String email;
    @Validate(required = true, maxlength = 1000)
    private String message;
    private String captcha;
    private String recaptcha_challenge_field;
    private String recaptcha_response_field;

    @DefaultHandler
    @DontValidate
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/captcha.jsp");
    }

    public Resolution submit() {
        context.getMessages().add(
                new LocalizableMessage("com.zeperdi.demo.webapp.action.CaptchaActionBean.submit.success", name));
        return new RedirectResolution(CaptchaActionBean.class);
    }

    @Before(stages = LifecycleStage.BindingAndValidation)
    private void fillData() {
        ReCaptcha c = ReCaptchaFactory.newReCaptcha("6LddHNMSAAAAAGO-PPAiyhUcPvmPaEWEq6nZiA3K",
                "6LddHNMSAAAAAHhkC4cVb4iPr6SNywBr4-4uf9Ku", false);
        captcha = c.createRecaptchaHtml(null, null);
    }

    @ValidationMethod(when = ValidationState.NO_ERRORS)
    public void validateCaptcha(ValidationErrors errors) {
        ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
        reCaptcha.setPrivateKey("6LddHNMSAAAAAHhkC4cVb4iPr6SNywBr4-4uf9Ku");
        String remoteAddr = context.getRequest().getRemoteAddr();
        if (recaptcha_challenge_field != null && recaptcha_response_field != null) {
            ReCaptchaResponse reCaptchaResponse = reCaptcha.checkAnswer(remoteAddr, recaptcha_challenge_field,
                    recaptcha_response_field);
            if (!reCaptchaResponse.isValid()) {
                errors.add("captcha", new LocalizableError("validation.required.valueNotPresent"));
            }
        } else {
            errors.add("captcha", new LocalizableError("validation.required.valueNotPresent"));
        }
    }

    /**
     * Gets the captcha.
     * 
     * @return the captcha
     */
    public String getCaptcha() {
        return captcha;
    }

    /**
     * Sets the captcha.
     * 
     * @param captcha the captcha to set
     */
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * 
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the recaptcha_challenge_field.
     * 
     * @return the recaptcha_challenge_field
     */
    public String getRecaptcha_challenge_field() {
        return recaptcha_challenge_field;
    }

    /**
     * Sets the recaptcha_challenge_field.
     * 
     * @param recaptcha_challenge_field the recaptcha_challenge_field to set
     */
    public void setRecaptcha_challenge_field(String recaptcha_challenge_field) {
        this.recaptcha_challenge_field = recaptcha_challenge_field;
    }

    /**
     * Gets the recaptcha_response_field.
     * 
     * @return the recaptcha_response_field
     */
    public String getRecaptcha_response_field() {
        return recaptcha_response_field;
    }

    /**
     * Sets the recaptcha_response_field.
     * 
     * @param recaptcha_response_field the recaptcha_response_field to set
     */
    public void setRecaptcha_response_field(String recaptcha_response_field) {
        this.recaptcha_response_field = recaptcha_response_field;
    }
}
