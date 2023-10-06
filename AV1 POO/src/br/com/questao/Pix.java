package br.com.questao;

public class Pix extends Pagamento{
    boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return ("Data e hora do pagamento: "
                +getDataHoraPagamento()+" Numero do pagamento: "
                +getNumeroPagamento()+ " Valor Pago: "
                +getValorPago());
    }
}
