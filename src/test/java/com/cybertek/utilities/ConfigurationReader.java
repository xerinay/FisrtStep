package com.cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class ConfigurationReader {
    private static Properties properties;
    static {
        //THIS IS THE path to the location of the file
        String path = "configuration.properties";
        try{
            //reader for the file,java coonot read the file directly, in needs inputstream to read files
            //inputstream takes the location of the file as a construoctor.

        FileInputStream fileInputStream = new FileInputStream(path);
        properties = new Properties();
        //file contents are load the properties from the inputstream
        properties.load(fileInputStream);

        fileInputStream.close();
    }catch(IOException e){
        e.printStackTrace();
}

    }
    //return the value of the property
    public static String getProperty(String property){
        return properties.getProperty(property);

    }
}
