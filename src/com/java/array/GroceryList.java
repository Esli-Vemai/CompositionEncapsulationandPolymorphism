package com.java.array;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItme(String item){
        groceryList.add(item);
    }

    public void displayGroceryItem(){
        System.out.println("you have " + groceryList.size() + "items in your list");
        for (int i =0; i<groceryList.size(); i++ ){
            System.out.println("Item at " + i + "is" + groceryList.get(i));
        }

    }


    public void modifyGroceryList(int index, String newItem){
        groceryList.set(index, newItem);
        System.out.println("Grocery items " + (index + 1) + "has been rmodified");
    }

    public void removeItem(int position){
        String removedItem = groceryList.remove(position);
    }

    public String findItem(String findItem){
        boolean doesExist = groceryList.contains(findItem);
        return null;
    }
}
