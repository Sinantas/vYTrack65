package com.vYTrack65.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {

        String path = "Configuration.properties";
try {

    FileInputStream fileInputStream = new FileInputStream(path);

    properties.load(fileInputStream);
    fileInputStream.close();

   }catch (Exception e) {

   }
    System.out.println("Properties check if wrong");

    }


     public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
     }

}
