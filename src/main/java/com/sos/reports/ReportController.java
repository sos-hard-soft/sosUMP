/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sos.reports;

import com.sos.ump.scolarite.model.Student;
import fr.opensagres.xdocreport.core.document.DocumentKind;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.web.dispatcher.AbstractXDocReportWEBController;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mab.salhi
 */
public class ReportController  extends
                AbstractXDocReportWEBController {

  public static final String REPORT_ID = "carte.odt";

  public ReportController() {
    super(TemplateEngineKind.Velocity, DocumentKind.ODT);
  }

  @Override
  public InputStream getSourceStream() {
    return ReportController.class.getResourceAsStream("carte.odt");
  }

  @Override
  protected FieldsMetadata createFieldsMetadata() {
    return null;
  }

  @Override
  public void populateContext(IContext context, IXDocReport report, HttpServletRequest request) {
    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    String cneRecived = request.getParameter("cne");
    String cin = request.getParameter("cin");
    String image = request.getParameter("photo");
    byte [] photo = image.getBytes();
    System.out.println(photo);
    Long cne = Long.parseLong(cneRecived);
    Student std = new Student(cne, cin, nom, prenom, photo);
    
    context.put("std", std);
    
  }
}