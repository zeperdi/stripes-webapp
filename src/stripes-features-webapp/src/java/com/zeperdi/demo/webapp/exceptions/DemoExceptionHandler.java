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
package com.zeperdi.demo.webapp.exceptions;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.exception.ActionBeanNotFoundException;
import net.sourceforge.stripes.exception.AutoExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zeperdi.demo.webapp.action.ErrorActionBean;

/**
 * Interface AutoExceptionHandler: A marker interface for delegate exception handlers to be used with the
 * DelegatingExceptionHandler. Note that the DelegatingExceptionHandler must be configured as the ExceptionHandler for
 * the application in order for AutoExceptionHandlers to be discovered and used.
 * 
 * @see More info abaout Interface AutoExceptionHandler <a href=
 *      "http://stripes.sourceforge.net/docs/current/javadoc/net/sourceforge/stripes/exception/AutoExceptionHandler.html"
 *      >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
//public class DemoExceptionHandler extends DefaultExceptionHandler {
public class DemoExceptionHandler implements AutoExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoExceptionHandler.class);
    private static ResourceBundle resources;

    public Resolution handle1(Exception exception, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.error(exception.getClass().getSimpleName() + " cause: " + exception.getMessage());
        LOGGER.debug(exception.getMessage(), exception);

        resources = ResourceBundle.getBundle("StripesResources", request.getLocale());
        request.setAttribute("error", resources.getString("error.internal"));

        return new ForwardResolution(ErrorActionBean.class);
    }

    /**
     * Send the user to the global error page with an ActionBean not found exception error message.
     * 
     * @param exception A ActionBeanNotFoundException exception
     * @param request The HttpServletRequest
     * @param response The HttpServletResponse
     * @return A ForwardResolution
     */
    public Resolution handle2(ActionBeanNotFoundException exception, HttpServletRequest request,
            HttpServletResponse response) {
        LOGGER.error(exception.getClass().getSimpleName() + " cause: " + exception.getMessage());
        LOGGER.debug(exception.getMessage(), exception);

        resources = ResourceBundle.getBundle("StripesResources", request.getLocale());
        request.setAttribute("error", resources.getString("error.ActionBeanNotFoundException"));

        return new ForwardResolution(ErrorActionBean.class);
    }
}
