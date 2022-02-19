import com.luciana.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Servico servico1 = new Servico();
        servico1.setTitulo("Carro do Lau");
        servico1.setCarro("Fusca");
        carro1.setCor("Azul");
        servico1.setDescricao("Tampa traseira, desamassar e pintar");
        servico1.setData(LocalDate.now());

        Servico servico2 = new Servico();
        servico2.setTitulo("Carro do Daniel");
        servico2.setCarro("Chevett");
        carro2.setCor("Marrom");
        servico2.setDescricao("Turbinar motor");
        servico2.setData(LocalDate.now());

        Orcamento orcamento1 = new Orcamento();
        orcamento1.setPeca("Tampa traseira");
        orcamento1.setMaterial("Lixas, Tintas, Massas, Vernizes, Catalizadores, Primes, Massa de polir");
        orcamento1.setMaoDeObra(300);
        orcamento1.setValor(600);

        Orcamento orcamento2 = new Orcamento();
        orcamento2.setPeca("Motor");
        orcamento2.setMaterial("Turbina, embreagem, junta do cabeçote, bomba de combustível, bomba de óleo");
        orcamento2.setMaoDeObra(3500);
        orcamento2.setValor(7000);

        Oficina oficina = new Oficina();
        oficina.setNome("Oficina do Bilú");
        oficina.setDescricao("Lanternagem e Pintura de Automóveis em geral");
        oficina.getConteudos().add(servico1);
        oficina.getConteudos().add(servico2);
        oficina.getConteudos().add(orcamento1);
        oficina.getConteudos().add(orcamento2);

        Cliente clienteLaudelino = new Cliente();
        clienteLaudelino.setNome("Laudelino");
        clienteLaudelino.entregarOficina(oficina);
        System.out.println("Carros entregues por Laudelino" + clienteLaudelino.getConteudosEntregues());
        clienteLaudelino.contratar();
        clienteLaudelino.contratar();
        System.out.println("-");
        System.out.println("Carros entregues por Laudelino" + clienteLaudelino.getConteudosEntregues());
        System.out.println("Carros retirados por Laudelino" + clienteLaudelino.getGetConteudosRetirados());
        System.out.println("ORC:" + clienteLaudelino.calcularTotalOrc());

        System.out.println("----------------");

        Cliente clienteDaniel = new Cliente();
        clienteDaniel.setNome("Daniel");
        clienteDaniel.entregarOficina(oficina);
        System.out.println("Carros entregues por Daniel" + clienteDaniel.getConteudosEntregues());
        clienteDaniel.contratar();
        clienteDaniel.contratar();
        System.out.println("-");
        System.out.println("Carros entregues por Daniel" + clienteDaniel.getConteudosEntregues());
        System.out.println("Carros retirados por Daniel" + clienteDaniel.getGetConteudosRetirados());
        System.out.println("ORC:" + clienteDaniel.calcularTotalOrc());

    }
}
