package Vista;

import Entidades.TblEcoPrimerTrimestre;
import Vista.util.JsfUtil;
import Vista.util.JsfUtil.PersistAction;
import Controlador.TblEcoPrimerTrimestreFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@ManagedBean(name = "tblEcoPrimerTrimestreController")
@SessionScoped
public class TblEcoPrimerTrimestreController implements Serializable {

    @EJB
    private Controlador.TblEcoPrimerTrimestreFacade ejbFacade;
    private List<TblEcoPrimerTrimestre> items = null;
    private TblEcoPrimerTrimestre selected;

    public TblEcoPrimerTrimestreController() {
    }

    public TblEcoPrimerTrimestre getSelected() {
        return selected;
    }

    public void setSelected(TblEcoPrimerTrimestre selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TblEcoPrimerTrimestreFacade getFacade() {
        return ejbFacade;
    }

    public TblEcoPrimerTrimestre prepareCreate() {
        selected = new TblEcoPrimerTrimestre();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TblEcoPrimerTrimestreCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TblEcoPrimerTrimestreUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TblEcoPrimerTrimestreDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TblEcoPrimerTrimestre> getItems() {
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

    public List<TblEcoPrimerTrimestre> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TblEcoPrimerTrimestre> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TblEcoPrimerTrimestre.class)
    public static class TblEcoPrimerTrimestreControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TblEcoPrimerTrimestreController controller = (TblEcoPrimerTrimestreController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tblEcoPrimerTrimestreController");
            return controller.getFacade().find(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof TblEcoPrimerTrimestre) {
                TblEcoPrimerTrimestre o = (TblEcoPrimerTrimestre) object;
                return getStringKey(o.getIdEcoPrimerTrimestre());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TblEcoPrimerTrimestre.class.getName()});
                return null;
            }
        }

    }

}
