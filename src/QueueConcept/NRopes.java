//GivenareNropesofdifferentlengths,thetaskistoconnecttheseropesintooneropewithminimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
// Sample Input 1:
// N = 4,
// arr = [4 3 2 6]
// Sample Output 1: 29
// Sample Input 2: N = 2, arr = [1 2 3]
// Sample Output 2: 9
package QueueConcept;
import java.util.*;
public class NRopes {
    public static int mincost (int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i< arr.length ; i++){
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size() >=2){
            int first = pq.peek();
            pq.remove();
            int second = pq.peek();
            pq.remove();
            int sum = first + second;
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i =0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mincost(arr));
    }
}
