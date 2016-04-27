package org.lhs.highcharts;

import lombok.ToString;

import java.io.Serializable;

/**
 * Option
 *
 * @author longhuashen
 * @since 15/11/7
 */
@ToString
public class Option implements Serializable {

    /**
     * Title
     */
    private Title title;

    /**
     * 设置title值
     *
     * @param title
     */
    public Option title(Title title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     *
     * @param text
     * @return
     */
    public Option title(String text) {
        this.title().text(text);
        return this;
    }

    /**
     * 每个图表最多仅有一个标题控件
     */
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }
}
