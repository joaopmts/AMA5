package Ex91;


import javax.swing.JOptionPane;

public class Maquina {

	public static void main(String[] args) {
		Slot slot1_00 = new Slot1();
		Slot slot50   =	new Slot50();
		Slot slot25   =	new Slot25();
		Slot slot10   =	new Slot10();
		Slot slot5    =	new Slot5();


		slot5.setSlot(slot10);
		slot10.setSlot(slot25);
		slot25.setSlot(slot50);
		slot50.setSlot(slot1_00);


        String escolhido = "";
		double total = 0;
		double preco = 0;
		

		System.out.println("");
		int produto = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu produto: \n1 - Cheetos 4.00 \n2 - Barra de Cereal 2.75 \n3 - Agua 2.0 \n4 - Barrade Chocolate 2.75 \n5 - Refrigerante 5.00"));
		if(produto == 1) {
			preco = 4.00;
			escolhido = "Cheetos";
		}
		if(produto == 2) {
			preco = 2.75;
			escolhido = "Barra de Cereal";

		}
		if(produto == 3) {
			preco = 2.00;
			escolhido = "Agua";
		}
		if(produto == 4) {
			preco = 2.75;
			escolhido = "Barrade Chocolate";
		}
		if(produto == 5) {
			preco = 5.00;
			escolhido = "Refrigerante";
		}
		while(total <= preco) {
			double moeda = Double.parseDouble(JOptionPane.showInputDialog("Insira a moeda..."));
			Moeda money = new Moeda(moeda);
			if(slot5.processar(money) > 0){
				total = total + moeda;
			}
		}


		System.out.println("Produto escolhido:"+escolhido+"\nTotal de reais inserido na maquina R$: " + total);
		System.out.printf("Troco R$: %.2f" , (total - preco));
	}

}

