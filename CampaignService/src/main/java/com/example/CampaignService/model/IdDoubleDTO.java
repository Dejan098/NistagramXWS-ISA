package com.example.CampaignService.model;

public class IdDoubleDTO {
    Integer id1;
    Integer id2;

    public IdDoubleDTO() {
    }

    public IdDoubleDTO(Integer id1, Integer id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }
}
