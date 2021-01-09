
import java.util.Scanner;

public class Ex3 {
    
    double v1,v2,v3,x;
    
    public int ler (Scanner leitor) {
        
       
       
       System.out.println ("\n Digite o primeiro valor:");
       v1= leitor.nextDouble ();
       System.out.println ("\n Digite o segundo valor:");
       v2= leitor.nextDouble ();
       System.out.println ("\n Digite o terceiro valor:");
       v3= leitor.nextDouble (); 
       return 0; }
    
       
    public double Calcular () {
                       
        
         x= ((v1*v1) + (v2*v2) + (v3*v3));
                 
         return x;
             
    }
    
    public void Mostrar () {
                       
        
       System.out.println ("\n A soma dos quadrados dos valores é: " +x);
             
    }
           
    public static void main ( String [] args) { 
        
        Ex3 e3 = new Ex3 ( );
        
        Scanner leitor = new Scanner(System.in); 
        
        double  v1,v2,v3,x;
        
        int tecla;  
                
        System.out.println("\nMENU \n 1- Executar\n 2 - Sair \n"); 
        tecla = leitor.nextInt();  
        
        switch (tecla) {  
            
            case 1: 
                e3. ler (leitor);
                x = e3.Calcular();
                e3.Mostrar();
                
            
            break;   
            
            case 2: 
              
            System.out.println("\nFim do programa!\n");  
            System.exit (0); 
                
            break;}}     
} 