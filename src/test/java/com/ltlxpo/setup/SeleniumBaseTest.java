package com.ltlxpo.setup;

import org.testng.annotations.AfterClass;

import static com.ltlxpo.setup.SeleniumDriver.getDriver;

/**
 * SeleniumBaseTest
 *
 */
public class SeleniumBaseTest {
    @AfterClass
    public static void tearDown() {
        getDriver().close();
    }
}
