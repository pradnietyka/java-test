public class Main {
    public static void main(String[] args) {
//
//        int liczba = 5;
//        int liczba2 = 2;
//
//        System.out.println("Hello word" + liczba);
//
//        System.out.println(liczba % liczba2);
//
//        String name = "Michał";
//        int age = 28;
//        System.out.println("Mam na imię " + name + " i mam " + age + " lat");
//
        String account = " MartaKubala ";

        System.out.println(account.length());

        System.out.println(account.indexOf('r'));

        System.out.println(account.substring(1,6));

        System.out.println(account.trim());

        System.out.println(account.length());

        char a = 'a';
        char alpha = '\u03B1';

        System.out.println(alpha);

        char[] witaj = {'w', 'i','t','a','j'};
        System.out.println(witaj);
        Character.isDigit(a);
        System.out.println(Character.isDigit(a));


    }

}
