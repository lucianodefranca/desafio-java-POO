import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso("Java OO", "Descrição curso java OO", 10);
        Curso c2 = new Curso("PHP", "Descrição curso de PHP", 8);

        Mentoria m1 = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());
        Mentoria m2 = new Mentoria("Mentoria PHP", "Descrição mentoria PHP", LocalDate.now());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(m2);


    }
}
