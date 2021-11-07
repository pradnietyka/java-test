import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////       int liczba = 10;
////       int liczba2 = 10;
////
////       System.out.println("Hello word" + liczba);
////
////       System.out.println(liczba % liczba2);
////
////        String name = "Michał";
////        int age = 28;
////        System.out.println("Mam na imię " + name + " i mam " + age + " lat");
////
////        String account = " MartaKubala ";
////        System.out.println(account.length());
////        System.out.println(account.indexOf('r'));
////        System.out.println(account.substring(1,6));
////        System.out.println(account.trim());
////        System.out.println(account.length());
////
////        char a = 'a';
////        char alpha = '\u03B1';
////
////        System.out.println(alpha);
////
////        char[] witaj = {'w', 'i','t','a','j'};
////        System.out.println(witaj);
////        Character.isDigit(a);
////        System.out.println(Character.isDigit(a));
////
////        if (liczba>liczba2 | liczba2==liczba){
////            System.out.println("System działa");
////        } else {
////                System.out.println("System nie działa");
////                if (liczba==liczba2){
////                    System.out.println("System działa1");
////                }

//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Wpisz swoje imie");
//        String userInputName = skaner.nextLine();
//        System.out.println("Wpisz swoje nazwisko");
//        String userInputSurname = skaner.nextLine();
//        System.out.println("Witaj " + userInputName + " " + userInputSurname +"!");

//
//    int number = 3;
//    int number2;
//        System.out.println(number++);
//        System.out.println(++number);
//        System.out.println(number);
//        number2 = number++;
//        System.out.println(number2);
//        number2 = ++number;
//        System.out.println(number2);
//        System.out.println(++number2);

            ArrayList<String> arrayList = new ArrayList<>();
        String[] nameTable = new String[4];
        String[] nameTable1 = {"Kasia", "Tomasz", "Joanna", "Anna"};
        for(int i = 0; i < nameTable1.length; i++);{
            for (int i = 0; i < nameTable1.length; i++) {
                nameTable[i]=nameTable1[i];
                System.out.println(nameTable[i]);
            };
        };
        }


    }




