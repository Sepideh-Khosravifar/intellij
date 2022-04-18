package src.com.syntax.Class31;

//Create a property file to store following configurations:
//browser=chrome
//url=https://facebook.com
//username
//password
//Read file and extract values of browser & url

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

    public class Task4 {

        public static void main(String[] args) throws IOException {

            String path = "Files/fb.properties";

            FileOutputStream fileOutputStream = new FileOutputStream(path);

            Properties properties = new Properties();

            properties.put("browser","chrome");

            properties.put("url","https://facebook.com");

            properties.put("username", " ");

            properties.put("password", " ");

            properties.store(fileOutputStream, "Created a new properties file");

            System.out.println("browser");

            System.out.println("url");

        }
    }
