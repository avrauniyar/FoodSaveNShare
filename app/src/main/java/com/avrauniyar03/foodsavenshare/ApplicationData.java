package com.avrauniyar03.foodsavenshare;

import android.util.Log;

import java.util.ArrayList;

public class ApplicationData {
    public static ArrayList<FoodInfo> foodList = new ArrayList<FoodInfo>();

    public static ArrayList<FoodInfo> setupData(){
        ArrayList<FoodInfo> list = new ArrayList<>();
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "Good Food Good Mode"));
        return list;
    }
    public static void addFood(String name, String pickupDate, String pickUpTime, String foodCount, String foodType, String storageType, String comment){
        FoodInfo food = new FoodInfo();
        food.setDonarName(name);
        food.setDate(pickupDate);
        food.setTime(pickUpTime);
        food.setFoodCount(foodCount);
        food.setFoodType(foodType);
        food.setStorageType(storageType);
        food.setComment(comment);
        foodList.add(food);
        Log.w("PrintStuf",""+name+" "+pickupDate+" "+pickUpTime+" "+foodCount+" "+foodType+" "+storageType+" "+comment);
    }

}
