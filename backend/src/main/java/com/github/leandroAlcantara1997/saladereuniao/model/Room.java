package com.github.leandroAlcantara1997.saladereuniao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Métodos acessores.
@Getter
@Setter

//Construtores sem argumentos e com argumentos.
@NoArgsConstructor
@AllArgsConstructor

//Define a classe como uma entidade.
@Entity
//Define o nome da tabela relacionada a classe.
@Table(name = "meetingroom")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "date", nullable = false)
    private String date;
    @Column(name = "startHour", nullable = false)
    private String startHour;
    @Column(name = "endHour", nullable = false)
    private String endHour;

    @Override
    public String toString(){
        return "Room [Id=" + id
                + ", name=" + name
                + ", startHour=" + startHour
                + ", endHour=" + endHour
                + "]";
    }
}
