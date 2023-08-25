package Atividades.pingNetwork;

import java.net.InetAddress;
import java.util.Date;

public class ControladorServidor {

	private int iTempoVerificacao;

	private int tempoAtivo;

	private int tempoInativo;

	public ControladorServidor(int iTempoVerificacao) {
		this.setTempoVerificacao(iTempoVerificacao);
	}

	public void setTempoVerificacao(int iTempoVerificacao) {
		this.iTempoVerificacao = iTempoVerificacao;
	}

	public void setTempoInativo(int tempoInativo) {
		this.tempoInativo = tempoInativo;
	}

	public int getTempoVerificacao() {
		return this.iTempoVerificacao;
	}

	public int getTempoInativo() {
		return this.tempoInativo;
	}

	public int getTempoAtivo() {
		return tempoAtivo;
	}

	public void setTempoAtivo(int tempoAtivo) {
		this.tempoAtivo = tempoAtivo;
	}

	public void verficarServidor(Servidor oServidor) throws Exception {

		long iTempoVerificacao = System.currentTimeMillis() * 1000;

		StringBuilder oString = new StringBuilder();
		oString.append("Tempo Verificacao Informado: ").append(this.getTempoVerificacao()).append("\n");
		oString.append("Data de Verificacao: ").append(new Date()).append("\n");
		oString.append("Tempo de Verificacao : ").append(iTempoVerificacao).append("\n");
		oString.append("Servidor : ").append(oServidor).append("\n");
		oString.append("Tempo Ativo : ").append(this.getTempoAtivo()).append("\n");
		oString.append("Tempo Inativo : ").append(this.getTempoInativo()).append("\n");

		if (!InetAddress.getByName(oServidor.getIP()).isReachable(this.getTempoVerificacao())) {
			throw new Exception(oString.toString());
		}

	}
}
