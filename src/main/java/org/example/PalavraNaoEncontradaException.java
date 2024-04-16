package org.example;

public class PalavraNaoEncontradaException extends  RuntimeException{
    public PalavraNaoEncontradaException() {
        super("palavra nao encontrada!");
    }
}
