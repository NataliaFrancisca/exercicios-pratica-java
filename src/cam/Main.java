import cam.*;

void main() {
    // criar uma instância da classe cam.Funcionario => new cam.Funcionario();
    // novo objeto => nat, que tem cargo e salario
    Funcionario nat = new Funcionario();
    nat.nome = "natalia";
    nat.cargo = "tecnico de operacoes";
    nat.salario = 2.000;

    Funcionario luiz = new Funcionario();
    luiz.nome = "luiz";
    luiz.cargo = "desenvolvedor";
    luiz.salario = 10000;
    luiz.exibirInformacoes();
    luiz.reajustarSalario(40);

    Produto a = new Produto("Mouse Gamer", 159.9, 25);
    a.exibirInformacoes();

    Livro bookA = new Livro("O guia do mochileiro das galaxias", "Douglas Adams", 208);
    bookA.exibirInformacoes();

    Conta conta = new Conta();
    conta.adicionarSaldo(100);
    conta.adicionarSaldo(200);
    conta.exibirSaldo();
    conta.zerarSaldo();
    conta.exibirSaldo();

    ControleTemperatura cta = new ControleTemperatura("Setor A", 39.5);
    ControleTemperatura ctb = new ControleTemperatura("Setor B", 34);

    cta.exibirDetalhes();
    ctb.exibirDetalhes();
}
