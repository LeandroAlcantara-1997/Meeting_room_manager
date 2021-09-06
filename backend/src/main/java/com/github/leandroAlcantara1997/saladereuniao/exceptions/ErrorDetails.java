package com.github.leandroAlcantara1997.saladereuniao.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor //Cria construtor com argumentos
@Getter //Cria métodos getters
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;
}
