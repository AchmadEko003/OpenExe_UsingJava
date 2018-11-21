/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated_application;
 
import java.util.Locale;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Nitani
 */
public class Automated_Application {
    static String myUrl;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        openExe();
//        urlOut(args);
//        DesktopSupported desktopSupported = new DesktopSupported();
//        desktopSupported.desktopsupport(myUrl);
    }
    
    public static String urlOut(String[] args){
        //set string values
        String defaultUrl = "http://www.google.com";
        myUrl = "http://www.bing.com";
        System.out.println("");
  
        //if args[] array is empty open google else open args
        if (args.length == 0){
            myUrl = defaultUrl;
        }else{
            myUrl = Arrays.toString(args);      //cast args to string and assign to myUrl string 
            myUrl = myUrl.replace("[", "");     //remove [ from myUrl string
            myUrl = myUrl.replace("]", "");     //remove ] from myUrl string
            myUrl = myUrl.toLowerCase();        //Change case to lower to prevent miss match on string compare/contains below
                                  
           //check if no "http://" is found in myUrl string to prevent exception, prepend myUrl string with "http://"
            if (!myUrl.contains("http://")){     //condition
                StringBuilder buildmyUrl = new StringBuilder(myUrl);    //create stringBuilder object pass myUrl string
                //System.out.println(myUrl+ " ...before string builder");   //test
                buildmyUrl = buildmyUrl.insert(0, "http://");           //prepend myUrl string with "http://"
                myUrl = buildmyUrl.toString();                          //cast prepended buildmyUrl string back to myUrl string
                //.out.println(myUrl+" ...after string builder");   //test
            }//end inner if
        }//end else 
          
        return myUrl;
                      
    }    
    
    public static void openFile() throws IOException{
        File file = new File("D:\\");
        Desktop desktop = Desktop.getDesktop();
        file = new File("D:\\Sertifikat BNSP.pdf");
        if(file.exists()) desktop.open(file);
    }
    
    public static void openExe(){
        Runtime app=Runtime.getRuntime();
        String chrome = "C:\\Users\\Nitani\\AppData\\Roaming\\Spotify\\Spotify.exe";
        try
        {
            app.exec(chrome);
            //System.out.println("");
        }
        catch (Exception Ex)
        {
            System.out.println("Error: " + Ex.toString());
        }
    }
    
}
