package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(taskTwo(2, 3, 4, 5));
    }

    public void taskOne() {
        byte byteVal = 57;
        short shortVal = 22222;
        int intVal = 536;
        long longVal = 888888L;
        float floatVal = 1500.50f;
        double doubleVal = -352.48;
        char charVal = '\u0054';
        boolean booleanVal = true;
    }

    public static float taskTwo(float a, float b, float c, float d) {
        float v = a * (b + (c / d));
        return v;
    }

    public static boolean taskThree(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else{
            return false;
        }
    }

    public static void taskFour(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        }else {
                System.out.println("Число отрицательное.");
            }
        }
    public static boolean taskFive(int b) {
        if (b < 0) {
         return true;
        }else {
            return false;
        }
        }
        public static void taskSix (String name){

        System.out.println ("Привет " + name);
    }
        }