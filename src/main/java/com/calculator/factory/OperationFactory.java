package com.calculator.factory;

import com.calculator.enums.OperationType;
import com.calculator.operations.BasicOperation;
import com.calculator.operations.impl.MultiplicarOperation;
import com.calculator.operations.impl.RestarOperation;
import com.calculator.operations.impl.SumarOperation;

public class OperationFactory {

    public BasicOperation build(OperationType type){
        switch (type){
            case SUMAR:
                return new SumarOperation();
            case RESTAR:
                return new RestarOperation();
            case MULTIPLICAR:
                return new MultiplicarOperation();
            default:
                return null;
        }
    }

}
