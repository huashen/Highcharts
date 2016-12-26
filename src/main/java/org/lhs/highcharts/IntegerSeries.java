package org.lhs.highcharts;

import java.util.List;

/**
 * IntegerSeries
 *
 * @author longhuashen
 * @since 16/12/26
 */
public class IntegerSeries extends Series {

    private List<Integer> data;

    public IntegerSeries(String name) {
        super(name);
    }

    public IntegerSeries(String name, List<Integer> data) {
        super(name);
        this.data = data;
    }
}
