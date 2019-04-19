package com.qf.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonageDto {

    int visit;
    int praise;
    int userInfoId;
    ArrayList<Integer> ids;

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public void setId(ArrayList<Integer> ids) {
        this.ids = ids;
    }


    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "PersonageDto{" +
                "visit=" + visit +
                ", praise=" + praise +
                ", userInfoId=" + userInfoId +
                ", ids=" + ids +
                '}';
    }
}
