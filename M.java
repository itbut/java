package Basic;

public class M {

    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a + "->" + toUpperCase(a));
    }

//    public static char toLowerCase(char c) {
//        if ((c >= 'A') && (c <= 'z')) {
//            int m = 1 << 5; //маска в 5м бите единица
//            return (char) (c | m);
//        }
//        return c;
//    }
//        return ((c >= 'A') && (c <= 'z'))
//                ? (char) (c | 1 << 5) : c; 
//}
    public static char toLowerCase(char c) {
        return ((c >= 'A') && (c <= 'z'))
                ? (char) (c |(1 << 5)) : c;
    }
    public static char toUpperCase(char c) {
        return ((c >= 'A') && (c <= 'z'))
                ? (char) (~(1 << 5) & c) : c;
    }

    public static void a() {
        for (int i = 0, j = 0;
                i++ < 5 || j++ < 5;
                System.out.println("i=" + i + ", j = " + j)) {

        }
    }
}
