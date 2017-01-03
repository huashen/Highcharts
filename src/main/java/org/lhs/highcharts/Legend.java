package org.lhs.highcharts;

import lombok.Data;

/**
 * Legend
 *
 * @author longhuashen
 * @since 16/12/25
 */
@Data
public class Legend implements Component {

    private String layout;

    private String align;

    private String verticalAlign;

    private int borderWidth;

    public Legend layout(String layout) {
        this.layout = layout;
        return this;
    }

    public Legend align(String align) {
        this.align = align;
        return this;
    }
}
