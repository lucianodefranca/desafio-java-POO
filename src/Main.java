import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("Java OO");
        c1.setDescricao("Descrição curso java OO");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c1.setTitulo("PHP");
        c1.setDescricao("Descrição curso de PHP");
        c1.setCargaHoraria(6);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("Descrição mentoria Java");
        m1.setData(LocalDate.now());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);



    }
}
