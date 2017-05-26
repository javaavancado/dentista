package br.com.kontrol.primeface;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author igor
 */
@ManagedBean
public class SignatureView {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
