public class Lesson2 {
//    Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr =new int[] {1, 1, 0, 0, 1, 0, 1, 1};
        System.out.print("Decision");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = i;
            else arr[i] = 0;
        }
        System.out.print("Decision: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
//    Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        static void fillArray() {
          int[] arr = new int[8];
          for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
           arr[i] = j;
           System.out.print(arr[i] + " ");
    }
}
//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
           public static void changeArray2() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            System.out.print("Decision:");
              for (int i : arr) {
              System.out.print(i + " ");
                }
              System.out.print("Decision: ");
              for (int i = 0; i < arr.length; i++) {
               if (arr[i] < 6) arr[i] *= 2;
               System.out.print(arr[i] + " ");
                }
              }
//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
            public static void fillDiagona() {
             int length = 5;
                int[][] arr = new int[length][length];
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        if ((i == j) || (i == length - 1 - j)) {
                            arr[i][j] = 1;
                        }
                    }
                }
             for (int i = 0; i < length; i++) {
             for (int j = 0; j < length; j++) {
            System.out.print(arr[i][j] + " ");
                }
             System.out.println();
             }
              }
              }
