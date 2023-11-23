public class PrimeNumbers {

    static void prime_Lister(int given_Number)
    {
        int p, s, flag;


        System.out.println(
                "Prime numbers within 1 and " + given_Number
                        + " are:");

        for (p = 2; p <= given_Number; p++) {

            flag = 1;

            for (s = 2; s * s <= p; s++) {
                if (p % s == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.print(p + " ");
        }
    }

}
