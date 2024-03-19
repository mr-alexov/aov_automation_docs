## Где и как искать информацию по функциям Selenide (и не только)

### Сайт Selenide

На сайте есть [официальная документация](https://ru.selenide.org/documentation.html) и, рядом, [FAQ/ЧАВО](https://ru.selenide.org/faq.html) — это то с чего стоит начать.

### Поиск

Конечно же наш любимый поиск. Например, мы ищем как загрузить с помощью Selenide файл на сайт. Чтобы это сделать, делаем в Яндексе или Гугле [запрос "загрузить файл на сайт site:selenide.org"](https://yandex.com/search/?text=%D0%B7%D0%B0%D0%B3%D1%80%D1%83%D0%B7%D0%B8%D1%82%D1%8C+%D1%84%D0%B0%D0%B9%D0%BB+%D0%BD%D0%B0+%D1%81%D0%B0%D0%B9%D1%82+site%3Aselenide.org), и какая-то информация находится. Разумеется, можно не ограничивать себя сайтом Selenide, и искать в Интернете вообще. И даже на английском. Однако о первоисточнике по Селениду тоже помнить стоит.

### Javadoc

Иногда наш запрос довольно конкретен: какие возможности-методы можно вызвать от SelenideElement ( возвращаемого любимым методом $() ), от ElementsCollection ( возвращаемую поиском многих элементов $$() ), или что есть в классе Configuration.

В этом случае к нашему поиску добавляем слово javadoc — термин и способ документировать классы в Java. Получается, например, [Configuration javadoc site:selenide.org](https://yandex.com/search/?text=Configuration+javadoc+site%3Aselenide.org), где перечислены методы-возможности этого класса.

Bот ссылки и на популярные javadoc для
- [SelenideElement](https://selenide.org/javadoc/current/com/codeborne/selenide/SelenideElement.html)
- коллекции элементов [ElementsCollection](https://selenide.org/javadoc/current/com/codeborne/selenide/ElementsCollection.html).
- [Configuration](https://selenide.org/javadoc/current/com/codeborne/selenide/Configuration.html)

### Тесты Selenide

В [проекте Selenide на GitHub есть масса тестов](https://github.com/selenide/selenide/tree/main/src/test/java/com/codeborne/selenide), которые являются примерами использования Selenide. Можно поискать и по ним, посмотреть как используется та или иная возможность-класс-метод.

### Чаты

Если всё вышеприведённое, все поиски уже испробованы, и вопросы знакомым знатокам Selenide тоже, и не помогло и не направило — попробуйте чаты.

Но сначала _**обязательно**_
- сделайте в чате поиск, может этот вопрос уже задавался-разбирался-отвечен
- хорошо продумайте и опишите свою проблему

Если не уверены в вопросе, лучше сначала спросить знакомого или наставника.

Ссылки на чаты:

- [чат QA Guru](https://t.me/qa_guru_chat)
- [чат Selenide](https://t.me/selenide_ru)
- [чат QA Automation](https://t.me/qa_automation).

### Шпаргалка

Краткая шпаргалка-перечисление методов Selenide, известная как Selenide snippets есть в одном из репозиториев [QA Guru](https://github.com/qa-guru/selenide-starter/blob/master/src/test/java/selenide/Snippets.java)

### Обзоры возможностей и практик

Команда Селенида сделала массу докладов и выступлений на разных конференциях и не только. Как много их на Ютубе Вы можете убедиться, поискав там
- [Selenide, Виноградов](https://www.youtube.com/results?search_query=selenide+%D0%92%D0%B8%D0%BD%D0%BE%D0%B3%D1%80%D0%B0%D0%B4%D0%BE%D0%B2)
- [Selenide, Солнцев](https://www.youtube.com/results?search_query=selenide+%D0%A1%D0%BE%D0%BB%D0%BD%D1%86%D0%B5%D0%B2)

### ... "и не только"

Вышеприведённые методы — довольно универсальны. Поиск по Javadoc поможет узнать о возможностях и других классов Java, поиск по сайтам и репозиториям библиотек — возможности библиотек, поиск на Youtube — найти обзорный ролик, и так далее. Пользуйтесь ) 