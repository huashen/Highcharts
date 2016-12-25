package org.lhs.highcharts;

/**
 * Tooltip
 * 数据提示框
 *
 * @author longhuashen
 * @since 15/11/7
 */
public class Tooltip implements Component {

    /**
     * 启用或禁用数据提示框提示框的动画效果
     */
    private boolean animation;

    /**
     * 背景颜色
     */
    private String backgroundColor;

    /**
     * 边框颜色
     */
    private String borderColor;

    /**
     * 边框圆角
     */
    private int borderRadius;

    /**
     * 边框宽度
     */
    private int borderWidth;

    /**
     * 启用或禁用提示框
     */
    private boolean enabled;

    /**
     * 当鼠标跨列的时候，提示框是否应该跟随它
     */
    private boolean followPointer;

    private String valueSuffix;

    public Tooltip valueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
        return this;
    }

    public Tooltip followPointer(boolean followPointer) {
        this.followPointer = followPointer;
        return this;
    }

    public Tooltip enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
