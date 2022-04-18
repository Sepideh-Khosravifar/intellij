package src.com.syntax.class32;

import src.com.syntax.Util.ConfigReader;
import java.io.IOException;

    public class configReaderTester {

        public static void main(String[] args) throws IOException {

            System.out.println(ConfigReader.getProperty("URl"));

            System.out.println(ConfigReader.getProperty("password"));
        }
    }
