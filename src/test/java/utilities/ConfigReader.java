package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;


    // to read configuration file
    static{
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties  = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // return key value
    public static String getProperties(String key){
        return properties.getProperty(key);
    }

}
