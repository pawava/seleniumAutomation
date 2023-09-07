package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test12 {

    Properties properties;
    String path = "/home/sudha-admin/IdeaProjects/POM/src/main/resources/confi.properties";

    public Test12() {

        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getURL() {
        String url = properties.getProperty("url");
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in config file");
    }

    public String getName() {
        String username = properties.getProperty("username");
        if (username != null)
            return username;
        else
            throw new RuntimeException("name not specified in config file");
    }

    public String getPassword() {
        String password = properties.getProperty("password");
        if (password!= null)
            return password;
        else
            throw new RuntimeException("pw not specified in config file");
    }
}
