class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_RETIRADA = 0.05;
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor * (1 + TAXA_RETIRADA);
        if (saldo >= valorComTaxa && saldo >= SALDO_MINIMO) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de 5%.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou abaixo do mínimo de R$ 10.000,00.");
            return false;
        }
    }
}
