package com.example.datasource.dao;

/**
 * Created by sutaiyun on 2017/3/14.
 */
public class Country {
    private static final long serialVrsionUID = 1L;

    private long id;
    private String countryname;
    private String countrycode;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return getId() + ":" + getCountryname() + ":" + getCountrycode();
    }
}
