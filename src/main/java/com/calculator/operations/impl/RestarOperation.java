package com.calculator.operations.impl;

import com.calculator.enums.OperationType;
import com.calculator.operations.BasicOperation;

public class RestarOperation extends BasicOperation {

    public RestarOperation() {
        super(OperationType.RESTAR);
    }

    @Override
    public Double doOperation(Double numero1, Double numero2) {
        return numero1 - numero2;
    }
}
