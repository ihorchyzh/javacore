package com.ihorchyzh.app.classwork.lesson5;

import com.ihorchyzh.app.classwork.lesson3.MathFunctions;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by ihorchyzh on 1/30/17.
 */

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

    @Before
    public void setUp() {
        mathFunctions = new MathFunctions();
    }

    public MathFunctions mathFunctions;

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/testData.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunctions.multiply(a, b));
    }

}