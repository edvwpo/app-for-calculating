package com.calculator;

import com.calculator.builder.CalculatorBuilder;
import com.calculator.builder.MenuBuilder;
import com.calculator.calculator.BasicCalculator;
import com.calculator.enums.OperationType;

import java.util.Scanner;

public class AppForCalculating {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        CalculatorBuilder calculatorBuilder = new CalculatorBuilder();
        BasicCalculator calculator = calculatorBuilder.generateOperationList();
        String menu = new MenuBuilder().build(calculator.getAvaiableTypes());
        int option = -1;
        do{
            System.out.println(menu);
            option = scanner.nextInt();

            if (option > 0){
                System.out.print("Ingrese primer numero: ");
                Double numero1 = scanner.nextDouble();
                System.out.print("Ingreso segundo numero: ");
                Double numero2 = scanner.nextDouble();
                System.out.println("Resultado: " + calculator.calculate(OperationType.getOperationByCode(option), numero1, numero2));
            }

        }while (option > 0);


    }

}
