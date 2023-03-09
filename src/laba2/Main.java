package laba2;

public class Main {
    public static void main(String[] args) {
        char[] arr = "НЛТУ, ІДКТД, ІСТ-21, Інженер ПЗ".toCharArray();
        String str1 = new String(arr, 0, 19);
        String str2 = new StringBuilder(str1).reverse().toString(); //У String нема аналогічного методу.
        System.out.println(str2);
        String str3 = str1.toUpperCase();
        System.out.println("str3 is equal to str1 - " + str3.equals(str1));
        System.out.println(str1.substring(6, 11)); // Назва факультету
        String str4 = str1.concat(str3);

        System.out.printf("Letter I: first entry in str1 at index — %d%n", str1.indexOf('І'));
        System.out.printf("Letter I: last entry in str1 at index — %d%n", str1.lastIndexOf('І'));

        StringBuilder sb = new StringBuilder("Kryshtof Yurii Tarasovych, 16.01.2003");
        sb.delete(sb.indexOf("16"), sb.indexOf("2")); //Видаляєм число і місяць народження
        sb.append(", Rozvadiv");
        sb.insert(sb.indexOf("Roz"), "male, ");
        //System.out.println(sb);
        System.out.println("sb length — " + sb.length());
        sb.setLength(sb.indexOf(",")); //Скорочуємо рядок, залишаємо лише ПІБ
        //System.out.println(sb);
        System.out.println(new StringBuilder("Kryshtof").reverse());
    }
}