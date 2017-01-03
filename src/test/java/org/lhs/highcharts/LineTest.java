package org.lhs.highcharts;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.junit.Test;
import org.lhs.highcharts.util.OptionUtil;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class LineTest {

    @Test
    public void testLine() {
        Option option = new Option();
        //设置标题
        option.title().text("Monthly Average Temperature").x(-20).y(5);
        //设置副标题
        option.subtitle().text("Source: WorldClimate.com").x(-20).y(20);

        //设置纵轴
        AxisTitle axisTitle = new AxisTitle();
        axisTitle.setText("Temperature (°C)");
        option.yAxis().title(axisTitle);

        //设置数据提示框
        option.tooltip().valueSuffix("°C").followPointer(true).enabled(true);

        //设置横轴
        List<String> categories = Lists.newArrayList("Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        option.xAxis().categories(categories);


        List<Series> series = Lists.newArrayList();
        List<Double> list1 = Lists.newArrayList(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6);
        List<Double> list2 = Lists.newArrayList(-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5);
        List<Double> list3 = Lists.newArrayList(-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0);
        List<Double> list4 = Lists.newArrayList(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8);
        series.add(new DoubleSeries("Tokyo", list1));
        series.add(new DoubleSeries("New York", list2));
        series.add(new DoubleSeries("Berlin", list3));
        series.add(new DoubleSeries("London", list4));

        option.series().series(series);

        Gson gson = new Gson();
        System.out.println(gson.toJson(option));

        OptionUtil.exportToHtml(option, "/tmp/highcharts", "line.html");
    }

}
