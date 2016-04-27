package org.lhs.highcharts;

import com.google.gson.Gson;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LineTest {

    @Test
    public void testLine() {
        Option option = new Option();
        option.title().text("Monthly Average Temperature");

        Gson gson = new Gson();
        System.out.println(gson.toJson(option));
    }

}
