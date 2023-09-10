import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Tudo que tem em Conteudo, há em Curso. Porém, nem tudo que há em Curso está em Conteudo
        // Conteudo conteudo = new Curso();
        // Conteudo conteudo1 = new Mentoria();

        Conteudo mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setConteudo("Conteudo Mentoria Java");

        Conteudo curso = new Curso();
        curso.setTitulo("Mentoria Java");
        curso.setConteudo("Conteudo Mentoria Java");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso);

        Dev dev1 = new Dev();
        System.out.println("XP: " + dev1.calcularXp());
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        System.out.println("XP: " + dev2.calcularXp());
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(dev2.getConteudosConcluidos());
        System.out.println(dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularXp());

        // Forçar a exceção
        Dev dev3 = new Dev();
        dev2.setNome("João");
        dev3.progredir();



    }
}