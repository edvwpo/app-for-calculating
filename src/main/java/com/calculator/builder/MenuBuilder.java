package com.calculator.builder;

import com.calculator.enums.OperationType;

import java.util.List;

public class MenuBuilder {

    public String build(List<OperationType> options){
        StringBuilder sb = new StringBuilder();
        sb.append("Opciones: \n");
        for (OperationType type : options){
            sb.append(type.getCode() + ". " + type.name() + "\n");
        }
        sb.append("-1. Salir\n");
        sb.append("Seleccione una opcion: ");
        return sb.toString();
    }

}
