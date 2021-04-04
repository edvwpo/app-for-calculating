package com.calculator.operations.impl;

import com.calculator.enums.OperationType;
import com.calculator.operations.BasicOperation;

public class SumarOperation extends BasicOperation {

    public SumarOperation() {
        super(OperationType.SUMAR);
    }

    @Override
    public Double doOperation(Double numero1, Double numero2) {
        return numero1 + numero2;
    }
}
