package map;

import java.util.HashMap;

public class HashMapEx4 {
    public static void main(String[] args) {
        HashMap<String ,Item> myItem = new HashMap<>();

        myItem.put("fruits", new  Item("apple", 150.00, 1.00));

        for(HashMap.Entry<String ,Item> entry : myItem.entrySet()){

            System.out.println(entry.getKey() + " = " + entry.getValue().name +" "+ entry.getValue().weight+"kg"+" " + entry.getValue().price+"Rs");

        }

    }
    
}


class Item{
    String name;
    double price;
    double weight;

    public Item(String name,double price,double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
