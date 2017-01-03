package org.lhs.highcharts;

import lombok.Data;

import java.util.List;

/**
 * XAxis
 *
 * @author longhuashen
 * @since 15/12/8
 */
@Data
public class XAxis implements Component {

    /**
     * 坐标轴刻度是否为小数
     */
    private boolean allowDecimals;

    /**
     * 相间的网格列颜色
     */
    private String alternateGridColor;

    /**
     * 类别名称
     */
    private List<String> categories;

    /**
     * 允许最高的自动计算的坐标轴刻度极端值
     */
    private Integer ceiling;

    /**
     * 日期标签格式
     */

    /**
     * 允许最低的自动计算的坐标轴刻度极端值
     */
    private Integer floor;

    /**
     * 网格线的线条风格样式
     */
    private String gridLineDashStyle;

    /**
     * 网格线的宽度
     */
    private Integer gridLineWidth;

    /**
     * 网格线的z轴方向上的深度
     */
    private Integer gridZIndex;

    /**
     * 轴的id
     */
    private String id;


    public XAxis categories(List<String> categories) {
        this.categories = categories;
        return this;
    }
}
