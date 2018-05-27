import static java.lang.System.exit;

/**
 * Created by legionevil on 26.05.2018.
 * @version 1.02
 */
public class Base {
    public static void main(String[] args) {
        int nums[] = new int[20];
        int minPos;
        int maxNeg;
        int minInd;
        int maxInd;
        System.out.println("Создаем массив из 20ти случайных чисел от -10 до 10.");
        //пишем массив чисел, на ходу выясняем максимальное и минимальное, выводим
        do {
            maxNeg = -99;
            minPos = 99;
            maxInd = 0;
            minInd = 0;
            System.out.print("Начальный состав массива: {");
            for (int x = 0; x < 20; x++) {
                nums[x] = (int) (Math.random() * 21) - 10;
                if (nums[x] > 0 && nums[x] < minPos) {
                    minPos = nums[x];
                    minInd = x;
                }
                if (nums[x] < 0 && nums[x] > maxNeg) {
                    maxNeg = nums[x];
                    maxInd = x;
                }
                System.out.print(x < 19 ? nums[x] + ";" : nums[x]);
            }
            System.out.println("}");
            System.out.println(minPos == 99 || maxNeg == -99 ? "Делаем массив заново." : "Массив готов.");
        } while (minPos == 99 || maxNeg == -99);//Добавить контроль -99 и 99
        //меняем местами макс и мин
        int dummy = nums[minInd];
        nums[minInd] = nums[maxInd];
        nums[maxInd] = dummy;
        //выводим с переставленными макс и мин
        System.out.println("Наименьшее положительное число в массиве " + minPos);
        System.out.println("Наибольшее отрицательное число в массиве " + maxNeg);
        System.out.println("Меняем местами минимальное положительное и максимальное отрицательное.");
        System.out.print("Конечный состав массива: {");
        for (int x = 0; x < 20; x++) {
            System.out.print(x < 19 ? nums[x] +";" : nums[x] + "}");
        }
    }
}