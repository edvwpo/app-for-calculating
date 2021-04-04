package com.calculator.builder;

import com.calculator.calculator.BasicCalculator;
import com.calculator.enums.OperationType;
import com.calculator.factory.OperationFactory;
import com.calculator.operations.BasicOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorBuilder {

    public BasicCalculator generateOperationList(){
        List<BasicOperation> operations = new ArrayList<>();
        OperationFactory operationFactory = new OperationFactory();
        operations.add(operationFactory.build(OperationType.SUMAR));
        operations.add(operationFactory.build(OperationType.RESTAR));
        operations.add(operationFactory.build(OperationType.MULTIPLICAR));

        return generateResponse(operations);
    }

    private BasicCalculator generateResponse(List<BasicOperation> operations){
        Map<OperationType, BasicOperation> map = new HashMap<>();
        for(BasicOperation operation : operations){
            map.put(operation.getType(), operation);
        }
        return new BasicCalculator(map);
    }


}
