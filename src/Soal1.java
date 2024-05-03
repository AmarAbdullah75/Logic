import com.sun.tools.javac.Main;

import java.util.Arrays;

public class Soal1 {
    public static void main(String[] args) {
//        growUpNumber(0);
//        System.out.println(isMatchOdentity("cccccz"));
//        alphabetCharacter("lamborghini");
//        alphabetCharacter("hacker");
//        int[] array = {8,4,20,32,1};
//        System.out.println(existsHigherNumber(array, 10));
//        howManyAlphabet(10);
//        System.out.println(isPalidrome("kasur ini rusak"));
        String[] arr = {"Kambing", "Chapung",  "Kalong"};
//        String[] arr = {"Ayam","Kuda", "Badak"};
//        String[] arr = {"Cacing", "Bebek", "Cicak", "Beruang"};
        String[] c = removeCharacter(arr);
//        System.out.println(Arrays.toString(c));
        String[] arr2 = {"diman", "dih", "debora", "deh", "die"};
        String[] arr3 = matchDictionary("di", arr2);
        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr));
        int[] a = {-5, -25, 35};
//        additiveInverse(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(app.reverseBool(1.1));
    }

    //Pertanyaan 1
    public static void growUpNumber(int number) {
        int[] digit = new int[number + 1];
        for (int i = 0; number >= 0; number--) {
            digit[i++] = number;
        }
        System.out.println(Arrays.toString(digit));
    }

    //Pertanyaan 2
    public static boolean isMatchOdentity(String word) {
        boolean status = false;
        char[] kata = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            kata[i] = word.charAt(i);
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == kata[j]) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
        }
        return status;
    }

    //Pertanyaan 3
    public static void alphabetCharacter(String kata) {
        char[] word = kata.toCharArray();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length - 1; j++) {
                if (word[j] > word[j + 1]) {
                    char temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
            }
        }
        System.out.println(word);
    }

    //Pertanyaan 4
    public static boolean existsHigherNumber(int[] angka, int a) {
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > a) {
                return true;
            }
        }
        return false;
    }

    //Pertanyaan 5
    public static void howManyAlphabet(int a) {
        String mobil = "Lamborghini";
        char[] mobil2 = new char[a];
        for (int i = 0; i < a; i++) {
            mobil2[i] += 'a';
        }
        mobil = mobil.substring(0, 1) + String.valueOf(mobil2) + mobil.substring(2);
        System.out.println(mobil);
    }

    //Pertanyaan 6
    public static boolean isPalidrome(String kata) {
        char[] kata2 = new char[kata.length()];
        int x = kata.length() - 1;
        for (int i = 0; x >= 0; x--) {
            kata2[i++] = kata.charAt(x);
        }
        String kata3 = String.valueOf(kata2);
        if (kata.equals(kata3)) {
            return true;
        }
        return false;
    }

    //Pertanyaan 7
    public static String[] removeCharacter(String[] kata) {
        int i = 0, x = 0;
        for (; i < kata.length; i++) {
            int j = 0;
            for (; j < kata.length - 1; j++) {
                if (kata[j].charAt(0) == 'C') {
                    String temp = kata[j];
                    kata[j] = kata[j + 1];
                    kata[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < kata.length; j++) {
            if(kata[j].charAt(0) == 'C'){
                x++;
            }
        }
        kata = Arrays.copyOf(kata, kata.length - x);
        return kata;
    }

    //Pertanyaan 8
    public static String[] matchDictionary(String a, String[] b){
        int x = 0;
        int y = a.length();
        for (int i = 0; i < b.length-1; i++) {
            int j = 0;
            for (; j < b.length - 1; j++) {
                if(!b[j].substring(0,y).equals(a)){
                    String temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(!b[i].substring(0,y).equals(a)){
                x++;
            }
        }
        b = Arrays.copyOf(b, b.length-x);
        return b;
    }

    //Pertanyaan 9
    public static void additiveInverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i] = a[i] - (a[i] * 2);
            } else {
                a[i] = a[i] - (a[i] + a[i]);
            }
        }
    }

    //Pertanyaan 10
    public boolean reverseBool(boolean a) {
        boolean s = false;
        if (a) {
            s = false;
        } else if (!a) {
            s = true;
        }
        return s;
    }

    public String reverseBool(String d) {
        return "Bukan Boolean";
    }

    public String reverseBool(int d) {
        return "Bukan Boolean";
    }

    public String reverseBool(double d) {
        return "Bukan Boolean";
    }
}
