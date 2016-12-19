package org.lhs.highcharts;

import lombok.ToString;

import java.io.Serializable;
import java.util.List;

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
     * 副标题
     */
    private Subtitle subtitle;

    /**
     * 横坐标
     */
    private XAxis xAxis;

    /**
     * 纵坐标
     */
    private YAxis yAxis;


    private List<Series> series;

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

    public Option subtitle(String text) {
        this.subtitle.text(text);
        return this;
    }

    public Subtitle subtitle() {
        if (this.subtitle == null) {
            this.subtitle = new Subtitle();
        }
        return this.subtitle;
    }

    public Option xAxis() {
        if (xAxis == null) {
            this.xAxis = new XAxis();
        }
        return this;
    }

    public Option xAxis(List<String> categories) {
        this.xAxis.setCategories(categories);
        return this;
    }

    public Option series() {
        return this;
    }

    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    public Option yAxis() {
        if (yAxis == null) {
            this.yAxis = new YAxis();
        }
        return this;
    }

    public Option yAxis(List<String> categories) {
        this.yAxis.setCategories(categories);
        return this;
    }

}
