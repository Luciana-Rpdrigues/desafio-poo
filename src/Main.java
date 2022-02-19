import com.luciana.desafio.dominio.Servico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Servico servico1 = new Servico();
        servico1.setTitulo("Carro do Lau");
        servico1.setDescricao("Tampa traseira, desamassar e pintar.");
        servico1.setData(LocalDate.now());

        Servico servico2 = new Servico();
        servico2.setTitulo("Chevett do Daniel ");
        servico2.setDescricao("Turbinar motor.");
        servico2.setData(LocalDate.now());

        System.out.println(servico1);
        System.out.println(servico2);

    }
}
