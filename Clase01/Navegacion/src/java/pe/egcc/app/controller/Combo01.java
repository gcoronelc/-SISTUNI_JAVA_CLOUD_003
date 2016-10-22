package pe.egcc.app.controller;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@ManagedBean
public class Combo01 {
  
  private String codigo;
  private String codigo2;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getCodigo2() {
    return codigo2;
  }
  
  public void doProcesar(){
    codigo2 = codigo;
  }
  
  
}
