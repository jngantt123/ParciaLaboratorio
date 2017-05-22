
package repositoriocalculadorajn;

import com.sun.xml.internal.fastinfoset.EncodingConstants;
import javax.swing.JOptionPane;

/**
 *
 * @author JULIAN
 */
public class RepositorioCalculadoraJN {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a= Integer.parseInt(JOptionPane.showInputDialog("ingrese a"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("ingrese b"));
        
        if(a>b){
            JOptionPane.showMessageDialog(null,"a es mayor su valor es "+ a);
                    
        }else if (b>a){
            JOptionPane.showMessageDialog(null,"b es mayor su valor es "+ b);
                
               }
        else{
         JOptionPane.showMessageDialog(null,"a y b son iguales"+a+": "+b);
        }
           
        }
        
    
    
    
    }
    

