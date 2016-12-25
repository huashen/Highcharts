package org.lhs.highcharts;

import lombok.Data;

import java.util.List;

/**
 * YAxis
 *
 * @author longhuashen
 * @since 15/12/8
 */
@Data
public class YAxis implements Component {

    /**
     * 坐标轴刻度值是否允许为小数
     */
    private boolean allowDecimals;

    /**
     * 相间的网格行颜色
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
     * 结束于标线,是否强制轴线在标线处结束
     */
    private boolean endOnTick;

    /**
     * 允许最低的自动计算的坐标轴刻度极端值
     */
    private Integer floor;

    /**
     * 网格线的颜色
     */
    private String gridLineColor;

    /**
     * 网格线的线条风格样式
     */
    private String gridLineDashStyle;

    /**
     * 仅在雷达图中使用。链接分类名称之间的多边形或是圆型的网格线，可取的值为：circle or polygon
     */
    private String gridLineInterpolation;

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

    /**
     * 轴线的颜色
     */
    private String lineColor;

    /**
     * 轴线的宽度
     */
    private String lineWidth;


    private AxisTitle title;

    public YAxis title(AxisTitle axisTitle) {
        this.title = axisTitle;
        return this;
    }
}
