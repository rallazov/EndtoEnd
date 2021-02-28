package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Throwable
    {
    	System.out.println("Print this first");
        System.out.println( "Hello World!" );
        //we created properties file first and set the data.
        Properties prop= new Properties();
        //we had to locate file to extract with FIS
        FileInputStream fis= new FileInputStream("C:\\Users\\abdi2\\eclipse-workspace\\E2EProject\\data.properties");
        //we use load method to read / extract the file
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        //we can  manupilate with data value on runtime but it won't change in proprties file
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));
        //but if we create FOS object and give the same proprties location we can actually store manupilated data
       FileOutputStream out =new FileOutputStream("C:\\Users\\abdi2\\eclipse-workspace\\E2EProject\\data.properties");
       // this is the method called store() we use to store data. store for writing load()for reading.
		prop.store(out , null);
    }
}
