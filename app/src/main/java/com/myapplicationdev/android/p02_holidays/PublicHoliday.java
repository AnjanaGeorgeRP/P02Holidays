package com.myapplicationdev.android.p02_holidays;

public class PublicHoliday {
    private String name;
    private String date;
    private int image;

    public PublicHoliday(String name, String date, int image) {
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getImage(){ return image; }

}
