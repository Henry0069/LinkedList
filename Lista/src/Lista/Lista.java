package Lista;


public class Lista  {

	private No pontIni;
	private No pontUlt;
	int totalNo = 0;
		
//-----------------------------------------------------------	
// INSERIR ITEM NA LISTA NO INICIO 4 - 3 - 2
//-----------------------------------------------------------
	public void insereIni(int x) {			
		No novo = new No(x, pontIni);	
		
		this.pontIni= novo;
		this.pontUlt = novo;
		
		if(this.totalNo == 0) {
			this.pontIni.setAnterior(novo);
			this.pontUlt = this.pontIni;
		}
		
		totalNo++;	
	}
//-----------------------------------------------------------	
//INSERIR ITEM NA LISTA NO FIM 1 - 2 - 3 
//-----------------------------------------------------------
	public void insereFim(int x) {		
		if(totalNo == 0) {
			this.insereIni(x);		
		}else {
			No novo = new No(x);		
			this.pontUlt.setProximo(novo);	
			novo.setAnterior(this.pontUlt);
			this.pontUlt = novo;
			this.totalNo++;						
		}
	}
//-----------------------------------------------------------	
// PEGA O NO DA LISTA
//-----------------------------------------------------------	
	public No getNo(int posicao) {
		No aux = pontIni;
		  for (int i = 0; i < posicao; i++) {
			  aux = aux.getProximo();
		  }
			 return aux;
	}	
//-----------------------------------------------------------	
// BUSCA ITEM NA LISTA
//-----------------------------------------------------------
	public int contBusca = 0;
	public boolean busca(int x) {		
		No aux = this.pontIni;		
		boolean axou = false;
		while(aux != null){			
			if(aux.getInfo() == x) {
				System.out.print("O item: "+x+" esta na posicao: "+contBusca+"\n");
				
				return axou= true;
			}else {
				aux = aux.getProximo();
				this.contBusca++;
			}
		}
		if(axou == false){
			System.out.print("O item: "+x+" nao esta na lista");
		}
		return axou;
	}

//-----------------------------------------------------------	
// RETIRAR O PRIMEIRO ELEMENTO DA LISTA
//-----------------------------------------------------------	
	public void removePri() {			
		if(totalNo != 0){		
			this.pontIni = pontIni.getProximo();
			totalNo --;
	   }
	}
//-----------------------------------------------------------	
// RETIRAR O PRIMEIRO ELEMENTO DA LISTA
//-----------------------------------------------------------	
	public void removeFim() {			
		if(totalNo != 0){		
			this.pontUlt = pontUlt.getAnterior();
			totalNo --;
		 }
	}
//-----------------------------------------------------------	
// RETIRAR UM ELEMENTO DA LISTA
//-----------------------------------------------------------	
	public void retira(int x) {		
		if(this.busca(x) == true) {		
			
	    	
	    	No auxAnt = this.getNo(contBusca-1);	    	
	    	No EXCLUIDO = auxAnt.getProximo();	    	
	    	No auxProx = EXCLUIDO.getProximo();
	    	
	    	auxAnt.setProximo(auxProx);
	    	auxProx.setAnterior(auxAnt);
	    	
	    	System.out.println("EXCLUSAO DO  conteudo: "+ EXCLUIDO.getInfo());
	    	this.totalNo --;	
	    	this.contBusca = 0;
	    }		
	}
	//-----------------------------------------------------------	
	// IMPRIMIR
	//-----------------------------------------------------------	
		public void imprimir() {	
			for(int i=0; i<totalNo; i++) {
				No aux = getNo(i);
				System.out.println("Posicao " + i + " conteudo: "+ aux.getInfo());
		    }		
		}
	//-----------------------------------------------------------	
	// ORDENACOES
	//-----------------------------------------------------------	
		public void Troca(int x, int y) {
					
			this.contBusca = 0;
			this.busca(x);	
			No auxAnt = this.getNo(contBusca-1);
			No posi = auxAnt.getProximo();
			No prox = posi.getProximo();
				   
			this.contBusca = 0;
			this.busca(y);		
			No auxAnt2 = this.getNo(contBusca-1);
			No posi2 = auxAnt2.getProximo();
			No prox2 = posi2.getProximo();
			

			if((auxAnt == auxAnt.getAnterior()) && (prox2 == null) ){
				pontIni = posi2;
				posi2.setAnterior(posi2);
				posi2.setProximo(posi);
				auxAnt2.setProximo(auxAnt);
				auxAnt.setProximo(prox2);
			 
			}
             else if(auxAnt == auxAnt.getAnterior()) {
            	pontIni = posi2;
            	posi2.setAnterior(posi2);
            	posi2.setProximo(posi);
            	posi.setProximo(auxAnt);
            	auxAnt.setProximo(prox2);
            	 
             }
             else if (prox2 == null)  {
            	 auxAnt2.setProximo(posi);
 				posi.setProximo(null);
 				auxAnt.setProximo(posi2);
 				posi2.setProximo(prox);              

             }
             else {             		
			auxAnt.setProximo(posi2);
			posi2.setProximo(prox);
			
             posi2.setProximo(prox);
			 prox.setProximo(auxAnt2);
			 auxAnt2.setProximo(posi);
			 posi.setProximo(prox2);
			}
			
			
			
			
			
		}
//-----------------------------------------------------------	
// BUBBLE SORT
//-----------------------------------------------------------	
	 public void BubbleSort() {
			
			for(int x =0; x<totalNo-1; x++) {
				for(int y =x+1; y<totalNo; y++) {
					No auxAnt = getNo(x);
					No auxProx = getNo(y);
					
					if(auxAnt.getInfo()> auxProx.getInfo()) {
					this.Troca(auxProx.getInfo(),auxAnt.getInfo());					
				}			
			}
		}
	 }
}