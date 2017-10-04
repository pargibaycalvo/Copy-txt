package copybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author oracle PED90
 */
public class One {
    
    public void copy(){
        File origen = new File("/home/oracle/NetBeansProjects/copybytestexto/text1.txt");
        File destino = new File("/home/oracle/NetBeansProjects/copybytestexto/text2.txt");
        try{
            InputStream in=new FileInputStream(origen);
            OutputStream out =new FileOutputStream(destino);
            
            byte[]buf=new byte[1024];
            int len;
            while((len=in.read(buf))>0){
                out.write(buf, 0, len);
            }
            
            in.close();
            out.close();
            System.out.println("Texto copiado");
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}
