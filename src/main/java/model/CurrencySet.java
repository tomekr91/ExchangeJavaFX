package model;

import java.math.BigDecimal;
import java.util.HashMap;

public class CurrencySet {
    OnlineCourses onlineCourses = new OnlineCourses();
    HashMap<String, BigDecimal> buyCourseList= new HashMap();
    HashMap<String, BigDecimal> sellCourseList= new HashMap();

    CurrencyCourse PLNtoEUR = new CurrencyCourse("PLNtoEUR", onlineCourses.getPLNtoEURBuyCourse(), onlineCourses.getPLNtoEURSellCourse());
    CurrencyCourse PLNtoUSD = new CurrencyCourse("PLNtoUSD", new BigDecimal("0.2704"), new BigDecimal("0.2708"));
    CurrencyCourse PLNtoGBP = new CurrencyCourse("PLNtoGBP", new BigDecimal("0.1912"), new BigDecimal("0.1915"));
    CurrencyCourse PLNtoCHF = new CurrencyCourse("PLNtoCHF", new BigDecimal("0.2430"), new BigDecimal("0.2432"));
    CurrencyCourse EURtoPLN = new CurrencyCourse("EURtoPLN", onlineCourses.getEURtoPLNBuyCourse(), onlineCourses.getEURtoPLNSellCourse());
    CurrencyCourse EURtoUSD = new CurrencyCourse("EURtoUSD", new BigDecimal("1.2180"), new BigDecimal("1.2228"));
    CurrencyCourse EURtoGBP = new CurrencyCourse("EURtoGBP", new BigDecimal("0.8568"), new BigDecimal("0.8655"));
    CurrencyCourse EURtoCHF = new CurrencyCourse("EURtoCHF", new BigDecimal("1.0908"), new BigDecimal("1.0953"));
    CurrencyCourse USDtoEUR = new CurrencyCourse("USDtoEUR", new BigDecimal("0.8178"), new BigDecimal("0.8210"));
    CurrencyCourse USDtoPLN = new CurrencyCourse("USDtoPLN", new BigDecimal("3.6929"), new BigDecimal("3.6974"));
    CurrencyCourse USDtoGBP = new CurrencyCourse("USDtoGBP", new BigDecimal("0.7039"), new BigDecimal("0.7092"));
    CurrencyCourse USDtoCHF = new CurrencyCourse("USDtoCHF", new BigDecimal("0.8974"), new BigDecimal("0.9039"));
    CurrencyCourse GBPtoEUR = new CurrencyCourse("GBPtoEUR", new BigDecimal("1.1554"), new BigDecimal("1.2228"));
    CurrencyCourse GBPtoUSD = new CurrencyCourse("GBPtoUSD", new BigDecimal("1.4101"), new BigDecimal("1.4206"));
    CurrencyCourse GBPtoPLN = new CurrencyCourse("GBPtoPLN", new BigDecimal("5.2220"), new BigDecimal("5.2289"));
    CurrencyCourse GBPtoCHF = new CurrencyCourse("GBPtoCHF", new BigDecimal("1.2677"), new BigDecimal("1.2787"));
    CurrencyCourse CHFtoEUR = new CurrencyCourse("CHFtoEUR", new BigDecimal("0.9130"), new BigDecimal("0.9168"));
    CurrencyCourse CHFtoUSD = new CurrencyCourse("CHFtoUSD", new BigDecimal("1.1063"), new BigDecimal("1.1143"));
    CurrencyCourse CHFtoGBP = new CurrencyCourse("CHFtoGBP", new BigDecimal("0.7820"), new BigDecimal("0.7888"));
    CurrencyCourse CHFtoPLN = new CurrencyCourse("CHFtoPLN", new BigDecimal("4.1120"), new BigDecimal("4.1165"));
    CurrencyCourse PLNtoPLN = new CurrencyCourse("PLNtoPLN", new BigDecimal("1.0000"), new BigDecimal("1.0000"));
    CurrencyCourse EURtoEUR = new CurrencyCourse("EURtoEUR", new BigDecimal("1.0000"), new BigDecimal("1.0000"));
    CurrencyCourse USDtoUSD = new CurrencyCourse("USDtoUSD", new BigDecimal("1.0000"), new BigDecimal("1.0000"));
    CurrencyCourse CHFtoCHF = new CurrencyCourse("CHFtoCHF", new BigDecimal("1.0000"), new BigDecimal("1.0000"));
    CurrencyCourse GBPtoGBP = new CurrencyCourse("GBPtoGBP", new BigDecimal("1.0000"), new BigDecimal("1.0000"));

