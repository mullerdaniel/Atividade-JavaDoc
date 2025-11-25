package com.aula;

/**
 * Representa o conceito geral de uma casa
 * @author Daniel Müller
 * @version 1.0.0
 * @since 2025-11-25
 * */
public class Casa {

    private String material;
    private boolean forcaDoSopro;
    private String statusAtual;

    public Casa(String material, boolean forcaDoSopro, String statusAtual) {
        this.material = material;
        this.forcaDoSopro = forcaDoSopro;
        this.statusAtual = statusAtual;
    }

    /**
     * @return materias sendo eles Palha, Madeira e Tijolo
     * */
    public String getMaterial() {
        return material;
    }
}
