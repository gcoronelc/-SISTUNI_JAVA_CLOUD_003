package pe.egcc.app.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanController {
  
  private int num1;
  private int num2;
  private int suma;

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getSuma() {
    return suma;
  }

  public void setSuma(int suma) {
    this.suma = suma;
  }
  
  

  public String goPagina2(){
    return "pagina2";
  }
  
  public String doSumar(int n1, int n2){
    num1 = n1;
    num2 = n2;
    suma = n1 + n2;
    return "pagina2";
  }
  
}
