/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radinho.da.maça;

 import java.util.Scanner;

public class RadinhoDaMaça {
    
    
    int ler;
    int n;
   
            

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        int ler;
    String n;
    int a;
    String b;
    int c;
        
        System.out.println("--------------BEM VINDO A XIAPHONE------------");
        
        System.out.println("Nesse radin nois tem só contato e agenda parça");
        
        System.out.println("Digite 1 para adicionar um contato");
       
        
        ler = sc1.nextInt();
        
        if (ler >=1){
         System.out.println("Ok, Vamos adicionar os contatos");       
        }
        else {
            System.out.println("Tu fala de forma burra ein");
        }
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o nome");
        n = s1.nextLine();
        System.out.println("Digite o email");
        b = s1.nextLine();
        System.out.println("Digite o telefone");
        a = s1.nextInt();
        System.out.println("Digite o celular");
        c = s1.nextInt();

        
        
       Contato c1 = new Contato (n, a, c, b );
       agenda a1 = new agenda();
       a1.Adicionarctt(c1);

       
       a1.mostrarctt();
        
    }
    
}
