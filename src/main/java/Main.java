import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargahoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Tiago: " + devTiago.getConteudosInscritos());

        devTiago.progredir();
        devTiago.progredir();
        devTiago.progredir();

        System.out.println("____");

        System.out.println("Conteudos Inscritos Tiago: " + devTiago.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tiago: " + devTiago.getConteudosConcluidos());

        System.out.println("****");

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caio: " + devCaio.getConteudosInscritos());

        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();

        System.out.println("____");

        System.out.println("Conteudos Inscritos Caio: " + devCaio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Caio: " + devCaio.getConteudosConcluidos());
    }
}
