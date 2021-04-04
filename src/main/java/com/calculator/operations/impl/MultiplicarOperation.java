package com.calculator.operations.impl;

import com.calculator.enums.OperationType;
import com.calculator.operations.BasicOperation;

public class MultiplicarOperation extends BasicOperation {
    public MultiplicarOperation() {
        super(OperationType.MULTIPLICAR);
    }

    @Override
    public Double doOperation(Double numero1, Double numero2) {
        return numero1 * numero2;
    }
}
