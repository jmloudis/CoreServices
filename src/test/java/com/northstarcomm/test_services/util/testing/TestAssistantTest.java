package com.northstarcomm.test_services.util.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Properties;

import static com.northstarcomm.test_services.util.testing.TestAssistant.readPropertiesFile;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestAssistantTest {


    @Test
    public void testReadPropertiesFileSuccess() {
        Properties properties = readPropertiesFile("test-data.properties");
        String testValue = "bar";
        String testKey = "foo";

        assertEquals(testKey, properties.getProperty("key"));
        assertEquals(testValue, properties.getProperty("value"));
    }


}