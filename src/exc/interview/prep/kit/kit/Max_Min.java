package exc.interview.prep.kit.kit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Max_Min {


    static int maxMin(int k, int[] arr) {

        Arrays.sort(arr);
        return IntStream.range(0, arr.length - k + 1).map(i -> arr[i + k - 1] - arr[i]).min().orElse(0);


    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        System.out.println(maxMin(k, arr));

        scanner.close();
    }
}
