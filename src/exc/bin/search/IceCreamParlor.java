package exc.bin.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {

    static List<Integer> cost;

    // Complete the whatFlavors function below.
    static void whatFlavors(List<Integer> sortedCost, int money) {

        sortedCost.sort(Comparator.<Integer>naturalOrder());

        int k = sortedCost.size() - 1;
        int l = money % sortedCost.get(k) == 0 ? sortedCost.get(k) : money % sortedCost.get(k);
        int m = sortedCost.get(k);

        if (k == 0 || (money > m && cost.contains(l))) {

            if (l == m)
                l = cost.lastIndexOf(l) + 1;
            else
                l = cost.indexOf(l) + 1;

            m = cost.indexOf(m) + 1;


            System.out.println(m < l ? m + " " + l : l + " " + m);

        } else
            whatFlavors(sortedCost.subList(0, k + 1 / 2), money);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            cost = new ArrayList<>(n);

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost.add(i, costItem);
            }


            whatFlavors(new ArrayList<Integer>(cost), money);
        }

        scanner.close();
    }
}
