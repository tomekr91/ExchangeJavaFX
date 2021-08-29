package model;

import java.math.BigDecimal;

public class CurrencyCourse {
    private BigDecimal buyCourse;
    private BigDecimal sellCourse;
    private String name;

    public CurrencyCourse(String name, BigDecimal buyCourse, BigDecimal sellCourse){
        this.name = name;
        this.buyCourse = buyCourse;
        this.sellCourse = sellCourse;
    }

    public BigDecimal getBuyCourse() {
        return buyCourse;
    }

    public void setBuyCourse(BigDecimal buyCourse) {
        this.buyCourse = buyCourse;
    }

    public BigDecimal getSellCourse() {
        return sellCourse;
    }

    public void setSellCourse(BigDecimal sellCourse) {
        this.sellCourse = sellCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
