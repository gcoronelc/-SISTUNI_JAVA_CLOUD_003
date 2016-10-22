package pe.egcc.app.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@ManagedBean
public class Combo02 {
  
  private List<SelectItem> lista;
  private String codigo;
  private String codigo2;
  
  @PostConstruct
  public void initBean(){
    lista = new ArrayList<>();
    lista.add(new SelectItem("A010", "Java Fundamentos"));
    lista.add(new SelectItem("A020", "Java Avanzado"));
    lista.add(new SelectItem("A030", "Java Empresarial"));
    lista.add(new SelectItem("A040", "Oracle Fundamentos"));
    lista.add(new SelectItem("A050", "Oracle PL/SQL"));
  }

  public List<SelectItem> getLista() {
    return lista;
  }

  public void setLista(List<SelectItem> lista) {
    this.lista = lista;
  }

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
