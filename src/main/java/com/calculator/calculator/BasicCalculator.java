package com.calculator.calculator;

import com.calculator.enums.OperationType;
import com.calculator.operations.BasicOperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicCalculator {

    public Map<OperationType, BasicOperation> getOperationMap() {
        return operationMap;
    }

    private final Map<OperationType, BasicOperation> operationMap;

    public BasicCalculator(Map<OperationType, BasicOperation> operationMap) {
        this.operationMap = operationMap;
    }

    public Double calculate(OperationType type, Double numero1, Double numero2){
        return operationMap.get(type).doOperation(numero1, numero2);
    }

    public List<OperationType> getAvaiableTypes(){
        return operationMap.keySet().stream().collect(Collectors.toList());
    }
}
