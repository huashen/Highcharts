package org.lhs.highcharts;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Series
 *
 * @author longhuashen
 * @since 16/12/20
 */
@Data
@AllArgsConstructor
public class Series implements Component {

    private String name;

    private List<Double> data;



}
