package model;

import java.math.BigDecimal;

public class Venda {

	private Long operacao;
	private Long cliente;
	private Integer qtdIngressos;
	private BigDecimal valorTotal;
	private String status;

	public Venda(Long operacao, Long cliente, Integer qtdIngressos, BigDecimal valorTotal, String status) {
		super();
		this.operacao = operacao;
		this.cliente = cliente;
		this.qtdIngressos = qtdIngressos;
		this.valorTotal = valorTotal;
		this.status = status;
	}

	public Venda() {
		
	}
	
	public Long getOperacao() {
		return operacao;
	}

	public void setOperacao(Long operacao) {
		this.operacao = operacao;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public Integer getQtdIngressos() {
		return qtdIngressos;
	}

	public void setQtdIngressos(Integer qtdIngressos) {
		this.qtdIngressos = qtdIngressos;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Venda [operacao=" + operacao + ", cliente=" + cliente + ", qtdIngressos=" + qtdIngressos
				+ ", valorTotal=" + valorTotal + ", status=" + status + "]";
	}

}
