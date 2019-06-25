package com.company;

import newPackege.NutrifictionJavaBean;
import newPackege.NutrifictionStatic;
import newPackege.NutritionFacts;

import java.io.OutputStream;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        NutritionFacts.Builder builder = new NutritionFacts.Builder(12, 2);

        NutritionFacts nutritionFacts = builder.carbohydrate(2).build();
        NutritionFacts nutritionFacts1 = builder.fat(5555).build();
        nutritionFacts1 = builder.sodium(2).carbohydrate(2).fat(34).build();

        System.out.println();

        NutrifictionJavaBean nutrifictionJavaBean = new NutrifictionJavaBean();
        nutrifictionJavaBean.setCarbohydrate(2);
        nutrifictionJavaBean.setCalories(3);
        char[] chars = {'a','a','d'};
String dd =new String(chars,0,5);

        OutputStream stream = openOutputStream();
// что-то делаем со stream
        stream.close();
        System.out.println();
        NutrifictionStatic nutrifictionStatic = NutrifictionStatic.createInstanceOfNutr();
        NutrifictionStatic nutrifictionStati1c = NutrifictionStatic.createInstanceOfNutr();

//        System.out.print('H' + 'a');


//        for(int i = 9; i >=     0; i--){
//                System.out.print(i + " ");
//        }

//
//        List<String> lists = new ArrayList<>(Arrays.asList("Google", "Oracle", "JetBrains"));
//
//        System.out.println(lists);

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        Integer[] array = list.toArray(new Integer[0]);
//        Integer[] array2 = new Integer[3];
//        int index = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (i % 2 == 1) {
//                array2[index] = array[i];
//                index++;
//            }
//        }
//
//        List<Integer> listt = new ArrayList<>(Arrays.asList(array2));
//        Collections.reverse(listt);
//        listt.forEach(System.out::print);
//        for (int i = array2.length-1; i >= 0; i--) {
//            System.out.print(array2[i]+" ");
//        }


//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(3);
//        list3.add(1);
//        list3.add(2);
//
//        list1.equals(list1);
//        list1.equals(list2);
//        list1.equals(list3);
//        list3.equals(list2);
    }

    public static boolean oddOrNot(int num) {
        return (num & 1) != 0;
    }


}
