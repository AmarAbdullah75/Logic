import java.util.Arrays;

public class Soal4 {
    public static void main(String[] args) {
        int[] a = {6, 7, 10};
        int[] b = {2, 3, 7, 8, 10};
        System.out.println(combinations(a));
    }

    //Pertanyaan 2 (Salah)
    public static String factorGroup(int a){
        if(a % 2 == 0){
            return "odd";
        }
        return "even";
    }

    //Pertanyaan 4 (Belum Kelar)
    public static boolean isPositiveDominant(int[] a){
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                for (int j = 0; j < a.length; j++) {
                    if (a[i] != a[j] && a[j] > 0){
                        x++;
                    }
                }
            }else{
                for (int j = 0; j < a.length; j++) {
                    if (a[i] != a[j]&& a[j] <= 0){
                        y++;
                    }
                }
            }
        }
        if(x > y){
            return true;
        }
        return false;
    }

    //Pertanyaan 5
    public static int nextElement(int[] a){
        int temp = 0;
        int sel = 0;
        for(int i = 0; i < a.length-1;i++){
            if(a[i] > 0){
                temp = a[i+1] % a[i];
            }else if(a[i] < 0){
                temp = a[i+1] % a[i];
            }else if(a[i] == a[i+1]){
                sel = a[i];
                return sel;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i == a.length-1){
                sel = a[i]+temp;
            }
        }
        return sel;
    }

    //Pertanyaan 6
    public static boolean consecutiveCombo(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int x = 0;
        for (int i = a.length; x < b.length; i++) {
            c[i] = b[x++];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if(c[j] > c[j+1]){
                    int temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length-1; i++) {
            if(c[i] + 1 != c[i+1]){
                return false;
            }
        }
        return true;
    }

    //Pertanyaan 9
    public static int combinations(int[] a){
        int result = 1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                result *= a[i];
            }
        }
        return result;
    }
}
