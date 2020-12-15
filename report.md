## ИНТЕРНЕТ-ВИТРИНА МАГАЗИНА ИНТЕРЬЕРНЫХ ЧАСОВ
### Курсовой проект


### СОДЕРЖАНИЕ
ВВЕДЕНИЕ	4
ГЛАВА 1 ОБЗОР ИНСТРУМЕНТАЛЬНЫХ СРЕДСТВ И ТЕХНОЛОГИЙ	5
1.1	Язык программирования Java	5
1.2	Spring Framework	5
1.3	Apache Maven Framework	5
1.4	Система управления базами данных PostgreSQL	5
1.5	Bootstrap Framework	6
ГЛАВА 2 РЕАЛИЗАЦИЯ СЕРВЕРНОЙ ЧАСТИ ПРОЕКТА	7
2.1	Клиент-серверное взаимодействие в стиле REST	7
2.2	Схема авторизации	7
2.3	Схема базы данных	7
ГЛАВА 3 РЕАЛИЗАЦИЯ ПОЛЬЗОВАТЕЛЬСКОЙ ЧАСТИ ПРОЕКТА	8
3.1	Информационная структура	8
3.2	Разработка визуального оформления	9
ЗАКЛЮЧЕНИЕ	10
СПИСОК ИСПОЛЬЗУЕМЫХ ИСТОЧНИКОВ	11
ПРИЛОЖЕНИЯ	12


### РЕФЕРАТ

Курсовой проект содержит:  страниц,  таблиц,  иллюстрации,  листингов,  источников,  приложения.
Ключевые слова: ИНТЕРНЕТ-ВИТРИНА, JAVA, SPRING FRAMEWORK, APACHE MAVEN FRAMEWORK, POSTGRESQL.
Цель работы: разработка адаптивной интернет-витрины магазина интерьерных часов.
Результатом курсового проекта является адаптивная интернет-витрина магазина интерьерных часов.

Курсавой праект змяшчае:  старонак,  табліц,  ілюстрацыі,  лістынгаў,  крыніц,  прыкладання.
Ключавыя словы: ІНТЭРНЭТ-ВІТРЫНА, JAVA, SPRING FRAMEWORK, APACHE MAVEN FRAMEWORK, POSTGRESQL.
Мэта работы: распрацоўка адаптыўнай інтэрнэт-вітрыны крамы інтэр'ерных гадзін.
Вынікам курсавога праекта з'яўляецца адаптыўная інтэрнэт-вітрына крамы інтэр'ерных гадзін.

The course project includes:  pages,  tables,  illustrations,  listings,  sources,  appendices.
Keywords: WEB STORE, JAVA, SPRING FRAMEWORK, APACHE MAVEN FRAMEWORK, POSTGRESQL.
The aim of this work is to develop an interior watches’ adaptive web store.
The result of the course project is the interior watches’ adaptive web store.



### ВВЕДЕНИЕ

Эффективным инструментом продвижения товаров и услуг соответствующей организации является наличие веб-сайта, основным назначением которого является связь покупателя с производителем. Актуальность создания веб-сайта обусловлена тем, что существует возможность ознакомиться с перечнем предоставляемых производителем товаров и услуг в любое удобное пользователю время.
Целью курсового проекта является разработка адаптивной интернет-витрины магазина интерьерных часов с использованием следующих языков программирования и технологий: язык программирования Java, Spring Framework, Apache Maven Framework, система управления базами данных PostgreSQL, Bootstrap Framework.
Достижение заданной цели осуществимо в ходе выполнения следующих задач:
1. Провести обзор следующих инструментальных средств и технологий: язык программирования Java, Spring Framework, Apache Maven Framework, система управления базами данных PostgreSQL, Bootstrap Framework.
2. С помощью языка программирования Java и системы управления базами данных PostgreSQL разработать серверную часть проекта.
3. В соответствии с запросами GET, POST, PUT и DELETE, поступающими от пользователя, реализовать отображение всех товаров на сайте, отображение определенного товара, возможность добавления и редактирования товара, удаление товара.
4. Каталог товаров отобразить со следующей обязательной информацией: название, описание, цена и фотография товара.
5. Права на добавление, редактирование и удаление товаров предоставить администратору сайта.
6. Реализацию пользовательского интерфейса осуществить с помощью фреймворка Bootstrap.



### ГЛАВА 1 ОБЗОР ИНСТРУМЕНТАЛЬНЫХ СРЕДСТВ И ТЕХНОЛОГИЙ

#### 1.1	Язык программирования Java
Язык программирования Java - Си-подобный объектно-ориентированный язык программирования, исполняемость кода которого не зависит от операционной системы или установленного программного обеспечения. Кроссплатформенность языка программирования Java достигается за счет того, что программы, написанные на данном языке программирования, транслируются в байтовый код - этап компиляции -, который затем выполняется виртуальной машиной Java, или Java Virtual Machine (JVM), - этап интерпретации.

