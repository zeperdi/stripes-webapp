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

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * HttpSessionListener: The HttpSessionListener interface is used to monitor when sessions are created and destroyed on
 * the application server. Its best practical use would be to track session use statistics for a server.
 * 
 * @see More info abaout HttpSessionListener <a
 *      href="http://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpSessionListener.html" >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent event) {
        // TODO: make something with event object.
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        // TODO: make something with event object.
    }
}
