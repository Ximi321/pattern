package com.ximi.design.pattern.strategy;

public class Range {

    /**
     *
     */
    private Integer min;

    /**
     *
     */
    private Integer max;

    public Range(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
