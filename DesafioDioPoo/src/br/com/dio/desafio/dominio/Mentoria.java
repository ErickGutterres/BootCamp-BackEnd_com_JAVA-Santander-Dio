package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;


    public double calcularXp() {
        return XP_PADRAO+20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "\n\nMentoria\n\nTitulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nData: " + data;
    }

    

    
}
