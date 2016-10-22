package pe.egcc.app.controller;

import javax.faces.bean.ManagedBean;
import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
@ManagedBean
public class MateController {
  
  // Datos del modelo
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
  
  public void doSumar(){
    MateService service = new MateService();
    suma = service.sumar(num1, num2);
  }
  
}
