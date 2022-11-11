import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lesson {

    //Напишите функцию, которая принимает массив чисел (целых чисел для тестов) и целевой номер.
    // Он должен найти два разных элемента в массиве, которые при сложении дают целевое значение.
    // Затем индексы этих элементов должны быть возвращены следующим образом: (index1, index2).

//    public static int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (i != j && numbers[i] + numbers[j] == target) {
//                    res[0] = j;
//                    res[1] = i;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(res));
//        return res;
//    }

    //Вам нужно вернуть строку, которая при печати на экране выглядит как ромб,
    // используя символы asterisk (*) . Завершающие пробелы должны быть удалены,
    // и каждая строка должна заканчиваться символом новой строки (\n).

//    public static String print(int n) {
//        String res = "";
//        if(n>0) {
//            String[][] arr = new String[n][n];
//            if (n % 2 != 0) {
//                int x = n / 2;
//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i <= x && j >= x - i && j <= x + i) {
//                            arr[i][j] = "*";
//                        } else if (i > x && j >= i - x && j < n - (i - x)) {
//                            arr[i][j] = "*";
//                        } else arr[i][j] = " ";
//                    }
//                }
//                res = Arrays.deepToString(arr)
//                        .replaceAll("], \\[", "\n")
//                        .replaceAll(" , ", " ")
//                        .replaceAll(", ", "")
//                        .replaceAll("\\* +", "\\*")
//                        .replaceAll("\\[\\[", "")
//                        .replaceAll("]]", "\n");
//            } else res = null;
//        }else res = null;
//        return res;
//    }

    //Учитывая два числа и арифметический оператор (его имя в виде строки), верните результат двух чисел,
    // для которых используется этот оператор.
    //a и b оба будут целыми положительными числами и a всегда будут первым числом в операции
    // и b всегда вторым.
    //5, 2, "add"      --> 7
    //5, 2, "subtract" --> 3
    //5, 2, "multiply" --> 10
    //5, 2, "divide"   --> 2.5
    //Попробуйте сделать это без использования операторов if!

//    public static int arithmetic(int a, int b, String operator) {
//        int res = 0;
//        //Тернарным оператором
//        res = (operator.equals("add")) ?  a + b :
//                ((operator.equals("subtract")) ?  a - b :
//                ((operator.equals("multiply")) ?  a * b :
//                ((operator.equals("divide")) ?  a / b : res)));
//        return res;
//    }

    //В этом простом ката ваша задача - создать функцию, которая превращает строку в мексиканскую волну.
    // Вам будет передана строка, и вы должны вернуть эту строку в массив, где заглавная
    // буква - это человек, стоящий.
    //1. Строка ввода всегда будет строчной, но может быть пустой
    // 2. Если символ в строке является пробелом, то передайте его, как если бы это было пустое место
    //wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}

//    public static String[] wave(String str) {
//        String[] word = str.split("");
//        List<String> arrList = new ArrayList<>();
//            for (int i = 0; i < word.length; i++) {
//                if (!word[i].equals(" ")) {
//                    for (int j = 0; j < word.length; j++) {
//                        if (j == i) word[j] = word[j].toUpperCase();
//                        else word[j] = word[j].toLowerCase();
//                    }
//                    arrList.add(String.join("", word));
//                }
//            }
//        String[] res = new String[arrList.size()];
//        for (int i = 0; i < arrList.size(); i++) {
//            res[i]= arrList.get(i);
//        }
//        if (str.length()==0)res = new String[0];
//        return res;
//    }

    //Постройте башню в форме пирамиды в виде массива / списка строк с заданным положительным целым
    // number of floors числом. Блок башни представлен "*"символом.
    //Например, башня с 3этажами выглядит так:
    //[
    //  "  *  ",
    //  " *** ",
    //  "*****"
    //]

//    public static String[] towerBuilder(int nFloors) {
//        String[] res = new String[nFloors];
//        int arrSize = 1;
//        for (int i = 1; i < nFloors; i++) {
//            arrSize+=2;
//        }
//
//        String[] line = new String[arrSize];
//        for (int i = 0; i < nFloors; i++) {
//            for (int j = 0; j < arrSize; j++) {
//                if (j>=nFloors-i-1&&j<nFloors+i)line[j]="*";
//                else line[j]=" ";
//            }
//            res[i] = String.join("",line);
//        }

//        return res;
//    }


}
