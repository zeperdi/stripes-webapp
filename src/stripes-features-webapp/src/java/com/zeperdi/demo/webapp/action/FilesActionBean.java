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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.FileBean;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.LocalizableMessage;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;
import net.sourceforge.stripes.validation.Validate;

/**
 * <Class description>
 * 
 * @author José Perdigão
 * @version $Revision$
 */
public class FilesActionBean extends BaseActionBean {
    @Validate(required = true)
    private List<FileBean> attachments;

    @DefaultHandler
    @DontValidate
    public Resolution main() {
        return new ForwardResolution("/WEB-INF/jsp/files.jsp");
    }

    public Resolution upload() {
        String fileNames = null;
        for (FileBean fb : attachments) {
            fileNames = fileNames != null ? fileNames + ", " + fb.getFileName() : fb.getFileName();
        }
        context.getMessages().add(
                new LocalizableMessage("com.zeperdi.demo.webapp.action.FilesActionBean.upload.success", fileNames));
        return new RedirectResolution(FilesActionBean.class);
    }

    @DontValidate
    public Resolution download() throws FileNotFoundException {
        String fileName = "stripes.png";
        String filePath = context.getServletContext().getRealPath("/img/" + fileName);
        return new StreamingResolution("image/png", new FileInputStream(filePath)).setFilename(fileName);
    }

    /**
     * Gets the attachments.
     * 
     * @return the attachments
     */
    public List<FileBean> getAttachments() {
        return attachments;
    }

    /**
     * Sets the attachments.
     * 
     * @param attachments the attachments to set
     */
    public void setAttachments(List<FileBean> attachments) {
        this.attachments = attachments;
    }

}
