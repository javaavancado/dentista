package br.com.kontrol.converter;

import br.com.kontrol.facade.AbstractFacade;
import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


@SuppressWarnings("serial")
public class ConverterGenerico implements Converter, Serializable {

    @SuppressWarnings("rawtypes")
	private final AbstractFacade facade;

    public ConverterGenerico(@SuppressWarnings("rawtypes") AbstractFacade facade) {
        this.facade = facade;
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string.equals("null")){
            return null;
        }
        return facade.pesquisarId(Long.valueOf(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return o.toString();
    }

}
