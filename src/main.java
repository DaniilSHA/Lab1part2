import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        InfoPublishingHouse [] pubList = {
                new InfoPublishingHouse("Проспект", "Москва"),
                new InfoPublishingHouse( "Питер", "Санкт-Петербург"),
                new InfoPublishingHouse( "БХВ", "Санкт-Петебург"),
                new InfoPublishingHouse( "Диалектика", "Киев")
        };

        InfoBook [] bookList = {
                new InfoBook("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String [] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, pubList[1]),
                new InfoBook("Разработка требований к программному обеспечению. 3-е издание, дополненное", new String [] {"Вигерс Карл"}, 2019, pubList[2]),
                new InfoBook("Java. Полное руководство, 10-е издание", new String [] {"Шилдт Герберт"}, 2018, pubList[3]),
                new InfoBook("C/C++. Процедурное программирование", new String [] {"Полубенцева М.И."}, 2017, pubList[2]),
                new InfoBook("Конституция РФ",2020, pubList[0])

        };

        InfoBook.printAll(bookList);
        pubList[2].setCity("Санкт-Петербург");
        System.out.println("\nошибка в название города издательства 'БХВ'\n");
        InfoBook.printAll(bookList);
    }
}
