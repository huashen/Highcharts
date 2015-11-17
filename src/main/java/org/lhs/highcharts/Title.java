package org.lhs.highcharts;

import org.lhs.highcharts.codec.X;
import org.lhs.highcharts.codec.Y;

/**
 * Title
 * 标题
 *
 * @author longhuashen
 * @since 15/11/7
 */
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public X getAlign() {
        return align;
    }

    public void setAlign(X align) {
        this.align = align;
    }

    public Y getVerticalAlign() {
        return verticalAlign;
    }

    public void setVerticalAlign(Y verticalAlign) {
        this.verticalAlign = verticalAlign;
    }

    public boolean isUseHTML() {
        return useHTML;
    }

    public void setUseHTML(boolean useHTML) {
        this.useHTML = useHTML;
    }

    public boolean isFloating() {
        return floating;
    }

    public void setFloating(boolean floating) {
        this.floating = floating;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
