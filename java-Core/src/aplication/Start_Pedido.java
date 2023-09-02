package aplication;

import java.util.Date;

import collection.StatusPedido;
import entities.Pedido;

public class Start_Pedido {

	public static void main(String[] args) {
		// Instanciar um pedido (objeto, obj).
		Pedido pedido1 = new Pedido(543, new Date(), StatusPedido.PENDENTE_DE_PAGAMENTO);
		
		System.out.println(pedido1);
		
		// Converter um objeto String em enum.
		// Instância de pedido2, receber um status de entregue.
		
		StatusPedido pedido2 = StatusPedido.ENTREGUE;
		
		
		
		
	}

}
