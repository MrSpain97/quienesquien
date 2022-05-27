package com.example.quienesquien;

import com.example.quienesquien.Personaje;

import java.util.ArrayList;

public class Player {
    Personaje[] persons = new Personaje[20];

    private  int playerEcontrado = -1;

    int[] recorrdio = new int[20];

    ArrayList<Integer> preguntas;


    public Player() {
        persons[0] = new Personaje ("Marcos",false,true,true,true,false,false,true);
        persons[1] = new Personaje ("Miguel",false,false,true,true,true,false,false);
        persons[2] = new Personaje ("Carlos",true,false,false,true,false,true,false);
        persons[3] = new Personaje ("Brandon",false,true,false,true,true,false,false);
        persons[4] = new Personaje ("Sebas",false,true,false,true,false,false,false);
        persons[5] = new Personaje ("kevin",false,true,true,false,true,false,false);
        persons[6] = new Personaje ("Marc",true,true,false,false,false,true,false);
        persons[7] = new Personaje ("roberto",true,false,false,false,false,false,true);
        persons[8] = new Personaje ("alan",false,false,false,false,false,false,false);
        persons[9] = new Personaje ("bogdan",false,false,false,false,false,false,false);

        persons[10] = new Personaje ("rosa",false,true,false,true,false,false,false);
        persons[11] = new Personaje ("rosamar",false,true,false,false,false,false,false);
        persons[12] = new Personaje ("marbelys",false,true,false,false,false,false,false);
        persons[13] = new Personaje ("laura",false,false,false,false,true,false,false);
        persons[14] = new Personaje ("pierina",false,true,false,false,false,false,false);
        persons[15] = new Personaje ("iria",false,false,true,false,false,false,false);
        persons[16] = new Personaje ("Maria",false,true,true,false,false,false,false);
        persons[17] = new Personaje ("Kata",false,true,false,false,false,false,false);
        persons[18] = new Personaje ("Rosa",false,false,false,false,true,false,false);
        persons[19] = new Personaje ("Pepa",false,false,true,false,false,false,false);
    }

}

