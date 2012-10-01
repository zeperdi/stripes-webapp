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

import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * ActionBeanContext: Encapsulates information about the current request. Also provides access to the underlying Servlet
 * API should you need to use it for any reason.
 * 
 * @see More info abaout ActionBeanContext <a
 *      href="http://stripes.sourceforge.net/docs/current/javadoc/net/sourceforge/stripes/action/ActionBeanContext.html"
 *      >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class DemoActionBeanContext extends ActionBeanContext {
    /*
     * This class can be used to put data in session. See the examples:
     */

    /**
     * Invalidate session
     */
    public void logout() {
        getRequest().getSession().invalidate();
    }

    /**
     * Gets the user.
     * 
     * @return the user
     */
    // public User getUser() {
    // return getRequest().getSession().getAttribute("user");
    // }

    /**
     * Sets the user.
     * 
     * @param user the user to set
     */
    // public void setUser(User user) {
    // getRequest().getSession().setAttribute("user", user);
    // }
}
