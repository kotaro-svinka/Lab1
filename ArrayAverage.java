public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "три", "4", "5"};
        int sum = 0;
        int count = 0;

        try {
            for (int i = 0; i <= arr.length; i++) {
                try {
                    sum += Integer.parseInt(arr[i]);
                    count++;
                } catch (NumberFormatException e) {
                    System.err.println("ПРОБЛЕМА: В массиве текст вместо числа! Данные: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("ПРОБЛЕМА: Мы вышли за границы массива! Индекс: " + e.getMessage());
                }
            }
        } finally {
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Среднее арифметическое: " + average);
            } else {
                System.out.println("Данные не найдены.");
            }
        }
    }
}

