/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radinho.da.maça;




public class agenda {
    private int vc = 0; 
    public Contato Listadecontatos[] = new Contato[5];
    
    public void  Adicionarctt(Contato contato){
        Listadecontatos[this.vc] = contato;
        this.vc++;
        
    }
    public void mostrarctt (){
        for(int i = 0; i < this.vc; i++){
            System.out.println(this.Listadecontatos[i].nome);
            System.out.println(this.Listadecontatos [i].telefone);
            System.out.println(this.Listadecontatos [i].celular);
            System.out.println(this.Listadecontatos [i].email);
    }
        
        
        
    }
    
    
    
    
}
