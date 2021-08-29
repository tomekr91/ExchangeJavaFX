package model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class OnlineCourses {

    private Document euroCourses;
    {
        try {
            euroCourses = Jsoup.connect("https://internetowykantor.pl/kurs-euro/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Elements euroBuyCourse = euroCourses.getElementsByClass("kurs kurs_sprzedazy bem-single-rate-box__item-rate");
    private String euroBuyCourseString = euroBuyCourse.get(0).text().replace(',', '.');
    private BigDecimal EURtoPLNBuyCourse = new BigDecimal(euroBuyCourseString);
    private BigDecimal PLNtoEURSellCourse = new BigDecimal("1.0000").divide(EURtoPLNBuyCourse, 4, RoundingMode.HALF_UP);

    private Elements euroSellCourse = euroCourses.getElementsByClass("kurs kurs_kupna bem-single-rate-box__item-rate");
    private String euroSellCourseString = euroSellCourse.get(0).text().replace(',', '.');
    private BigDecimal EURtoPLNSellCourse = new BigDecimal(euroSellCourseString);
    private BigDecimal PLNtoEURBuyCourse = new BigDecimal("1.0000").divide(EURtoPLNSellCourse,4,RoundingMode.HALF_UP);




    public OnlineCourses() {
    }

    public BigDecimal getEURtoPLNBuyCourse() {
        return EURtoPLNBuyCourse;
    }

    public BigDecimal getPLNtoEURBuyCourse() {
        return PLNtoEURBuyCourse;
    }

    public BigDecimal getEURtoPLNSellCourse() {
        return EURtoPLNSellCourse;
    }

    public BigDecimal getPLNtoEURSellCourse() {
        return PLNtoEURSellCourse;
    }
}
