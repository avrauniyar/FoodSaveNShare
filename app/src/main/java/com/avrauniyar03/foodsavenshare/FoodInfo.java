package com.avrauniyar03.foodsavenshare;

public class FoodInfo {
    private String donorName;
    private String foodName;
    private String date;
    private String time;
    private String foodCount;
    private String foodType;
    private String storageType;
    private String address;
    private String comment;

    public FoodInfo(){

    }

    public FoodInfo(String dn, String fn, String dt, String tm, String fc, String ft, String st, String adr, String cmt){
        this.donorName = dn;
        this.foodName = fn;
        this.date = dt;
        this.time = tm;
        this.foodCount = fc;
        this.foodType = ft;
        this.storageType = st;
        this.address = adr;
        this.comment = cmt;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(String foodCount) {
        this.foodCount = foodCount;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
