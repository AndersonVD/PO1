package Atividades.pingNetwork;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner oEntrada = new Scanner(System.in);

		System.out.print("Informe o tempo de verificação: ");
		int iEntrada = oEntrada.nextInt();
		oEntrada.close();
		ControladorServidor oControlador = new ControladorServidor(iEntrada * 1000);
		int inativoTempo = 0;
		int ativoTempo = 0;
		while (true) {

			Servidor oServidor = new Servidor("Batatinha", "batatinha123@cuervello.com", "192.168.1.8");

			try {
				oControlador.verficarServidor(oServidor);
				System.out.println(".");
				inativoTempo = 0;
				ativoTempo++;
				oControlador.setTempoAtivo(ativoTempo);
				oControlador.setTempoInativo(inativoTempo);
			} catch (Exception e) {
				inativoTempo++;
				ativoTempo = 0;
				oControlador.setTempoAtivo(ativoTempo);
				oControlador.setTempoInativo(inativoTempo);
				System.out.println(e);
			}
		}
	}
}
