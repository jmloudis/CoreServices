package com.example.core_services.util.testing;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class TestAssistant
{

    public static Properties readPropertiesFile(String filePath)
    {
        Properties props = new Properties();

        try{
            ClassPathResource resource = new ClassPathResource(filePath);
            if (resource.exists())
            {
                PropertiesLoaderUtils.fillProperties(props, resource);
            }
            else{
                System.out.println("No properties file");
            }
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    
}
