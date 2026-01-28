package greedyAlgorithm;

import java.util.HashMap;
import java.util.Map;

/*
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one
at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5 , $10, or $20
bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every
customer with the correct change, or false otherwise.

Example 1:
Input: bills = [5,5,5,10,20]

Output: true

Explanation:

From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
Example 2:
Input: bills = [5,5,10,10,20]

Output: false

Explanation:

From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can not give the change of $15 back because we only have two $10 bills.
Since not every customer received the correct change, the answer is false.
 */
public class Lemonade {
    public static void main(String[] args) {
        // int[] input = new int[]{5, 5, 5, 10, 20};
        int[] input = new int[]{5, 5, 10, 10, 20};
        int[] coinCount = new int[]{0, 0, 0};

        if (process(input, coinCount)) {
            System.out.println("All Customer got the changes.");
        } else {
            System.out.println("Couldn't return change to all the customers.");
        }
    }

    private static boolean process(int[] input, int[] coinCount) {
        for (int i = 0; i < input.length; i++) {
            int bill = input[i];

            if (bill == 5) {
                coinCount[0]++; // five++
            }
            else if (bill == 10) {
                if (coinCount[0] <= 0) return false;
                coinCount[0]--; // give one 5
                coinCount[1]++; // take one 10
            }
            else { // bill == 20
                // greedy: pehle 10 + 5
                if (coinCount[1] > 0 && coinCount[0] > 0) {
                    coinCount[1]--;
                    coinCount[0]--;
                }
                // warna 3 five
                else if (coinCount[0] >= 3) {
                    coinCount[0] -= 3;
                }
                else {
                    return false;
                }
                coinCount[2]++; // optional
            }
        }
        return true;
    }

}
