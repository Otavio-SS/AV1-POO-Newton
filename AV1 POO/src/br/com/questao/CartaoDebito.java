package br.com.questao;

public class CartaoDebito extends Pagamento{
    String numCartao;
    String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return ("Data e hora do pagamento: "
                +getDataHoraPagamento()+" Numero do pagamento: "
                +getNumeroPagamento()+ " Valor Pago: "
                +getValorPago()+ " Numero do cartão: "
                +getNumCartao()+ " Titular do cartão: "
                +getTitularCartao());
    }

}
