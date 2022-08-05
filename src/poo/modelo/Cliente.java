package poo.modelo;
import java.util.ArrayList;
import java.util.List;
public class Cliente extends Pessoa {
	    
	 public String numCartao;
	 private List<Endereco> endereco;

	 
	 public void adicionaEndereco(Endereco endereco) {
		 if(endereco ==null) {
			 throw  new NullPointerException("Endereço não pode ser nulo");
		 }
		 if(endereco.cep ==null) {
		throw  new NullPointerException("cep não pode ser nulo");
		 }
	    
		 getEndereco().add(endereco);
	 }
		 
   public void setEndereco(List<Endereco> endereco) {
	this.endereco = endereco;
}
  public List<Endereco> getEndereco() {
	  if(endereco ==null) {
		 endereco =new ArrayList<Endereco>();
	  }
	return endereco;
}
}
