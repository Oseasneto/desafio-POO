import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição java");
        mentoria.setData(LocalDate.now());




       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Development");
        bootcamp.setDescricao("Descrição Bootcamp Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Oseas");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "
                + dev1.getNome() + ": "
                + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluidos "
                + dev1.getNome() + ": "
                + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "
                + dev2.getNome() + ": "
                + dev2.getConteudosInscritos());

    }
}
