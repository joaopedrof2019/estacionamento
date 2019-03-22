package estacionamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joao Bardock
 */
public class vaga {
    
    
    
    private int qtde;
    private int statusvaga;
    private int cont_vaga;
   
    
   
    
 
    
   
    public vaga(int qtde, int statusvaga, int cont_vaga) {
        this.qtde = 60;
        this.statusvaga = statusvaga;
        this.cont_vaga = this.ListaVeiculos;
    }
    
    public void comparavaga()
    {
        if(ListaVeiculos>qtde)
        {
            System.out.println("Vagas completas");
    }
        else
            
System.out.println("aidna existem vagas");
    
    
 

    
}