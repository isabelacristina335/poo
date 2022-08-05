package poo.modelo;
import poo.modelo.Cliente;
import poo.modelo.Endereco;
import java.util.ArrayList;


public class Entrega {
	public static void main(String[] args){
	        Endereco endereco =new Endereco();
	        endereco.cep= "00000000";
	     
	      
	        
	    Cliente cliente = new Cliente();
	    try {
	    cliente.adicionaEndereco(endereco);
	     System.out.println("Endereço adicionado com sucesso!");
	 } catch(Exception e) {
	    System.err.println("Houve  um erro ao adicionar endereço!"+e.getMessage());
	    	
	    }
	       
	}
}

