package br.com.ufpb.projetolp.lojaContrucao;

/**
 * Escreva a descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Produto{
    private String nome;
    private String categoria;
    private String marca;
    private String fabricante;
    private double preco;
    private int quant;
    
    
    /**
     * COnstrutor para objetos da classe Produto
     */
    public Produto(){
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
}
