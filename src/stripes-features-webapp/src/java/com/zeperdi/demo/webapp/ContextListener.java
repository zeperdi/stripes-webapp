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
package com.zeperdi.demo.webapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ServletContext: Is a interface which helps us to communicate with the servlet container. There is only one
 * ServletContext for the entire web application and the components of the web application can share it. The information
 * in the ServletContext will be common to all the components.
 * 
 * @see More info abaout ActionBeanContext <a
 *      href="http://docs.oracle.com/javaee/6/api/javax/servlet/ServletContextListener.html" >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class ContextListener implements ServletContextListener {
    private ServletContext context;

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        context = null;

    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // Loads system properties on AS startup.
        context = event.getServletContext();
        if (context != null) {
            context.setAttribute("properties", System.getProperties());
        }
    }

}
