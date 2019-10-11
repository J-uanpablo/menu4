
class ejerciciomenu {
    
    
    
    public class Ejerciciomenu {
    
    private int numero1, numero2;
    private double resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public int Sumar(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2); 
        return this.getNumero1()+this.getNumero2();
  }
  
    public int Restar(int num1, int num2){
         this.setNumero1(num1);
        this.setNumero2(num2); 
        return this.getNumero1()-this.getNumero2();
    }
    
    public int Multiplicar(int num1, int num2){
         this.setNumero1(num1);
        this.setNumero2(num2); 
        return this.getNumero1()*this.getNumero2();
    }
    
    public double Division(int num1, int num2){
         this.setNumero1(num1);
        this.setNumero2(num2); 
        return (double) getNumero1()/this.getNumero2();
    }

   
    }


    
    
    
    
    
    
}

