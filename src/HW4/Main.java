package HW4;

import java.util.HashMap;
import java.util.Map;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс «Телефонный Справочник»,
 который хранит в себе список фамилий и телефонных номеров.
  В этот телефонный справочник с помощью метода add() можно добавлять записи,
  а с помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
  тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
public class Main {
    public static void main(String[] args) {
        String[] myWords = {
                "Яблоко", "Апельсин", "Автомобиль", "Кошка", "Собака",
                "Собака", "Линза", "Очки", "Собака", "Линза",
                "Мопед", "Автомобиль", "Число", "Номер", "Кот",
                "Система", "Мультипаспорт", "Легионер", "Макака", "Апельсин"
        };

        countUniqueWordsIn(myWords);

        System.out.println("Работа с телефонной книгой");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.appendNewPhoneToName("8(999)999-99-99", "Рубин");
        phoneBook.appendNewPhoneToName("8(988)888-88-88", "Лосев");
        phoneBook.appendNewPhoneToName("8(977)777-77-77", "Лазута");
        phoneBook.appendNewPhoneToName("8(966)666-66-66", "Иванов");
        phoneBook.appendNewPhoneToName("8(955)555-55-55", "Михайлюк");
        phoneBook.appendNewPhoneToName("8(944)444-44-44", "Гусь");
        phoneBook.appendNewPhoneToName("8(933)333-33-33", "Михайлюк");
        phoneBook.appendNewPhoneToName("8(922)222-22-22", "Баринов");
        phoneBook.appendNewPhoneToName("8(911)111-11-11", "Барышев");

        System.out.println(phoneBook.getPhonesBy("Рубин"));
        System.out.println(phoneBook.getPhonesBy("Лосев"));
        System.out.println(phoneBook.getPhonesBy("Иванов"));
        System.out.println(phoneBook.getPhonesBy("Михайлюк"));
        System.out.println(phoneBook.getPhonesBy("Гусь"));
        System.out.println(phoneBook.getPhonesBy("Баринов"));
        System.out.println(phoneBook.getPhonesBy("Барышев"));

    }

    /*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
       Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
       Посчитать, сколько раз встречается каждое слово.
     */
    public static void countUniqueWordsIn(String[] array) {
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firstTimeSee = 1;
        for (String word : array) {
            if (wordsToCount.containsKey(word)) {
                int count = wordsToCount.get(word);
                wordsToCount.put(word, count + 1);
            } else {
                wordsToCount.put(word, firstTimeSee);
            }
        }

        System.out.println("Вывод уникальных слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            if (wordEntry.getValue() == firstTimeSee) {
                System.out.println(wordEntry.getKey());
            }
        }

        System.out.println("Вывод повторений слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            System.out.println(wordEntry.getKey() + " : " + wordEntry.getValue());
        }
    }
}
