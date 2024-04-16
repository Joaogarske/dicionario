package org.example;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {


    private Map<String,String> dicionarioPortugues = new HashMap<>();
    private Map<String,String> dicionarioIngles  = new HashMap<>();




    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario){
        switch (dicionario){
            case INGLES:
                dicionarioIngles.put(palavra.toLowerCase(),traducao);
                break;
            case PORTUGUES:
                dicionarioPortugues.put(palavra.toLowerCase(),traducao);
                break;

        }

    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca){
        Map<String, String> dicionario = (dicionarioDeBusca == TipoDicionario.INGLES) ? dicionarioIngles : dicionarioPortugues;
        String traducao = dicionario.get(palavra.toLowerCase());
        if (traducao == null) {
            throw new PalavraNaoEncontradaException();
        }
        return traducao;
    }


}
