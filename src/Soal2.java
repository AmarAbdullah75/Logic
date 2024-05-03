import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        isFibonacci(3);
        int[] a = {101, 1002, 0, 212, 12, 4, 10};
        isBubleSort(a);
//        System.out.println(Arrays.toString(a));
//        String[] arr = {"Danang", "Ari", "Ari", "Restu", "Ruben", "Arif"};
//        System.out.println(middleEarth(arr));
//        firstAndLast("another");
//        firstAndLast("welcome");
//        firstAndLast("anonymous");
//        String[] arr = {"Rege", "Rap", "Funk", "Grunge", "Dangdut", "Hip Hop", "Rap", "Keroncong","Rege"};
//        System.out.println(uniqueStyles(arr));
        System.out.println(filterAddress("depok lama, pasar lama 112 jl.dewi sartika, pancoranmas"));
    }

    //Pertanyaan 1
    public static void isFibonacci(int a){
        int[] b = new int[a-1];
        b[0] = 1;
        b[1] = 2;
        int x = 0;
        for (int i = 2; x < a-3; x++) {
            b[i] = b[i-2] + b[i-1];
            i++;
        }
        System.out.println(Arrays.toString(b));
    }

    //Pertanyaan 2
    public static void isBubleSort(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    //Pertanyaan 4
    public static boolean middleEarth(String[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals("Ari")|| arr[i].equals("Danang")){
                if(arr[i+1].equals("Danang")){
                    return true;
                } else if (arr[i + 1].equals("Ari")) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    //Pertanyaan 5
    public static void firstAndLast(String a){
        String[] fl = new String[2];
        char[] FL = a.toCharArray();
        char[] FL2 = a.toCharArray();
        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < FL.length - 1; j++) {
                if(FL[j] > FL[j+1]){
                    char temp = FL[j];
                    FL[j] = FL[j+1];
                    FL[j+1] = temp;
                }
            }
            for (int k = FL2.length-1; k > 0; k--) {
                if(FL2[k] > FL2[k-1]){
                    char temp = FL2[k-1];
                    FL2[k-1] = FL2[k];
                    FL2[k] = temp;
                }
            }
        }
            fl[0] = String.valueOf(FL);
            fl[1] = String.valueOf(FL2);
        System.out.println(Arrays.toString(fl));
    }

    //Pertanyaan 6 (Belum Kelar)
    public static int uniqueStyles(String[] arr){
        int a = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] != arr[j]){
                    a++;
                }else {
                    break;
                }
            }
        }
        return a;
    }

    //Pertanyaan 10
    public static String filterAddress(String a){
        char[] b = a.toCharArray();
        char[] c = new char[a.length()];
        int x = 0;
        for (int i = 0; i < a.length()-1; i++){
            if (b[i] >= '0' && b[i] < '9'){
                for (int j = i; j < a.length()-1; j++) {
                    if (b[j] == ','){
                        break;
                    }else{
                        c[x] = b[j];
                        x++;
                    }
                }
                break;
            }
        }
        c = Arrays.copyOf(c, c.length-x);
        a = String.valueOf(c);
        return a;
    }
}
