import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("JAVA");
        curso1.setDescricao("CURSO DE JAVA INICIANTE");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("JAVASCRIPT");
        curso2.setDescricao("CURSO DE JAVASCRIPT");
        curso2.setCargaHoraria(50);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("MENTORIA DE JAVA");
        mentoria1.setDescricao("DESCRICAO MENTORIA JAVA");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(mentoria1);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp JAVA Developer");
        bootcamp.setDescricao("Descricao BootCamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Joao");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev.getConteudoInscritos());
        dev.progredir();
        System.out.println("----******---");
        System.out.println("Conteudos Inscritos: " + dev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudoConluidos());
        System.out.println("XP: "+dev.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("----******---");
        System.out.println("Conteudos Inscritos: " + dev2.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudoConluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());

    }
}
