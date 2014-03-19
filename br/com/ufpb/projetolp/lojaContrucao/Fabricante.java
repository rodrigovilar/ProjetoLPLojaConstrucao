package br.com.ufpb.projetolp.lojaContrucao;

/**
 * Escreva a descrição da classe Fabricante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Fabricante{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeFantasia;
    private String endereco;
    private String cnpj;
    
    /**
     * COnstrutor para objetos da classe Fabricante
     */
    public Fabricante(){
        // inicializa variáveis de instância
    }
    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}
