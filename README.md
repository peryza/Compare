# Compare
Данное решение разработано для того, чтобы решить ряд конкретных задач, а именно:
  - Лексикографическое сравнение двух строк
  - Рандомная генерация строки длинной n
  - Тестирование самописного метода с библиотечным

# Генерация строки
Генерация строки происходит в зависимости от того, какими будут индефикаторы f и k если f будет истинным, то строка будет содержать только буквы,
если k будет истинным то будет содержать только цифры, если же индификаторы будут содержать одинаковое значение, тогда строка будет содержать и буквы и цифры.
Число n дает возможность определить длинну строки.

## Проверка работоспособности
Чтобы проверить работоспособность программы и протестировать результаты,
достаточно открыть класс CompareTester в тестовом пакете и посмотреть результаты тестирования(сравнения результатов работы двух методов)

## Был использован следующий стек для разработки:
  
  - Gradle
  - Kotlin
  - Junit
