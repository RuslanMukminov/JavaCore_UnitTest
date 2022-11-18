# Домашнее задание по теме «Тестирование кода и Unit-тесты»
## Задача 1 (обязательная)
Возьмите любую задачу из предыдущих модулей. Оберните её в мавен-проект, добавьте юнит-тесты. Тестов должно быть как минимум 3.
### Задача выполнена на основе задания по теме «Структура класса»:
Класс книги `Book`. У книги есть конструктор, принимающий название, автора и год написания, рейтинг при этом должен автоматически выставляться как `3`, а текст книги должен быть пустой строкой.
Реализованы методы: 
- `up()` - увеличение рейтинга на 1;
- `down()`- уменьшение рейтинга на 1; 
- `append(String moreText)` - добавляет в конец текста книги новый кусок текста, переданный параметром.

При этом максимально возможный рейтинг должен быть `5`, а минимальный `0`. При попытке изменить рейтинг за его пределы, ничего не происходит.

В классе Main демонстрация работы.