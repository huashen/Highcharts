package org.lhs.highcharts;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.junit.Test;
import org.lhs.highcharts.util.OptionUtil;

import java.util.List;

/**
 * ChartTest
 *
 * @author longhuashen
 * @since 16/12/26
 */
public class ChartTest {

    @Test
    public void chartTest() {
        Option option = new Option();


        option.chart().type("area");

        //设置标题
        option.title().text("US and USSR nuclear stockpiles").x(-20).y(5);
        //设置副标题
        option.subtitle().text("Source: <a href=\"http://thebulletin.metapress.com/content/c4120650912x74k7/fulltext.pdf\">thebulletin.metapress.com</a>").x(-20).y(20);

        //设置纵轴
        AxisTitle axisTitle = new AxisTitle();
        axisTitle.setText("Nuclear weapon states");
        option.yAxis().title(axisTitle);

        //设置数据提示框
        option.tooltip().pointFormat("{series.name} produced <b>{point.y:,.0f}</b><br/>warheads in {point.x}").followPointer(true).enabled(true);



        List<Series> series = Lists.newArrayList();
        List<Integer> list1 = Lists.newArrayList(null, null, null, null, null, 6, 11, 32, 110, 235, 369, 640,
                1005, 1436, 2063, 3057, 4618, 6444, 9822, 15468, 20434, 24126,
                27387, 29459, 31056, 31982, 32040, 31233, 29224, 27342, 26662,
                26956, 27912, 28999, 28965, 27826, 25579, 25722, 24826, 24605,
                24304, 23464, 23708, 24099, 24357, 24237, 24401, 24344, 23586,
                22380, 21004, 17287, 14747, 13076, 12555, 12144, 11009, 10950,
                10871, 10824, 10577, 10527, 10475, 10421, 10358, 10295, 10104);
        List<Integer> list2 = Lists.newArrayList(null, null, null, null, null, null, null, null, null, null,
                5, 25, 50, 120, 150, 200, 426, 660, 869, 1060, 1605, 2471, 3322,
                4238, 5221, 6129, 7089, 8339, 9399, 10538, 11643, 13092, 14478,
                15915, 17385, 19055, 21205, 23044, 25393, 27935, 30062, 32049,
                33952, 35804, 37431, 39197, 45000, 43000, 41000, 39000, 37000,
                35000, 33000, 31000, 29000, 27000, 25000, 24000, 23000, 22000,
                21000, 20000, 19000, 18000, 18000, 17000, 16000);

        series.add(new IntegerSeries("USA", list1));
        series.add(new IntegerSeries("USSR/Russia", list2));


        option.series().series(series);

        Gson gson = new Gson();
        System.out.println(gson.toJson(option));

        OptionUtil.exportToHtml(option, "/tmp/highcharts", "chart.html");
    }
}
