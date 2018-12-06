package com.avrauniyar03.foodsavenshare;

import android.util.Log;

import java.util.ArrayList;

public class ApplicationData {
    public static ArrayList<FoodInfo> foodList = new ArrayList<FoodInfo>();

    public static void listOfFood(){
        ArrayList<FoodInfo> list = new ArrayList<>();
        list.add(new FoodInfo("Donor Restaurant", "Tuna can", "12/06/2018", "17:22", "2", "Canned Goods", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("Donor Restaurant", "Rice 10kg", "12/06/2018", "17:22", "1", "Open Grocery (Greater than 1 month expiry)", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("Donor Restaurant", "Tortilla", "12/10/2018", "17:02", "3", "Open Grocery (Greater than 1 month expiry)", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("Donor Restaurant", "Spinach 300g bag", "12/07/2018", "12:00", "3", "Dry", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("Donor Restaurant", "Pepperoni Pizza", "12/05/2018", "20:30", "2", "Cooked Meal", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
        list.add(new FoodInfo("Donor Restaurant", "Pig Roast", "12/06/2018", "21:00", "1", "Cooked Meal", "Dry", "125 Lilac St, Syracuse, NY","Good Food Good Mode"));
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
