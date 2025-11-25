package com.aula;

/**
 * Representa o conceito geral de uma casa
 * @author Daniel Müller
 * @version 1.0.0
 * @since 2025-11-25
 * */
public class Casa {

    private String material;
    private boolean resisteAoSopro;
    private int forcaDoSopro;
    private String statusAtual;

    public Casa(String material, boolean resisteAoSopro, int forcaDoSopro, String statusAtual) {
        this.material = material;
        this.resisteAoSopro = resisteAoSopro;
        this.forcaDoSopro = forcaDoSopro;
        this.statusAtual = statusAtual;
    }

    /**
     * @return materias sendo eles Palha, Madeira e Tijolo
     * */
    public String getMaterial() {
        return material;
    }

    /**
     * @param forcaDoSopro mostra a força do sopro do lobo.
     * @return resistencia do sopro vai mostrar se a casa é resistente ao sopro mostrando TRUE como resistente e FALSE como não resistente.
     * */
    public boolean isResisteAoSopro(int forcaDoSopro) {
        return resisteAoSopro;
    }
}
