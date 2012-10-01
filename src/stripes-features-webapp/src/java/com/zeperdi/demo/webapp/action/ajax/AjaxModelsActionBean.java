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
package com.zeperdi.demo.webapp.action.ajax;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.stripes.action.After;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.LifecycleStage;

import com.zeperdi.demo.webapp.action.BaseActionBean;

/**
 * <Class description>
 *
 * @author José Perdigão
 * @version $Revision$
 */
public class AjaxModelsActionBean extends BaseActionBean {
    private String brand;
    private List<String> models;
    
    @DefaultHandler
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/ajax/ajaxModels.jsp");
    }

    @After(stages = LifecycleStage.BindingAndValidation)
    private void fillModels() {
        models = new ArrayList<String>();
        if (brand.equals("mercedes")) {
            models.add("A Series");
            models.add("B Series");
            models.add("C Series");
            models.add("E Series");
        } else if (brand.equals("bmw")) {
            models.add("1 Series");
            models.add("3 Series");
            models.add("5 Series");
            models.add("7 Series");
        } else if (brand.equals("audi")) {
            models.add("A1");
            models.add("A2");
            models.add("A3");
            models.add("A4");
        } else if (brand.equals("jaguar")) {
            models.add("XJ");
            models.add("XF");
            models.add("XK");
        }
    }

    /**
     * Gets the brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand.
     *
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the models.
     *
     * @return the models
     */
    public List<String> getModels() {
        return models;
    }
}
