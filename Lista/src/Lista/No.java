package Lista;

public class No  {
	private int info;
	private No proximo;
	private No anterior;
//-----------------------------------------------------------	
// CRIA CRONSTRUTORES DE NO
//-----------------------------------------------------------	
	public No(int x, No Pproximo){
		info= x;
		this.proximo = Pproximo;	
		//this.anterior = proximo;
	}
	
	public No(int x){
		info= x;
	}

	//-----------------------------------------------------------	
	// PEGA O VALOR DO CONTEUDO DO  NO 
	//-----------------------------------------------------------	
	public int getInfo() {
		return info;
	}
//-----------------------------------------------------------	
// PEGA O ENDERECO DO PROXIMO NO 
//-----------------------------------------------------------		
	public No getProximo() {	
		return proximo;
	}
//-----------------------------------------------------------	
// PEGA O ENDERECO DO PROXIMO NO 
//-----------------------------------------------------------		
	public No getAnterior() {	
			return anterior;
	}

//-----------------------------------------------------------	
// ALTERA O VALOR DO CONTEUDO DO  NO 
//-----------------------------------------------------------
	public void setInfo(int info) {		
		 this.info = info;

	}
//-----------------------------------------------------------	
// ALTERA O VALOR DO PROXIMO  NO 
//-----------------------------------------------------------
	public No setProximo(No p) {		
		 return this.proximo = p;

	}
	//-----------------------------------------------------------	
	// ALTERA O VALOR DO PROXIMO  NO 
	//-----------------------------------------------------------
	public No setAnterior(No p) {		
		 return this.anterior = p;

	}

}