package com.myapplicationdev.android.p02_holidays;

public class PublicHoliday {
    private String name;
    private String date;

    public PublicHoliday(String name, String date) {
        this.name = name;
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

}
