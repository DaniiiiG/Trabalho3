public class Main {
    public static void main(String[] args) {
        System.out.println("=== Criando Contas ===");
        
        ContaCorrente cc = new ContaCorrente("12345", "João", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("67890", "Maria", 2000.0);
        ContaInvestimento ci = new ContaInvestimento("11223", "Pedro", 5000.0);
        ContaSalario cs = new ContaSalario("33445", "Ana", 1500.0, 300.0);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("55667", "Carlos", 12000.0);

        System.out.println("\n=== Testando Depósitos ===");
        cc.depositar(500);
        cp.depositar(300);
        ci.depositar(1000);
        cs.depositar(200);
        ciar.depositar(2000);

        System.out.println("\n=== Testando Saques ===");
        cc.sacar(1200);
        cp.sacar(2500);
        ci.sacar(500);
        cs.sacar(400);
        ciar.sacar(11000);

        System.out.println("\n=== Exibindo Informações das Contas ===");
        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        ciar.exibirInformacoes();
    }
}
