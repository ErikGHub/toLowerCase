
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Minusculas {
    public static void main(String args[]){
        
        String cadena = "CADENA de CARACTERES";
      String mayus = cadena.toUpperCase();
        String minus = cadena.toLowerCase();
       // cadena.startsWith("C");
      //  cadena.equals("CADENA");
      //
        
        
        
        
        System.out.println("Texto inicial: "+cadena);
        System.out.println("Texto en Mayusculas: "+mayus);
        System.out.println("Texto en Minusculas: "+minus);
        System.out.println("startsWith \"C\": "+cadena.startsWith("C"));
        System.out.println("endsWith \"C\": "+cadena.endsWith("S"));
        System.out.println("equals \"CADENA\": "+cadena.equals("CADENA"));
        System.out.println("replace: "+cadena.replace("A","I"));
        System.out.println("indexOf \"T\": "+cadena.indexOf("T"));
        System.out.println("charAt 2: "+cadena.charAt(2));
        System.out.println("length : "+cadena.length());
     
        
        
        
        
    }
    
}