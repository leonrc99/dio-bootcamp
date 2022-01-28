import com.dio.bootcamp.dominio.Bootcamp;
import com.dio.bootcamp.dominio.Curso;
import com.dio.bootcamp.dominio.Dev;
import com.dio.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso de Java básico.");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Introdução a Orientação a Objetos");
        curso2.setDescricao("Neste curso faremos uma introdução ao paradigma de Orientação à Objetos.");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Sobre o Java");
        mentoria.setDescricao("Vamos falar e tirar dúvidas sobre o Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Campo de treinamento para novos desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Leonardo: \n" + devLeonardo.getConteudosInscritos() + "\n");
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("Conteúdos concluídos de Leonardo: \n" + devLeonardo.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos inscritos de Leonardo: \n" + devLeonardo.getConteudosInscritos() + "\n");
        System.out.println("Total de XP: " + devLeonardo.calcularTotalXp() + "\n");

        System.out.println("================================================================================================================");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("================================================================================================================\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: \n" + devJoao.getConteudosInscritos() + "\n");
        devJoao.progredir();
        System.out.println("Conteúdos concluídos de João: \n" + devJoao.getConteudosConcluidos() + "\n");
        System.out.println("Conteúdos inscritos de João: \n" + devJoao.getConteudosInscritos() + "\n");
        System.out.println("Total de XP: " + devJoao.calcularTotalXp() + "\n");






    }
}
