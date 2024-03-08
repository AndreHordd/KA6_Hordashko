Проект: Варіант 2

Умови завершення

Постановка задачі

Прочитати з stdin N десяткових чисел, розділених пробілом чи новим рядком до появи EOF (макс довжина рядка 255 символів), кількість чисел може до 10000.
 Рядки розділяються АБО послідовністю байтів 0x0D та 0x0A (CR LF), або одним символом - 0x0D чи 0x0A.
Кожне число це ціле десяткове знакове число, яке треба конвертувати в бінарне представлення (word в доповнювальному коді).
Від'ємні числа починаються з '-'.
Увага: якщо число занадто велике за модулем для 16-бітного представлення зі знаком, таке значення має бути представлене як максимально можливе (за модулем).
Відсортувати бінарні значення алгоритмом merge sort (asc)
Обчислити значення медіани та вивести десяткове в консоль як рядок (stdout)
Обчислити середнє значення та вивести десяткове в консоль як рядок (stdout)

Наприклад:
2 10 0

Результат:
2
4  
