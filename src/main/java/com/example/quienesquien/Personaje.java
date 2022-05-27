package com.example.quienesquien;

public class Personaje {

    private String nombre;
    private boolean tieneBigote;
    private boolean usaGafas;
    private boolean usaSombrero;
    private boolean esHombre;
    private boolean tieneBarba;
    private boolean esCalvo;
    private boolean cejasGrandes;

    public Personaje(String nombre, boolean tieneBigote, boolean usaGafas, boolean usaSombrero, boolean esHombre, boolean tieneBarba, boolean esCalvo, boolean cejasGrandes) {
        this.nombre = nombre;
        this.tieneBigote = tieneBigote;
        this.usaGafas = usaGafas;
        this.usaSombrero = usaSombrero;
        this.esHombre = esHombre;
        this.tieneBarba = tieneBarba;
        this.esCalvo = esCalvo;
        this.cejasGrandes = cejasGrandes;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneBigote() {
        return tieneBigote;
    }

    public boolean isUsaGafas() {
        return usaGafas;
    }

    public boolean isUsaSombrero() {
        return usaSombrero;
    }

    public boolean isEsHombre() {
        return esHombre;
    }

    public boolean isTieneBarba() {
        return tieneBarba;
    }

    public boolean isEsCalvo() {
        return esCalvo;
    }

    public boolean isCejasGrandes() {
        return cejasGrandes;
    }
}
