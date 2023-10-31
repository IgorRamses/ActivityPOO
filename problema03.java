/*Escreva um programa para controle de empréstimo de livros em um sistema de biblioteca. Para isso é
necessário criar três classes (Empréstimo, Livro e Pessoa). A classe Pessoa serve para cadastrar os dados
de uma pessoa que queira realizar o empréstimo de uma livro na biblioteca, com os seguintes dados:
Nome completo, CPF, e-mail, endereço e telefone. A classe Livro serve para cadastrar os livros
disponíveis no acervo da biblioteca e deve conter os seguintes dados: Título do livro, Autores, Ano,
Edição e Editora. Por fim, a classe Empréstimo serve para registrar os dados de um empréstimo
contendo a pessoa e o livro. Neste programa crie as classes com seus métodos e atributos e faça um
programa principal que permita ao usuário selecionar cadastrar pessoa, cadastrar livro e realizar
empréstimo. */

package aula04.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int edicao;
    private String editora;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, int edicao, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.editora = editora;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}

class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Cliente cliente, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}

public class BibliotecaApp {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo à Biblioteca da Cidade!");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastro de Cliente:");
                System.out.print("Nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("E-mail: ");
                String email = scanner.next();
                System.out.print("Endereço: ");
                scanner.nextLine();
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.next();

                Cliente cliente = new Cliente(nome, cpf, email, endereco, telefone);
                clientes.add(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Cadastro de Livro:");
                System.out.print("Título: ");
                scanner.nextLine();
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Ano de Publicação: ");
                int anoPublicacao = scanner.nextInt();
                System.out.print("Edição: ");
                int edicao = scanner.nextInt();
                System.out.print("Editora: ");
                scanner.nextLine();
                String editora = scanner.nextLine();

                Livro livro = new Livro(titulo, autor, anoPublicacao, edicao, editora);
                livros.add(livro);
                System.out.println("Livro cadastrado com sucesso!");
            } else if (opcao == 3) {
                System.out.println("Realizar Empréstimo:");
                System.out.print("Selecione o Cliente (Digite o número do Cliente):");
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.println((i + 1) + ". " + clientes.get(i).getNome());
                }
                int clienteSelecionado = scanner.nextInt();

                System.out.print("Selecione o Livro (Digite o número do Livro):");
                for (int i = 0; i < livros.size(); i++) {
                    Livro livro = livros.get(i);
                    if (!livro.isEmprestado()) {
                        System.out.println((i + 1) + ". " + livro.getTitulo());
                    }
                }
                int livroSelecionado = scanner.nextInt();

                if (clienteSelecionado >= 1 && clienteSelecionado <= clientes.size() && livroSelecionado >= 1 && livroSelecionado <= livros.size()) {
                    Cliente cliente = clientes.get(clienteSelecionado - 1);
                    Livro livro = livros.get(livroSelecionado - 1);

                    if (!livro.isEmprestado()) {
                        System.out.print("Data de Empréstimo (dd/mm/yyyy): ");
                        scanner.nextLine();
                        String dataEmprestimo = scanner.nextLine();
                        System.out.print("Data de Devolução (dd/mm/yyyy): ");
                        String dataDevolucao = scanner.nextLine();

                        Emprestimo emprestimo = new Emprestimo(cliente, livro, dataEmprestimo, dataDevolucao);
                        emprestimos.add(emprestimo);
                        livro.setEmprestado(true);

                        System.out.println("Empréstimo realizado com sucesso!");
                    } else {
                        System.out.println("Desculpe, este livro já está emprestado.");
                    }
                } else {
                    System.out.println("Opção inválida. Verifique o número do Cliente e do Livro.");
                }
            } else if (opcao == 4) {
                break;
            }
        }

        System.out.println("Obrigado por usar a Biblioteca da Cidade. Volte sempre!");
    }
}
