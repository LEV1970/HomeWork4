package HomeWork4;

import java.util.*;

public class ArrayName implements Comparable {

    public static void main(String[] args) {
        String[] arrayName = {"Андрей", "Александр", "Олег", "Андрей", "Лев", "Никита", "Лев", "Андрей", "Семен", "Игорь"};
        System.out.println("Массив имен: " + Arrays.toString(arrayName));

        HashSet<String> setArrayName = new HashSet<String>(Arrays.asList(arrayName));
        System.out.println("Массив имен без повторяющихся значений: " + setArrayName);

        HashMap<String, Integer> mapArrayName = new HashMap<String, Integer>();
        for (int i = 0; i < arrayName.length; i++) {
            if (mapArrayName.containsKey(arrayName[i])) {
                mapArrayName.put(arrayName[i], mapArrayName.get(arrayName[i]) + 1);
            } else {
                mapArrayName.put(arrayName[i], 1);
            }
        }
        System.out.println("Кол-во повторений имен в массиве: " + mapArrayName);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 */
}
