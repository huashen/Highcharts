package org.lhs.highcharts;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.junit.Test;
import org.lhs.highcharts.util.OptionUtil;

import java.util.List;

/**
 * BarTest
 *
 * @author longhuashen
 * @since 17/1/3
 */
public class BarTest {

    @Test
    public void barTest() {
        Option option = new Option();


        option.chart().type("bar");

        //设置标题
        option.title().text("Historic World Population by Region").x(-20).y(5);
        //设置副标题
        option.subtitle().text("Source: Wikipedia.org").x(-20).y(20);

        option.xAxis().categories(Lists.newArrayList("Africa", "America", "Asia", "Europe", "Oceania"));

        //设置纵轴
        AxisTitle axisTitle = new AxisTitle();
        axisTitle.setText("Nuclear weapon states");
        axisTitle.setAlign("high");
        option.yAxis().title(axisTitle);

        //设置数据提示框
        option.tooltip().valueSuffix("millions");

        option.legend().layout("vertical").align("right");



        List<Series> series = Lists.newArrayList();
        List<Integer> list1 = Lists.newArrayList(107, 31, 635, 203, 2);
        List<Integer> list2 = Lists.newArrayList(133, 156, 947, 408, 6);
        List<Integer> list3 = Lists.newArrayList(973, 914, 4054, 732, 34);

        series.add(new IntegerSeries("Year 1800", list1));
        series.add(new IntegerSeries("Year 1900", list2));
        series.add(new IntegerSeries("Year 2008", list3));


        option.series().series(series);

        Gson gson = new Gson();
        System.out.println(gson.toJson(option));

        OptionUtil.exportToHtml(option, "/tmp/highcharts", "bar.html");
    }
}
