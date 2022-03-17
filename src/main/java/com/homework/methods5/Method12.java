package com.homework.methods5;

/**
 * Программа должна выводить количество населения самых крупных городов мира и сравнивать их с самым большим городом — Токио.
 * Но алгоритм программы немного нарушен. Для исправления ошибки тебе необходимо сделать так,
 * чтобы в строке с выводом информации о самом крупном городе мира использовались статические переменные класса вместо локальных аргументов метода.
 *
 * При правильной работе программы вывод должен быть следующим:
 * Население города Джакарта составляет 25.3 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Сеул составляет 25.2 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Дели составляет 23.1 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Нью-Йорк составляет 21.6 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Требования:
 * •	Изменять имена переменных нельзя.
 * •	Для вывода информации о самом крупном городе должны использоваться статические переменные класса city и population.
 * •	Вывод программы в консоли должен соответствовать условию задачи.
 */


public class Method12 {
  public static String city = "Токио";
  public static double population = 34.5;

  public static void main(String[] args) {
    printCityPopulation("Джакарта", 25.3);
    printCityPopulation("Сеул", 25.2);
    printCityPopulation("Дели", 23.1);
    printCityPopulation("Нью-Йорк", 21.6);
  }

  public static void printCityPopulation(String city, double population){
    System.out.println("Население города " + city + " составляет " + population + " млн человек.");
    System.out.println("В то время как в самом густонаселенном городе " + city + " население составляет " + population + " млн человек.");
  }
}
