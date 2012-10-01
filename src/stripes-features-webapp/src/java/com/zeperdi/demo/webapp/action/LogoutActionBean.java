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
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class LogoutActionBean extends BaseActionBean {
    @DefaultHandler
    public Resolution logout() {
        context.logout();
        return new RedirectResolution("/");
    }
}
