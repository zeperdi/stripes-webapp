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

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

import com.zeperdi.demo.webapp.DemoActionBeanContext;

/**
 * Interface ActionBean: The ActionBeanContext is used primarily to provide access to Servlet APIs such as the request
 * and response, and other information generated during the pre-processing of the request.
 * 
 * @see More info abaout Interface ActionBean <a
 *      href="http://stripes.sourceforge.net/docs/current/javadoc/net/sourceforge/stripes/action/ActionBean.html"
 *      >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class BaseActionBean implements ActionBean {
    /*
     * Created my own context
     */
    protected DemoActionBeanContext context;

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = (DemoActionBeanContext) context;
    }

}