    public CurrencySet() {
        buyCourseList.put(PLNtoEUR.getName(), PLNtoEUR.getBuyCourse());
        buyCourseList.put(PLNtoUSD.getName(), PLNtoUSD.getBuyCourse());
        buyCourseList.put(PLNtoGBP.getName(), PLNtoGBP.getBuyCourse());
        buyCourseList.put(PLNtoCHF.getName(), PLNtoCHF.getBuyCourse());
        buyCourseList.put(EURtoPLN.getName(), EURtoPLN.getBuyCourse());
        buyCourseList.put(EURtoUSD.getName(), EURtoUSD.getBuyCourse());
        buyCourseList.put(EURtoGBP.getName(), EURtoGBP.getBuyCourse());
        buyCourseList.put(EURtoCHF.getName(), EURtoCHF.getBuyCourse());
        buyCourseList.put(USDtoEUR.getName(), USDtoEUR.getBuyCourse());
        buyCourseList.put(USDtoPLN.getName(), USDtoPLN.getBuyCourse());
        buyCourseList.put(USDtoGBP.getName(), USDtoGBP.getBuyCourse());
        buyCourseList.put(USDtoCHF.getName(), USDtoCHF.getBuyCourse());
        buyCourseList.put(GBPtoEUR.getName(), GBPtoEUR.getBuyCourse());
        buyCourseList.put(GBPtoUSD.getName(), GBPtoUSD.getBuyCourse());
        buyCourseList.put(GBPtoPLN.getName(), GBPtoPLN.getBuyCourse());
        buyCourseList.put(GBPtoCHF.getName(), GBPtoCHF.getBuyCourse());
        buyCourseList.put(CHFtoEUR.getName(), CHFtoEUR.getBuyCourse());
        buyCourseList.put(CHFtoUSD.getName(), CHFtoUSD.getBuyCourse());
        buyCourseList.put(CHFtoGBP.getName(), CHFtoGBP.getBuyCourse());
        buyCourseList.put(CHFtoPLN.getName(), CHFtoPLN.getBuyCourse());
        buyCourseList.put(PLNtoPLN.getName(), PLNtoPLN.getBuyCourse());
        buyCourseList.put(EURtoEUR.getName(), EURtoEUR.getBuyCourse());
        buyCourseList.put(USDtoUSD.getName(), USDtoUSD.getBuyCourse());
        buyCourseList.put(GBPtoGBP.getName(), GBPtoGBP.getBuyCourse());
        buyCourseList.put(CHFtoCHF.getName(), CHFtoCHF.getBuyCourse());

        sellCourseList.put(PLNtoEUR.getName(), PLNtoEUR.getSellCourse());
        sellCourseList.put(PLNtoUSD.getName(), PLNtoUSD.getSellCourse());
        sellCourseList.put(PLNtoGBP.getName(), PLNtoGBP.getSellCourse());
        sellCourseList.put(PLNtoCHF.getName(), PLNtoCHF.getSellCourse());
        sellCourseList.put(EURtoPLN.getName(), EURtoPLN.getSellCourse());
        sellCourseList.put(EURtoUSD.getName(), EURtoUSD.getSellCourse());
        sellCourseList.put(EURtoGBP.getName(), EURtoGBP.getSellCourse());
        sellCourseList.put(EURtoCHF.getName(), EURtoCHF.getSellCourse());
        sellCourseList.put(USDtoEUR.getName(), USDtoEUR.getSellCourse());
        sellCourseList.put(USDtoPLN.getName(), USDtoPLN.getSellCourse());
        sellCourseList.put(USDtoGBP.getName(), USDtoGBP.getSellCourse());
        sellCourseList.put(USDtoCHF.getName(), USDtoCHF.getSellCourse());
        sellCourseList.put(GBPtoEUR.getName(), GBPtoEUR.getSellCourse());
        sellCourseList.put(GBPtoUSD.getName(), GBPtoUSD.getSellCourse());
        sellCourseList.put(GBPtoPLN.getName(), GBPtoPLN.getSellCourse());
        sellCourseList.put(GBPtoCHF.getName(), GBPtoCHF.getSellCourse());
        sellCourseList.put(CHFtoEUR.getName(), CHFtoEUR.getSellCourse());
        sellCourseList.put(CHFtoUSD.getName(), CHFtoUSD.getSellCourse());
        sellCourseList.put(CHFtoGBP.getName(), CHFtoGBP.getSellCourse());
        sellCourseList.put(CHFtoPLN.getName(), CHFtoPLN.getSellCourse());
        sellCourseList.put(PLNtoPLN.getName(), PLNtoPLN.getSellCourse());
        sellCourseList.put(EURtoEUR.getName(), EURtoEUR.getSellCourse());
        sellCourseList.put(USDtoUSD.getName(), USDtoUSD.getSellCourse());
        sellCourseList.put(GBPtoGBP.getName(), GBPtoGBP.getSellCourse());
        sellCourseList.put(CHFtoCHF.getName(), CHFtoCHF.getSellCourse());
    }

    public HashMap<String, BigDecimal> getBuyCourseList() {
        return buyCourseList;
    }

    public void setBuyCourseList(HashMap<String, BigDecimal> buyCourseList) {
        this.buyCourseList = buyCourseList;
    }

    public HashMap<String, BigDecimal> getSellCourseList() {
        return sellCourseList;
    }

    public void setSellCourseList(HashMap<String, BigDecimal> sellCourseList) {
        this.sellCourseList = sellCourseList;
    }
}
