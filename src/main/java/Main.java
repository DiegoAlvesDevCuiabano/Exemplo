List<String> pets = new ArrayList<>();

void main() {
    boolean controle = true;
    IO.println("=======Bem vindo ao petshop=======");

    do {
        IO.println("Escolha uma das opções");
        IO.println("1 - Ver Tabela de preços");
        IO.println("2 - Contratar Serviço");
        IO.println("3 - Ver Situação Pets");
        IO.println("4 - Sair");

        int valor = Integer.parseInt(IO.readln());

        switch (valor) {
            case 1:
                verTabelaPreco();
                break;
            case 2:
                contratarServico();
                break;
            case 3:
                verSituacaoPets();
                break;
            case 4:
                controle = false;
            default:
                IO.println("Escolha inválida");
        }

    } while (controle);

}

private void verSituacaoPets() {
    IO.println("=======Situação Pets=======");
    if (pets.size() > 0) {
        for (String s : pets) {
            IO.println(s);
        }
    } else {
        IO.println("Lista vazia");
    }
    IO.println("==============================\n");

}

private void contratarServico() {
    String nome = IO.readln("Informe o nome do seu Pet: ");
    IO.println("Qual serviço deseja contratar?");
    IO.println("1 - Banho");
    IO.println("2 - Tosa");
    IO.println("3 - Banho e Tosa");
    int escolha = Integer.parseInt(IO.readln());
    switch (escolha) {
        case 1:
            pets.add(nome + " contratou Banho");
            break;
        case 2:
            pets.add(nome + " contratou Tosa");
            break;
        case 3:
            pets.add(nome + " contratou Banho e Tosa");
            break;
    }
}

private void verTabelaPreco() {
    IO.println();
    IO.println("=======Tabela de Preços=======");
    IO.println("Banho        - 50 R$");
    IO.println("Tosa         - 50 R$");
    IO.println("Banho e Tosa - 80 R$");
    IO.println("==============================");
    IO.println();
}