JVM/ Java Virtual Machine - основная часть исполняющей системы Java, так называемой Java Runtime Environment (JRE). Виртуальная машина Java интерпретирует Байт-код Java, предварительно созданный из исходного текста Java-программы компилятором Java (javac) [https://quizlet.com/420606696/java-core-flash-cards/].

JRE/ Java Runtime Environment - минимальная реализация виртуальной машины, необходимая для исполнения Java-приложений, без компилятора и других средств разработки. Состоит из виртуальной машины - Java Virtual Machine и библиотеки Java-классов [https://quizlet.com/420606696/java-core-flash-cards/].

Для разработки программ на языке программирования Java необходим специальный комплект разработки, именуемый Java Development Kit (JDK). JDK - бесплатно распространяемый компанией Oracle Corporation комплект разработчика приложений на языке Java, включающий в себя компилятор Java (javac), стандартные библиотеки классов Java, примеры, документацию, различные утилиты и исполнительную систему Java (JRE) [https://quizlet.com/420606696/java-core-flash-cards/].

The JDK is a development environment for building applications, and components using the Java programming language. The JDK includes tools useful for developing and testing programs written in the Java programming language and running on the Java platform [https://www.oracle.com/java/technologies/javase-jdk11-downloads.html].


JAVA (overloading, overriding, @аннотации)

If a class has multiple methods having the same name but different in parameters, it is known as Method Overloading.

There are two ways to overload the method in java:
	1) By changing the number of arguments.
	2) By changing the data type
[https://www.javatpoint.com/method-overloading-in-java].
Method overloading is one of the way java supports static polymorphism*.

class SimpleCalculator {
    int add(int a, int b) {
         return a+b;
    }
    int  add(int a, int b, int c) {
         return a+b+c;
    }
}

Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM [https://www.javatpoint.com/java-annotation].

There are several built-in annotations in Java. For example, @Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.

class SomeClass {
   void method() {
       System.out.println("Работает метод родительского класса.");
   }
}
class AnotherClass extends SomeClass { // наследуем методы SomeClass в новом классе
@Override
   void method() { // переопределяем метод
       System.out.println("Работает метод класса-потомка.");
   }
}
Sometimes, we make spelling mistakes. So, it is better to mark @Override annotation that provides assurity that method is overridden.

Так, например, если в имени метода из AnotherClass будет опечатка, компилятор учтет @Override и выдаст ошибку. Без аннотации он создал бы новый метод в дополнение к method из SomeClass. Т.о., аннотация никак не влияет на переопределение метода, но позволяет контролировать успешность переопределения при компиляции или сборке [https://geekbrains.ru/posts/java_annotations].


#### 1.2	Spring Framework
#### 1.3	Apache Maven Framework
#### 1.4	Система управления базами данных PostgreSQL
#### 1.5	Bootstrap Framework


### ГЛАВА 2 РЕАЛИЗАЦИЯ СЕРВЕРНОЙ ЧАСТИ ПРОЕКТА

В процессе разработки серверной части проекта использовались следующие инструментальные средства и технологии: язык программирования Java 11, Spring Framework, Apache Maven Framework, система управления базами данных PostgreSQL.
Администрирование системы управления базами данных PostgreSQL осуществлялось с помощью платформы «pgAdmin».
Разработка программной части проекта велась в интегрированной среде разработки «IntelliJ IDEA» в операционной системе Windows 10.
Отладка проекта в процессе разработки осуществлялась на локальном компьютере.

#### 2.1	Клиент-серверное взаимодействие в стиле REST
#### 2.2	Схема авторизации
#### 2.3	Схема базы данных


### ГЛАВА 3 РЕАЛИЗАЦИЯ ПОЛЬЗОВАТЕЛЬСКОЙ ЧАСТИ (UI)
#### 3.1	Информационная структура
#### 3.2	Разработка визуального оформления



### ЗАКЛЮЧЕНИЕ

Результатом курсового проекта является адаптивная интернет-витрина магазина интерьерных часов, разработанная с помощью следующих языков программирования и технологий: язык программирования Java, Spring Framework, Apache Maven Framework, система управления базами данных PostgreSQL, Bootstrap Framework.
В ходе выполнения курсового проекта были осуществлены следующие задачи:
1. Проведен обзор следующих инструментальных средств и технологий: язык программирования Java, Spring Framework, Apache Maven Framework, система управления базами данных PostgreSQL, Bootstrap Framework.
2. С помощью языка программирования Java и системы управления базами данных PostgreSQL разработана серверная часть проекта.
3. В соответствии с запросами GET, POST, PUT и DELETE, поступающими от пользователя, реализовано отображение всех товаров на сайте, отображение определенного товара, возможность добавления и редактирования товара, удаление товара.
4. Каталог товаров отображается со следующей обязательной информацией: название, описание, цена и фотография товара.
5. Права на добавление, редактирование и удаление товаров предоставлены администратору сайта.
6. Реализация пользовательского интерфейса осуществлена с помощью фреймворка Bootstrap.
