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
package com.zeperdi.demo.webapp.interceptors;

import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
@Intercepts(LifecycleStage.ActionBeanResolution)
public class DemoInterceptor implements Interceptor {

    @Override
    public Resolution intercept(ExecutionContext context) throws Exception {
        // do something before
        Resolution resolution = context.proceed();
        // do something after
        return resolution;
    }
}
