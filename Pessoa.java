package poo.modelo;
public class Pessoa {
	
	private static final int Tamanho_cpf =11;
	private static final int Tamanho_cnpj =14;

	
	public enum TipoPessoa{FISICA,JURIDICA};
	
	 public Integer codigo;
	 public String nome;
	 private String documento;
	 public TipoPessoa tipo;

	 public String getDocumento() {
		return documento;
	}
	 public void setDocumento(String documento) {
		 if(documento == null&& documento.isEmpty()) {
		 throw new RuntimeException("Documento nao pode ser nulo ou vazio!");
		 }
		 
		 if (documento.length()== Tamanho_cpf) {
		 setDocumento(documento, tipo=TipoPessoa.FISICA);}
			 
		 else if(documento.length()==Tamanho_cnpj) {
          setDocumento(documento,tipo = TipoPessoa.JURIDICA);}	
			 
		 else {throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");}
		 }
		  private void setDocumento(String documento, TipoPessoa tipo){
	    	this.documento = documento;
	    	this.tipo = tipo;}
		  
		public TipoPessoa getTipo(){
			return tipo;}
		
}
