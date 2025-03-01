class ContaSalario extends ContaCorrente {
    private int saquesGratuitos;
    private static final double TAXA_EXTRA = 5.0;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitos = 1;
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesGratuitos > 0) {
            saquesGratuitos--;
            return super.sacar(valor);
        } else {
            double valorComTaxa = valor + TAXA_EXTRA;
            return super.sacar(valorComTaxa);
        }
    }
}
