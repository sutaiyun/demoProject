package com.example.datasource.dao;

import java.io.Serializable;

/**
 * Created by sutaiyun on 2017/3/14.
 */
public class City implements Serializable {
    private static final long serialVrsionUID = 1L;

    private long id;
    private String name;
    private String state;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return getId() + ":" + getName() + ":" + getState();
    }
}
