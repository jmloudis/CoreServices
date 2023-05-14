package com.northstarcomm.test_services.util.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class TestAssistant
{

    public static Logger LOGGER = LoggerFactory.getLogger(TestAssistant.class);

    public static Properties readPropertiesFile(String filePath)
    {
        Properties props = new Properties();

        try{
            ClassPathResource resource = new ClassPathResource(filePath);
            if (resource.exists()) {
                PropertiesLoaderUtils.fillProperties(props, resource);
            }
            return props;
        } catch (IOException e) {
            LOGGER.info("Unable to find resource file");
            throw new RuntimeException(e);
        }
    }


    
}
