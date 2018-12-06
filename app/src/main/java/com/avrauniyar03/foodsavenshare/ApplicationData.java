package com.avrauniyar03.foodsavenshare;

import android.util.Log;

import java.util.ArrayList;

public class ApplicationData {
    public static ArrayList<FoodInfo> foodList = new ArrayList<FoodInfo>();

    public static void listOfFood(){
        ArrayList<FoodInfo> list = new ArrayList<>();
        list.add(new FoodInfo("John Doe", "Tuna", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Rice", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Puri", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Dog Food", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Pizza", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("John Doe", "Pig", "01/12/2018", "02:22", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        foodList.addAll(list);
    }
    public static void addFood(String name, String pickupDate, String pickUpTime, String foodCount, String foodType, String storageType,String address, String comment){
        FoodInfo food = new FoodInfo();
        food.setDonorName("Donor Restaurant");
        food.setDonorName(name);
        food.setFoodName(name);
        food.setDate(pickupDate);
        food.setTime(pickUpTime);
        food.setFoodCount(foodCount);
        food.setFoodType(foodType);
        food.setStorageType(storageType);
        food.setAddress(address);
        food.setComment(comment);
        foodList.add(food);
        Log.w("PrintStuf",""+name+" "+pickupDate+" "+pickUpTime+" "+foodCount+" "+foodType+" "+storageType+" "+comment);
    }

}
