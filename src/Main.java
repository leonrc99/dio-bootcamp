import com.dio.bootcamp.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(curso2);
    }
}
