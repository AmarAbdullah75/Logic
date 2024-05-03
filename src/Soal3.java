import java.util.Arrays;

public class Soal3 {
    public static void main(String[] args) {
        String kata = "*l*ph*nt";
        String d = "Eea";

//        System.out.println(uncensoredString(kata, d));
//        System.out.println(happyNumber(107));
        int[] a = {2, 55, 60, 97, 86};
//        System.out.println(sevenBoom(a));
        String[] z = {"-/>", "10bc", "abc "};
        String[] y = numInStr(z);
//        System.out.println(Arrays.toString(y));
        System.out.println(oddishOrEvenish(4433));
    }

    //Pertanyaan 1
    public static String uncensoredString(String kata, String vokal) {
        char[] kt = kata.toCharArray();
        int j = 0;
        for (int i = 0; i < kt.length; i++) {
            if (kt[i] == '*') {
                kt[i] = vokal.charAt(j++);
            }
        }
        kata = String.valueOf(kt);
        return kata;
    }

    //Pertanyaan 2
    public static boolean happyNumber(int a){
        int t = 0;
        String k = Integer.toString(a);
        char[] j = k.toCharArray();
        int[] i  = new int[k.length()];
        for (int l = 0; l < i.length; l++) {
            i[l] = Character.getNumericValue(j[l]);
        }
        if(a == 1){
            return true;
        }else{
            while (a != 1){
                int x = 0;
                while (x < i.length){
                    i[x] = i[x] * i[x];
                    x++;
                }
                a = 0;
                for (int l = 0; l < i.length; l++) {
                    a += i[l];
                }
                k = Integer.toString(a);
                j = k.toCharArray();
                for (int l = 0; l < i.length; l++) {
                    i[l] = Character.getNumericValue(j[l]);
                    i = Arrays.copyOf(i, k.length());
                }
                if(a==1){
                    return true;
                }
                if(t > 1000){
                    break;
                }
                t++;
            }
        }
        return false;
    }

    //Pertanyaan 4
    public  static String sevenBoom(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 7||a[i] % 10 == 7||a[i] == 70||a[i]==700||a[i] == 7000||a[i] == 70000){
                return "Boom Exploded";
            }
        }
        return "Boom Defused";
    }

    //Pertanyaan 5
    public static String[] numInStr(String[] a){
        int x = 0;
        boolean status = false;
        for (int j = 0; j < a.length-1; j++) {
            int i = 0;
            for (; i < a[j].length(); i++) {
                if (a[j].charAt(i) >= '0' && a[j].charAt(i) <= '9'){
                    status = true;
                    break;
                }
            }
            if (!status){
                String temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            status = false;
            for (; j < a[i].length(); j++) {
                if(a[i].charAt(j) >= '0' && a[i].charAt(j) <= '9'){
                    status = true;
                    break;
                }
            }
            if (!status){
                x++;
            }
        }
        a = Arrays.copyOf(a,a.length-x);
        return a;
    }

    //Pertanyaan 8
    public static String oddishOrEvenish(int a){
        if(a % 2 == 0){
            return "Evenish";
        }
        return "Oddish";
    }
}
