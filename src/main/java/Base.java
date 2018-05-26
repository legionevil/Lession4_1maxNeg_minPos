/**
 * Created by legionevil on 26.05.2018.
 */
public class Base {
    public static void main(String[] args) {
        int nums[] = new int[20];
        int minPos = 99;
        int maxNeg = -99;
        int minInd = 0;
        int maxInd = 0;
        //пишем массив чисел, на ходу выясняем максимальное и минимальное, выводим
        System.out.print("Начальный состав массива: {");
            for (int x = 0; x < 20; x++) {
                nums[x] = (int) (Math.random() * 21) - 10;
                if(nums[x] > 0 && nums[x] < minPos){
                    minPos = nums[x];
                    minInd = x;
                }
                if(nums[x] < 0 && nums[x] > maxNeg){
                    maxNeg = nums[x];
                    maxInd = x;
                }
                System.out.print(x < 19 ? nums[x] +";" : nums[x]);
            }
        System.out.println("}");
        //меняем местами макс и мин
        int dummy = nums[minInd];
        nums[minInd] = nums[maxInd];
        nums[maxInd] = dummy;
        //выводим с переставленными макс и мин
            System.out.println("Наименьшее положительное число в массиве " + minPos);
            System.out.println("Наибольшее отрицательное число в массиве " + maxNeg);
        System.out.print("Конечный состав массива: {");
        for (int x = 0; x < 20; x++) {
            System.out.print(x < 19 ? nums[x] +";" : nums[x] + "}");
        }
    }
}