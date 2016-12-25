package org.lhs.highcharts;

import lombok.Data;
import org.lhs.highcharts.codec.X;
import org.lhs.highcharts.codec.Y;

/**
 * Title
 * 标题
 *
 * @author longhuashen
 * @since 15/11/7
 */
@Data
public class Title implements Component {

    /**
     * 标题的文字
     */
    private String text;

    /**
     * 文字水平对齐方式
     */
    private X align;

    /**
     * 文字垂直对齐方式
     */
    private Y verticalAlign;

    /**
     * 是否解析HTML标签
     */
    private boolean useHTML;

    /**
     * 是否浮动
     */
    private boolean floating;

    /**
     * 标题和图标区的间隔，当有副标题时，表示标题和副标题之间的间隔
     */
    private int margin;

    /**
     * 相对于水平对齐的偏移量，可以是负数，单位是px
     */
    private int x;

    /**
     * 相对于垂直对齐的偏移量，可以使负数，单位是px
     */
    private int y;

    /**
     * 设置text值
     *
     * @param text
     */
    public Title text(String text) {
        this.text = text;
        return this;
    }

    public Title x(int x) {
        this.x = x;
        return this;
    }

    public Title y(int y) {
        this.y = y;
        return this;
    }
}
