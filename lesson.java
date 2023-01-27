/*
 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */
import java.util.Random;
public class lesson {
    public static void main(String[] args) {
        int i = new Random().nextInt();
        int x = Integer.toBinaryString(i).length();

        int c = 0;
        for (int j = Short.MIN_VALUE, j < i, j ++){
            if (j%x == 0) c++;
            
        }

        System.out.println(i);
        System.out.println(x);
    }
}
