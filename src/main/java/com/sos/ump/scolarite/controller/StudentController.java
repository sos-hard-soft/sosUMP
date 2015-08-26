package com.sos.ump.scolarite.controller;

import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.controller.util.JsfUtil;
import com.sos.ump.scolarite.controller.util.JsfUtil.PersistAction;
import com.sos.ump.scolarite.model.apogee.Individu;
import com.sos.ump.scolarite.service.StudentFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("studentController")
@SessionScoped
public class StudentController implements Serializable {

    @EJB
    private com.sos.ump.scolarite.service.StudentFacade ejbFacade;
    private List<Student> items = null;
    private Student selected;
    
    private Individu apoStudent = new Individu();
    
    public String showResult(){
        String cne = apoStudent.getCodNneInd();
        String cin = apoStudent.getCinInd();
        System.out.println("Le cne saisi est : " + cne + " et Le cin saisi est : " + cin);
        
        System.out.println("Debut de la transaction DB ORACLE");
        apoStudent = ejbFacade.findByCne(cne, cin);
        if (apoStudent == null) {
            System.out.println("Les données Saisi sont incorrect");
        }else{
        System.out.println("l'eudiant est : " + apoStudent.getLibNomPatInd() + " ---- " + apoStudent.getLibPr1Ind());
        }
        return "/student/student?faces-redirect=true";
    }

    public Individu getApoStudent() {
        return apoStudent;
    }

    public void setApoStudent(Individu apoStudent) {
        this.apoStudent = apoStudent;
    }

    public StudentController() {
    }

    public Student getSelected() {
        return selected;
    }

    public void setSelected(Student selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private StudentFacade getFacade() {
        return ejbFacade;
    }

    public Student prepareCreate() {
        selected = new Student();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("StudentCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("StudentUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("StudentDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Student> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Student getStudent(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Student> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Student> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Student.class)
    public static class StudentControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            StudentController controller = (StudentController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "studentController");
            return controller.getStudent(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Student) {
                Student o = (Student) object;
                return getStringKey(o.getIdStudent());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Student.class.getName()});
                return null;
            }
        }

    }

}
