package ejerciciomenu;


import javax.swing.JOptionPane;

public class EjercicioMenu{

    public static void main(String[] args) {
       
        int op;
        int opcion=0;
        double numero1=0;
        double numero2=0;
        double division,suma, resta, resultadoSuma,resultadoResta;
        
          suma= numero1 + numero2;
          resta= numero1 - numero2;
          resultadoSuma= suma;
          resultadoResta= resta;
          

    
        do{
          try{  
            
   opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1. Mostrar operaciones aritmeticas"
                    + "\n 2. Mostrar Departamentos"
                    + "\n 3. Mostrar Ciudades"
                    + "\n 4. Salir"));
       
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Debe ingresar solo valores numericos");
          }
            switch(opcion){
                case 1:
                    do{
                    op=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1. Suma"
                    + "\n 2. Resta"
                    + "\n 3. Multiplicacion"
                    + "\n 4. Division"
                    + "\n 5. Atras"));
                   switch(op){
                       case 1:
                           numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                           numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                           JOptionPane.showMessageDialog(null, "El resultado es igual a ="+(numero1 + numero2));
                           break;
                           
                       case 2:    
                           numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                           numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                           JOptionPane.showMessageDialog(null, "El resultado es igual a ="+(numero1 - numero2));
                           break;
                           
                       case 3:    
                           numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                           numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                           JOptionPane.showMessageDialog(null, "El resultado es igual a ="+(numero1 * numero2));
                           break;
                           
                       case 4:    
                           numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                           numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                           JOptionPane.showMessageDialog(null, "El resultado es igual a ="+(numero1 / numero2));
                           break;
                           
                       case 5:
                           JOptionPane.showMessageDialog(null,"Regresaste al menu principal");
                           break;
                           
                        default:
                            JOptionPane.showMessageDialog(null,"Su opcion no es valida");
                        break;
                   }
                   }while (op !=5);
                   break;
                   
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrar departamentos");
                    break;
                case 3:
                    
                    JOptionPane.showMessageDialog(null, "Mostrar ciudades");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Seleccionó Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                   break;
            }
            }while(opcion != 4);
    }
    
}


