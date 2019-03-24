// programa que calcula el impuesto    por unidad y lo entrega al total 
public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    //% de impuesto que se debe tomar 
    double tax = 0.0875;
    //total
		double total = subtotal * tax + subtotal;
    System.out.println(total);
    // el cliente quiere dividir el  total entr cuatro personas
    double perPerson = total / 4;
System.out.println(perPerson);
    
  }
}
