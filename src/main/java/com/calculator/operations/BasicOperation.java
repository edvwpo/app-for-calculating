package com.calculator.operations;

import com.calculator.enums.OperationType;

public abstract class BasicOperation{

    private OperationType type;

    public OperationType getType() {
        return type;
    }

    public BasicOperation(OperationType type) {
        this.type = type;
    }

    public Double doOperation(Double numero1, Double numero2){
        return null;
    }

}
