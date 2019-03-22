/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

public class automovel {
    private String placa;
    private String modelo;
    private String cor;
   private List listaVeiculos;
    
    
    //construtor
    
    public automovel(String placa,String modelo,String cor)
    {
        this.placa=placa;
        this.modelo=modelo;
        this.cor=cor;
        
        
        
          public void entradaVeiculo(Veiculo v) {
        this.listaVeiculos.add(v);
    }
          
    }
   /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
