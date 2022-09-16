package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private final Properties props;

    public PropertiesReader(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)){
            props = new Properties();
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String propertyKey){
        return props.getProperty(propertyKey, null);
    }


}
