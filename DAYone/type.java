package DAYone;
public class type {

    /* Widening casting (automatic) : converting from samll to large, byte -> short -> char -> int -> long -> float -> double*/
    /* Narrowing casting (manual) : converting from large to small*/
    public static void main(String[] args) {
        var n = 9;
        // n = "tanuj";
        System.out.println(n);
        double k = n; // widening automatic
        System.out.println(k);
        
        int h = (int) k; // Narrowing manual
        System.out.println(h);

        int z = 5;
        ++z;
        System.out.println(z);
        z++;
        System.out.println(z);
        --z;
        System.out.println(z);
        z--;
        System.out.println(z);
    }
}
