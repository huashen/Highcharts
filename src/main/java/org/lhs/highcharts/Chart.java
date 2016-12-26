package org.lhs.highcharts;

import lombok.Data;

/**
 * Chart
 *
 * @author longhuashen
 * @since 16/12/26
 */
@Data
public class Chart implements Component {

    private String type;

    public Chart type(String type) {
        this.type = type;
        return this;
    }
}
