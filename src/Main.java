import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Tudo que tem em Conteudo, há em Curso. Porém, nem tudo que há em Curso está em Conteudo
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        System.out.println(conteudo.calcularXp());
        System.out.println(conteudo1.calcularXp());

    }
}