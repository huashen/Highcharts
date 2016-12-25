package org.lhs.highcharts;

import lombok.Data;

/**
 * AxisTitle
 *
 * @author longhuashen
 * @since 16/12/24
 */
@Data
public class AxisTitle implements Component {

    private String align;

    private Integer margin;

    private Integer offset;

    private Integer rotation;

    private String text;

}
