/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author oracle Pe90
 */
public class Seven {
    
    public void uno(){
        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        if(directorio.exists())
            System.out.println("Directorio existente "+directorio.getPath());
        else
            directorio.mkdir();
    }
    
    public void dos() throws IOException{
        File archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(archivo.exists())
            System.out.println("Archivo existente "+archivo.getPath());
        else
            archivo.createNewFile();
    }
    
    public void cuatro() throws IOException{
        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        File directorio2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        if(directorio.exists()){
            directorio2.mkdir();
            if(directorio2.exists()){
                File archivo2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
                archivo2.createNewFile();
            }
    }
    }
    
    public void cinco(){
        File mostrar = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        String[]ficheros=mostrar.list();
        if(ficheros==null)
            System.out.println("No hay ficheros en esta carpeta");
        else{
        for(int i=0;i<mostrar.length();i++){
            System.out.println(ficheros[i]);
        }   
    }
    }
    
    public void seis(){
        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        if(directorio.exists())
            System.out.println(directorio.getPath());
        else
            System.out.println("No existe el directorio"+directorio.getParent());
    }
    
    public void siete(){
        File archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(archivo.exists()){
            System.out.println(archivo.getName());
            System.out.println(archivo.getPath());
            System.out.println(archivo.canRead());
            System.out.println(archivo.canWrite());
            System.out.println(archivo.getTotalSpace());
    }
        else
            System.out.println("No existe el archivo .txt"+archivo.getParent());
    
}
    public void ocho(){
        File archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(archivo.exists()){
            archivo.setReadable(true);
            archivo.setWritable(false);
        }
        else
            System.out.println("No existe el archivo .txt"+archivo.getParent());
    }
    
    public void nueve(){
        File archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(archivo.exists()){
            archivo.setReadable(true);
            archivo.setWritable(true);
        }
        else
            System.out.println("No existe el archivo .txt"+archivo.getParent());
    }
    
    public void diez(){
        File archivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if(archivo.exists()){
            archivo.delete();
        }
        else
            System.out.println("No existe el archivo .txt"+archivo.getParent());
    }
    
    public void once(){
        File archivo2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
        File directorio2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        if(directorio.exists()){
            archivo2.delete();
            directorio2.delete();
            directorio.delete();
        }
        else
            System.out.println("No existe el directorio"+directorio.getParent());
    }
    
}
