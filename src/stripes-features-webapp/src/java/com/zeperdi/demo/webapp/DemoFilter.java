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

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.lang3.StringUtils;

/**
 * Filters can perform many different types of functions:
 * <ul>
 * <li>Authentication-Blocking requests based on user identity.</li>
 * <li>Logging and auditing-Tracking users of a web application.</li>
 * <li>Image conversion-Scaling maps, and so on.</li>
 * <li>Data compression-Making downloads smaller.</li>
 * <li>Localization-Targeting the request and response to a particular locale.</li>
 * <li>XSL/T transformations of XML content-Targeting web application responses to more that one type of client.</li>
 * </ul>
 * These are just a few of the applications of filters. There are many more, such as encryption, tokenizing, triggering
 * resource access events, mime-type chaining, and caching.
 * 
 * @see More info abaout Filter <a href="http://www.oracle.com/technetwork/java/filters-137243.html" >here</a>.
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class DemoFilter implements Filter {
    private FilterConfig filterConfig;
    protected String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        String encoding = filterConfig.getInitParameter("encoding");
        if (StringUtils.isNotBlank(encoding)) {
            this.encoding = encoding;
        }

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        request.setCharacterEncoding(this.encoding);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        this.encoding = null;
        this.filterConfig = null;
    }

    /**
     * Gets the filterConfig.
     * 
     * @return the filterConfig
     */
    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    /**
     * Sets the filterConfig.
     * 
     * @param filterConfig the filterConfig to set
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }
}
