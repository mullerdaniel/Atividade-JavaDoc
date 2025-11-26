package com.aula;

/**
 * Representa um dos três porquinhos
 * @author Daniel Müller
 * @version 1.0.0
 * @since 2025-11-25
 * */
public class Porquinho {

    /**
     * @param tipoCasa aqui vai mostrar qual o tipo casa, se ela é de (Palha, Madeira ou Tijolos).
     * {@link CasaDeTijolos}
     * */
    public void construir(Casa tipoCasa) {
    }

    /**
     * @param porquinhoAlvo Se o porquinho da casa de palha for o alvo ele vai fugir para a casa do porquinho de madeira.
     * @deprecated O porquinho deve simplismente usar a casa do irmão que é mais resistente.
     * */
    public void fugir(Porquinho porquinhoAlvo) {
    }

    /**
     * @return vai pegar o nome do porquinho, nesse caso o (Cícero).
     **/
    public String getNome() {
        return "Cícero";
    }
}
