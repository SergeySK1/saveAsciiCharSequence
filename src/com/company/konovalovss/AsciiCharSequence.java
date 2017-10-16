package com.company.konovalovss;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] asciiChars;

    public AsciiCharSequence(byte[] asciiChars){
        this.asciiChars = asciiChars;
    }


    @Override
    public int length() {
        return asciiChars.length;
    }

    @Override
    public char charAt(int index) {
        char t = (char) asciiChars[index];
        return t;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(asciiChars, start, end));
    }

    public String toString() {

        return new String(asciiChars,0,asciiChars.length);
    }
}
/*
* Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.

P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254*/
