package com.sergey.kataev;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Product> nameProductHashMap = new HashMap<>();
        nameProductHashMap.put("Кубики", new Product(1121, "Материал: Дерево\nВозраст: 3+\n"));
        nameProductHashMap.put("Кукла", new Product(1121, "Материал: Пластик\nВозраст: 6+\n"));
        nameProductHashMap.put("Поезд", new Product(1121, "Материал: Пластик и металл\nВозраст: 6+\n"));
        nameProductHashMap.put("Плюшевая игрушка", new Product(1121, "Материал: плюш\nВозраст: 6+\n"));
        System.out.println("Пары значений из entrySet");
        for (Map.Entry<String, Product> i : nameProductHashMap.entrySet()){
            System.out.println("Название игрушки: "+ i.getKey());
            System.out.println("id: "+ i.getValue().getId());
            System.out.println("Описание:\n"+ i.getValue().getDescription());
        }

        System.out.println("Пары значений из keySet");
        for (String i : nameProductHashMap.keySet()){
            System.out.println(i);
        }
        System.out.println("Пары значений из valueSet");
        for (Product i : nameProductHashMap.values()){
            System.out.println("id: "+ i.getId());
            System.out.println("Описание:\n"+ i.getDescription());
        }




    }
}
