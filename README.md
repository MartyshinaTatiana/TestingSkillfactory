# Окружение:
Тест написан для проверки функционала сайта https:/Skillfactory/ на Desktop версии в браузере Chrome, версии 123.0.6312.59 (Официальная сборка), (64 бит).
# Стек:
Java, Selenium

java/Pages: Этот пакет содержит веб-элементы, которые используются для тестов. 

test/java: Здесь находятся тесты, разделенные по страницам или функциональности.

resources: В этой директории хранятся дополнительные ресурсы, такие как драйверы для браузера .

# Запуск теста:
1. Установить Maven на вашем компьютере.
2. Клонировать данный репозиторий.
3. Открыть проект в интегрированной среде разработки (IDE).
3. Скачать WebDriver. Версия должна совпадать с версией браузера, в которой будет проводится тестирование. На страницах [CoursesOnMainPageTests.java](src%2Ftest%2Fjava%2FCoursesOnMainPageTests.java), [HeaderTests.java](src%2Ftest%2Fjava%2FHeaderTests.java), [JavaTesterCourseTesting.java](src%2Ftest%2Fjava%2FJavaTesterCourseTesting.java) указать адрес директории которая содержит chromedriver.exe.
4. Выполнить команду mvn test.
5. Кликнуть на проект правой кнопкой мышки, и в выпадающем списке выбрать RUN 'All Tests'.

# Описание тестовых сценариев:
 
- CoursesOnMainPageTests:  Проверки переходов на страницы "Программирование","Data Science", "Аналитика данных", "Тестирование","Высшее образование","Дизайн","Все курсы".
- HeaderTests: Проверки переходов на страницы по кнопкам расположенным в Headere главной страницы, а также обратного перехода на главную страницу.
- JavaTesterCourseTesting: Проверки переходов на страницу курса "Тестировщик на Java".

Общее количество: 22 автотеста.




