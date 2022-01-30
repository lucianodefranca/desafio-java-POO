import com.sun.security.auth.module.NTSystem;
import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("Java OO");
        c1.setDescricao("Descrição curso java OO");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("Spring Boot");
        c2.setDescricao("Descrição curso de Spring Boot");
        c2.setCargaHoraria(6);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("Descrição mentoria Java");
        m1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("Luciano");
        d1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos " + d1.getNome() + ", " + d1.getConteudosinscritos());

        System.out.println("---------------------------------------");

        d1.progredir();
        d1.progredir();
        System.out.println("Conteúdos Incritos " + d1.getNome() + ", " + d1.getConteudosinscritos());
        System.out.println("Conteúdos Concluidos " + d1.getNome() + ", " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularXpTotal());

        System.out.println("---------------------------------------");

        Dev d2 = new Dev();
        d2.setNome("Barbara");
        d2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos " + d2.getNome() + ", " + d2.getConteudosinscritos());

        System.out.println("---------------------------------------");

        d2.progredir();
        d2.progredir();
        d2.progredir();
        System.out.println("Conteúdos Incritos " + d2.getNome() + ", " + d2.getConteudosinscritos());
        System.out.println("Conteúdos Concluidos " + d2.getNome() + ", " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularXpTotal());

    }
}
