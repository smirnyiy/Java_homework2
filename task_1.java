import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class task_1 {
    public static void main(String[] args) throws Exception {
        int[] arr = { 8, 87, 3, 26, 9, 24, 5, 93 };
        FileWriter log = new FileWriter("log_arr.txt");
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    flag = false;
                }
                log.append(Arrays.toString(arr));
                log.append("\n");
            }
        }
        log.close();
    }
}