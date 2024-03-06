### Работа с Shadow DOM


#### Работа с Shadow DOM в консоли браузера 


1. Присваиваем переменной элемент (находимый по локатору) который содержит #shadow-root  
   
        shadowRootElement = $("[class*='Display__DesktopView'] g-accordion[name='the-company'] g-link");

2. Получаем html-содержимое shadow root в другую переменную  

         shadowRootContent = shadowRootElement.shadowRoot;

3. Выбираем локатор который нас интересует внутри #shadow-root (для примера пусть будет span)


4. Обращаемся с элементу через element.querySelector() , и уже тут делаем 
 
         shadowRootContent.querySelector('span').click();



#### Работа с Shadow DOM в Selenide

В Selenide есть два метода для поиска таких элементов: shadowCss() и shadowDeepCss(). 
Первый ищет внутри конкретного элемента, второй "глубже", по всем #shadow-root. 
[Ссылка на блог с кратким описанием.](https://ru.selenide.org/2022/09/24/selenide-6.8.0/)

[Ссылка на пример кода в репозитории.](../../src/test/java/examples/ShadowRootDemo.java) 

Пример кода текстом:

      @Test
      void shadowRootDemo00() {
      
              open("https://the-internet.herokuapp.com/shadowdom");
      
              ElementsCollection simpleLocatorProbe = $$("[name='my-text']");
      
              System.out.println("Common DOM search found elements: " + simpleLocatorProbe.size());
      
      
              ElementsCollection shadowLocatorProbeA = $$(shadowCss("[name='my-text']", "my-paragraph"));
      
              System.out.println("Shadow DOM search A found elements: " + shadowLocatorProbeA.size());
      
      
              ElementsCollection shadowLocatorProbeB = $$(shadowCss("[name='my-text']", "my-paragraph:nth-child(4)"));
      
              System.out.println("Shadow DOM search B found elements: " + shadowLocatorProbeB.size());
      
      
              ElementsCollection shadowLocatorProbeDeep = $$(shadowDeepCss("[name='my-text']"));
      
              System.out.println("Deep Shadow DOM search found elements: " + shadowLocatorProbeDeep.size());
      
              System.out.println("End of test code reached");
      
          }

