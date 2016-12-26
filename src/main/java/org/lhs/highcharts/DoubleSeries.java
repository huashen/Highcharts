package org.lhs.highcharts;

import java.util.List;

/**
 * DoubleSeries
 *
 * @author longhuashen
 * @since 16/12/26
 */
public class DoubleSeries extends Series {

    private List<Double> data;

    public DoubleSeries(String name) {
        super(name);
    }

    public DoubleSeries(String name, List<Double> data) {
        super(name);
        this.data = data;
    }
}
