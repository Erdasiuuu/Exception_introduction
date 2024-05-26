import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  /**
   * @brief Константные переменные для дальнейшего использования
   *
   */

  private static final int ADD_EMPTY_OBJECT = 1;
  private static final int ADD_OBJECT = 2;
  private static final int EDIT_OBJECT = 3;
  private static final int OUTPUT_LIST = 4;
  private static final int SORT_LIST = 5;
  private static final int EXIT = 6;

  /**
   * @brief Программа для работы с экземплярами класса книга
   *
   * Программа в виде простого меню, которое имеет 6 опций
   * 1. Добавить в список объект со значениями по умолчанию (Title: title,
   * Genre: genre, pages: 100, wordPerPage: 100)
   * 2. Добавить в список объект с измененными значениями
   * 3. Редактировать объекты из списка
   * 4. Вывести все объекты из списка
   * 5. Сортировать список по одному из полей
   * 6. Завершение программы
   *
   * Все необходимые данные будут запрашиваться до тех пор, пока не будут
   * введены полностью корректно. Например, при неправильном вводе количества
   * страниц программа снова будет запрашивать данные, до тех пор пока не будут
   * ввдены корректные данные
   *
   */

  public static void main(String[] args) {
    List<Book> book = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    while (choice != EXIT) {
      Book.printMenu();
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case ADD_EMPTY_OBJECT:
          book.add(new Book());
          System.out.printf("\nДобавлена книга со значениями по умолчанию\n\n");
          break;
        case ADD_OBJECT:
          Book obj = new Book();
          obj.modify();
          book.add(obj);
          break;
        case EDIT_OBJECT:
          Book.prepareForEdit(book, scanner);
          break;
        case OUTPUT_LIST:
          Book.output(book);
          break;
        case SORT_LIST:
          Book.prepareToSortList(book, scanner);
          break;
        case EXIT:
          break;
        default:
          Book.printErrorInput();
          break;
      }
    }
  }
}
