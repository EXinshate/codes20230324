import java.util.Random;
// 抽奖的实现方式
public class Main {
    public static void main(String[] args) {
        // 定义奖池
        int[] arr = {2, 688, 355, 999, 1000};
        int[] Newarr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5;){
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(Newarr, prize);
            if (!flag){
                Newarr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < Newarr.length; i++) {
            System.out.println(Newarr[i]);
        }
    }
    public static boolean contains(int[] arr, int prize){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == prize){
               return true;
           }
        }
        return false;
    }
}