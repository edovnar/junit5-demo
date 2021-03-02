package com.zebrunner;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample {

    @Test
    public void test() throws InterruptedException {

        Map<String, String> envVars = new TreeMap<>(System.getenv());
        envVars.forEach((key, value) -> System.out.println(key + ": " + value));
        TimeUnit.SECONDS.sleep(15);
        assertEquals(true, true);
    }

}
