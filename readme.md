### Java Template Repository

## Основні команди

### Compile

mvn compile

### Clean

mvn clean

### Test

mvn test

### Reformat code

mvn spotless:apply

### Check formatting

mvn spotless:check

## Як запустити

1. Переконайтеся, що встановлено Java та Maven.

2. Відкрийте термінал у кореневій папці проєкту.

3. Завантажте залежності та зберіть проєкт:

mvn clean install

4. Запустіть тести:

mvn test

## Вимоги
## Інструкція для запуску тестів

Щоб запустити всі автоматизовані тести проєкту, виконайте команду `mvn test`.

Щоб запустити тести практичної роботи №16 окремо, виконайте:

`mvn "-Dtest=homework.h16.T1Test,homework.h16.T2Test" test`

Після виконання Maven покаже кількість тестів, помилок та результат збірки.

