package Atividades.pingNetwork;

public class Servidor {

	private String sNome;
	private String sEmailResponsavel;
	private String sIP;

	public Servidor(String sNome, String sEmailResponsavel, String sIP) {
		this.setNome(sNome);
		this.setEmailResponsavel(sEmailResponsavel);
		this.setIP(sIP);
	}

	public String getNome() {
		return this.sNome;
	}

	public void setNome(String sNome) {
		this.sNome = sNome;
	}

	public String getEmailResponsavel() {
		return this.sEmailResponsavel;
	}

	public void setEmailResponsavel(String sResponsavel) {
		this.sEmailResponsavel = sResponsavel;
	}

	public String getIP() {
		return this.sIP;
	}

	public void setIP(String sIP) {
		this.sIP = sIP;
	}

	@Override
	public String toString() {
		StringBuilder oString = new StringBuilder();
		oString.append("Nome do Servidor: ").append(this.getNome()).append("\n");
		oString.append("Email Responsavel: ").append(this.getEmailResponsavel()).append("\n");
		oString.append("IP: ").append(this.getIP()).append("\n");
		return oString.toString();
	}

}
