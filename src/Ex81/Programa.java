package Ex81;

public class Programa {
	
	public static void main(String[] args) {
		//Publicador publicador = new Publicador();
		//publicador.consomeNoticia("Texto bem longo, varias e varias linhas ", 18, 4, "Atividade 7");
		ConsomeNoticia agregadorTopico = new AgregadorTopico("Topico 1");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		
		noticiario.notificaNoticia("Noticia 1", 1, 1, "Topico 1");
		noticiario.notificaNoticia("Noticia 2", 3, 2, "Topico 1");
		noticiario.notificaNoticia("Noticia 3", 17, 2, "Topico 1");
		noticiario.notificaNoticia("Noticia 4",17, 3, "Topico 1");
		noticiario.notificaNoticia("Noticia 5", 23, 1, "Topico 1");
		noticiario.notificaNoticia("Noticia 6", 10, 4, "Topico 1");
		noticiario.notificaNoticia("Noticia 7", 22, 4, "Topico 1");
		noticiario.notificaNoticia("Noticia 8", 21, 4, "Topico 1");
		noticiario.notificaNoticia("Noticia 9", 30, 4, "Topico 1");
		noticiario.notificaNoticia("Noticia 10", 23, 1, "Topico 1");
			noticiario.notificaNoticia("Noticia 1", 13, 5, "Topico 2");
		
			System.out.println("------------------------------------------");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("Noticia 1", 4, 1, "Topico 3");
		noticiario.notificaNoticia("Noticia 2", 5, 1, "Topico 3");
		noticiario.notificaNoticia("Noticia 3", 10, 1, "Topico 3");
		noticiario.notificaNoticia("Noticia 4", 14, 1, "Topico 3");
		noticiario.notificaNoticia("Noticia 5", 22, 1, "Topico 3");
		noticiario.notificaNoticia("Noticia 1", 14, 2, "Topico 4");
		noticiario.notificaNoticia("Noticia 2", 23, 2, "Topico 3");
		noticiario.notificaNoticia("Noticia 1",3 , 3, "Topico 5");
		noticiario.notificaNoticia("Noticia 2", 7, 3, "Topico 5");
		noticiario.notificaNoticia("Noticia 3", 16, 3, "Topico 5");
		noticiario.notificaNoticia("Noticia 4", 3, 4, "Topico 5");
	}

}
