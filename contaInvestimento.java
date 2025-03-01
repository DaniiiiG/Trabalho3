class ContaInvestimento extends ContaBancaria {
    private static final double TAXA_RETIRADA = 0.02;

    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor * (1 + TAXA_RETIRADA);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de 2%.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }
}
