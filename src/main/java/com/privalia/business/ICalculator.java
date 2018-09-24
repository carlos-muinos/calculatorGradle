package com.privalia.business;

public interface ICalculator {

    // SE OMITE EL PUBLIC, PORQUE ES UNA INTERFAZ Y POR DEFECTO SUS MÉTODOS SON
    // PÚBLICOS
    int sum(int num1, int num2);

    int substract(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2);

}
