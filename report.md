## ИНТЕРНЕТ-ВИТРИНА МАГАЗИНА ИНТЕРЬЕРНЫХ ЧАСОВ
### Курсовой проект


### СОДЕРЖАНИЕ
ВВЕДЕНИЕ	4
ГЛАВА 1 ОБЗОР ИНСТРУМЕНТАЛЬНЫХ СРЕДСТВ И ТЕХНОЛОГИЙ	5
1.1	Язык программирования Java	5
1.2	Spring Framework	5
1.3	Maven	5
1.4	PostgreSQL	5
1.5	Bootstrap	6
ГЛАВА 2 РЕАЛИЗАЦИЯ СЕРВЕРНОЙ ЧАСТИ	7
2.1	Клиент-серверное взаимодействие в стиле REST	7
2.2	Схема авторизации	7
2.3	Схема базы данных	7
ГЛАВА 3 РЕАЛИЗАЦИЯ ПОЛЬЗОВАТЕЛЬСКОЙ ЧАСТИ (UI)	8
3.1	Информационная структура	8
3.2	Разработка визуального оформления	9
ЗАКЛЮЧЕНИЕ	10
СПИСОК ИСПОЛЬЗУЕМЫХ ИСТОЧНИКОВ	11
ПРИЛОЖЕНИЯ	12


### ВВЕДЕНИЕ


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
#### 1.3	Maven
#### 1.4	PostgreSQL
#### 1.5	Bootstrap


### ГЛАВА 2 РЕАЛИЗАЦИЯ СЕРВЕРНОЙ ЧАСТИ
#### 2.1	Клиент-серверное взаимодействие в стиле REST
#### 2.2	Схема авторизации
#### 2.3	Схема базы данных


### ГЛАВА 3 РЕАЛИЗАЦИЯ ПОЛЬЗОВАТЕЛЬСКОЙ ЧАСТИ (UI)
#### 3.1	Информационная структура
#### 3.2	Разработка визуального оформления
