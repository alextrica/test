public class problema1 {

    public static void main(String[] args) {

        int n = 4;
        int k = 1;
        boolean crestere = true;

        while (k > 0) {
            for (int i = 0; i < k; i++)
                System.out.print("#");

            System.out.print(" ");
            if (crestere == true) {
                if (k < n) {
                    k++;
                } else {
                    k--;
                    crestere = false;
                }
            } else
                k--;
        }
    }
}
