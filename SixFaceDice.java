package be9;
import java.util.*;

public class SixFaceDice {
    public static int solution(int[] arrA, int[] arrB) {
        int minSumA = arrA.length;
        int maxSumA = arrA.length * 6;
        
        int minSumB = arrB.length;
        int maxSumB = arrB.length * 6;
        
        if (maxSumA < minSumB || maxSumB < minSumA) {
            return -1; 
        }
        
        int sumA = calculateSum(arrA);
        int sumB = calculateSum(arrB);
        int diff = sumA - sumB;
        
        if (diff == 0) {
            return 0;
        }
        
        List<Integer> changes = new ArrayList<>();
        
        if (diff > 0) {
            for (int a : arrA) {
                if (a > 1) {
                    changes.add(a - 1);
                }
            }
            for (int b : arrB) {
                if (b < 6) {
                    changes.add(6 - b);
                }
            }
        } else {
            diff = -diff;
            for (int a : arrA) {
                if (a < 6) {
                    changes.add(6 - a);
                }
            }
            for (int b : arrB) {
                if (b > 1) {
                    changes.add(b - 1);
                }
            }
        }
        
        Collections.sort(changes, Collections.reverseOrder());
        
        int turns = 0;
        for (int change : changes) {
            diff -= change;
            turns++;
            if (diff <= 0) {
                return turns;
            }
        }
        
        return -1;
    }
    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] a1 = {5};
        int[] b1 = {1, 1, 6};
        System.out.println(solution(a1, b1));
        
        int[] a2 = {2, 3, 1, 1, 2};
        int[] b2 = {5, 4, 6};
        System.out.println(solution(a2, b2));
        
        int[] a3 = {5, 4, 1, 2, 6, 5};
        int[] b3 = {2};
        System.out.println(solution(a3, b3));
        
        int[] a4 = {1, 2, 3, 4, 3, 2, 1};
        int[] b4 = {6};
        System.out.println(solution(a4, b4));
    }
}
