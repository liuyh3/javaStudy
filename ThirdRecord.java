import java.util.Arrays;

/**
 * 题目：
 * 1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73
 * 2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入
 * 3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
 * 测试数据：89,-23,64,91,119,52,73, 120
 */
public class ThirdRecord {

    public static void main(String[] args) {
        int scores[] = {89,-23,64,91,119,52,73, 120};
        ThirdRecord third = new ThirdRecord();
        third.thirdRecord(scores, 3);
    }

    //定义方法完成成绩排序并输出前n名的功能
    public void thirdRecord(int[] arr, int n){
        Arrays.sort(arr);
        int count = 0;
        for(int k=arr.length-1; k>=0 && count<n; k--){
            if(arr[k]>=0 && arr[k]<=100) {
                count++;
                System.out.println(arr[k]);
            }
        }
    }
}
