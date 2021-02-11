package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * sistema de controle principal,
*  gerencianeto entrada e saída do usuário
 *
* */
public class SistemaPrincipal {

    private boolean executar;
    private List<Agenda> agendas = new ArrayList<>();
    private int opcoes;

    public SistemaPrincipal() {
        executar = true;
    }

    public void executarPrograma() {
        IO.output("Bem vindo ao programa de agendas.");
        while(executar) {
            IO.output("1. adicionar nova agenda.\n2. Listar.\n3. Encerrar programa!");
            opcoes = IO.input().nextInt();
            if (opcoes == 1) {
                adicionarAgenda();
            } else if (opcoes == 2) {

            } else if (opcoes == 3) {
                executar = false;
            } else {
                IO.output("opção inválida!");
            }
        }
    }

    /**
     * responsavel por criar a agenda
     * */
    private void adicionarAgenda() {
        IO.output("Por favor, digite o nome da agenda: ");
        Agenda agenda = new Agenda();
        agenda.setNome(IO.input().nextLine());
        IO.output("Por favor, quantos contatos deseja adiconar?");
        int numeroDeContatos = IO.input().nextInt();
        adiconarContatosNaAgenda(agenda, numeroDeContatos);
    }


    /**
     * responsável por incluir os contatos na agenda
     * @param agenda
     * @param numeroDeContatos
     */
    private void adiconarContatosNaAgenda(Agenda agenda, int numeroDeContatos) {
        for (int i = 0; i < numeroDeContatos; i++) {
            Contato contato = new Contato();
            IO.output("Por favor digite o nome do contato:");
            contato.setNome(IO.input().nextLine());
            IO.output("Por favor, digite o nome da rua, número, complemento, cep, cidade e estado");
            contato.setEndereco(new Endereco(
                    IO.input().nextLine(),
                    IO.input().nextLine(),
                    IO.input().nextLine(),
                    IO.input().nextLine(),
                    IO.input().nextLine(),
                    IO.input().nextLine()
            ));
            adicionarTelefonesNoContato(contato);
            agenda.getContatos().add(contato);
        }
    }


    /**
     * metodo responsavel por incluir os telefones no contato
     * @param contato
     */
    private void adicionarTelefonesNoContato(Contato contato) {
        IO.output("Por favor, quantos telefones deseja adcionar para esse contato:");
        int qtdTelefone = IO.input().nextInt();
        for (int k = 0; k < qtdTelefone; k++) {
            IO.output("Por favor digite o número de telefone");
            contato.getTelefones().add(IO.input().nextLine());
        }
    }
}
