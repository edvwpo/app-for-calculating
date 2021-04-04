package com.calculator.enums;

import java.util.HashMap;
import java.util.Map;

public enum OperationType {

    SUMAR(1), RESTAR(2), MULTIPLICAR(3), DIVIDIR(4);

    private Integer code;

    private static Map<Integer, OperationType> map = loadMap();

    private static Map<Integer, OperationType> loadMap() {
        Map<Integer, OperationType> mapToLoad = new HashMap<>();
        for (OperationType type : OperationType.values()) {
            mapToLoad.put(type.getCode(), type);
        }
        return mapToLoad;
    }


    OperationType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static OperationType getOperationByCode(Integer code) {
        return map.get(code);
    }

}
