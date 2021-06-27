package br.com.samuel.jogomemoria.api.service;

public interface Mapper<A, B> {

    B map(A input);
}
