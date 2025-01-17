package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConluidos = new LinkedHashSet<>();

    public void inscreverBootcamp (BootCamp bootcamp){

        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir() {

       Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();

       if(conteudo.isPresent()) {
        this.conteudoConluidos.add(conteudo.get());
        this.conteudoInscritos.remove(conteudo.get());
       
    } else {
        System.err.println("Voce nao esta matriculado em nenhum conteudo!");
    }

    }

    public double calcularTotalXp() {
        
        return this.conteudoConluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConluidos() {
        return conteudoConluidos;
    }

    public void setConteudoConluidos(Set<Conteudo> conteudoConluidos) {
        this.conteudoConluidos = conteudoConluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscritos == null) ? 0 : conteudoInscritos.hashCode());
        result = prime * result + ((conteudoConluidos == null) ? 0 : conteudoConluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscritos == null) {
            if (other.conteudoInscritos != null)
                return false;
        } else if (!conteudoInscritos.equals(other.conteudoInscritos))
            return false;
        if (conteudoConluidos == null) {
            if (other.conteudoConluidos != null)
                return false;
        } else if (!conteudoConluidos.equals(other.conteudoConluidos))
            return false;
        return true;
    }

    
    
}
