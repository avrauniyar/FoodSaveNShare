package com.avrauniyar03.foodsavenshare;

public class FoodInfo {
    private String donarName;
    private String foodName;
    private String date;
    private String time;
    private String foodCount;
    private String foodType;
    private String storageType;
    private String comment;

    public FoodInfo(){

    }

    public FoodInfo(String dn, String fn, String dt, String tm, String fc, String ft, String st, String cmt){
        this.donarName = dn;
        this.foodName = fn;
        this.date = dt;
        this.time = tm;
        this.foodCount = fc;
        this.foodType = ft;
        this.storageType = st;
        this.comment = cmt;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
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
}
