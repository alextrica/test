public class problema2{
    public static void main(String[] args){

        int n = 6;
        int counter=1;
        System.out.println("N=" +n);
        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println("N=" +n);
            counter++;

        } while (n!=1);
        System.out.println(counter);
    }
}
