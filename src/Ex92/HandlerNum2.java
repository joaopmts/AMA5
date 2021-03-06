package Ex92;

public class HandlerNum2 implements Handler {
	private Handler handler;
	private int num;

	public HandlerNum2() {
		this.num = 2;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;

	}

	@Override
	public void process(Numero numero) {

		if(numero.getNumero() == num) {
			System.out.println(handlerRequest(numero.getNumero()));
		}else if(handler != null) {
			handler.process(numero);
		}else {
			System.out.println("Numero nao pertence a um Handler");
		}
	}


	@Override
	public String handlerRequest(int numero) {
		return "Numero do Handler :"+ numero;
	}

}
