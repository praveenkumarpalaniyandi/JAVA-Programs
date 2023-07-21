import java.util.*;
public class night14 {

    public static int maxLoss(int[] prices) {
        int maxLoss = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int currLoss = prices[i] - prices[j];
                if (currLoss > maxLoss) {
                    maxLoss = currLoss;
                }
            }
        }
        return maxLoss;
    }
//   public static int maxLoss(int[] prices) {
//        int maxLoss = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int currLoss = prices[i] - prices[j];
//                if (currLoss > maxLoss) {
//                    maxLoss = currLoss;
//                }
//            }
//        }
//        return maxLoss;
//    }



}
