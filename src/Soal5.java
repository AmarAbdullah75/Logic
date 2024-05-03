import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
//        System.out.println(charCount('7', "10795426697"));
//        int[] a = {1, 1, 1, 1, 1, 1};
//        System.out.println(factorChain(a));
//        System.out.println(replaceVowel("karachi"));
//        System.out.println(doubleChar("_______"));
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        if (a==b){
            System.out.println("SAMA");
        }else{
            int result = a-b;
            if (result < 0){
                result *= -1;
            }

            System.out.println("BEDA "+result);
        }

//        int x = in.nextInt();
//        int y = 0;
//        int z;
//        for (int i = 0; i < x; i++) {
//            z = in.nextInt();
//            y+=z;
//        }
//        System.out.println(y);
    }

    //Pertanyaan 2
    public static int charCount(char a, String b){
        int x = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a){
                x++;
            }
        }
        return x;
    }

    //Pertanyaan 3
    public static String doubleChar(String a){
        char[] b = new char[a.length()*2];
        char[] c = a.toCharArray();
        int x = 0;
        for (int i = 0; i < a.length(); i++) {
            b[x] = c[i];
            b[x+1] = c[i];
            x+=2;
        }
        a = String.valueOf(b);
        return a;
    }
    //Pertanyaan 4
    public static boolean factorChain(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1] % a[i] != 0){
                return false;
            }
        }
        return true;
    }

    //Pertanyaan 5
//    public static String caesarCipher(String a, int b){
//        char[] x = a.toCharArray();
//        for (int i = 0; i < x.length; i++) {
////            x[i] = x[i] + Character.;
//        }
//    }

    //Pertanyaan 7
    public static String replaceVowel(String a){
        char[] text = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (text[i] == 'a'){
                text[i] = '1';
            }else if(text[i] == 'e'){
                text[i] = '2';
            }else if(text[i] == 'i'){
                text[i] = '3';
            }else if(text[i] == 'o'){
                text[i] = '4';
            }else if (text[i] == 'u'){
                text[i] = '5';
            }
        }
        a = String.valueOf(text);
        return a;
    }
}
