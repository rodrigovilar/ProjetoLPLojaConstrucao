package br.com.ufpb.projetolp.lojaContrucao;

/**
 * Escreva a descrição da classe Loja aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Loja{
    //Atributos
    private Produto[] produtos;
    private Cliente[] clientes;
    private Funcionario[] funcionarios;
    private Fabricante[] fabricantes;
    private int contFabricantes;
    private int contProdutos;
    private int contClientes;
    private int contFuncionarios;
    private final int IDADE_MINIMO = 18;
    
    public double FazerCompraCliente(Produto produto, int quantidade){
        double valorCompra;
        valorCompra = produto.getPreco() * quantidade;
        return valorCompra;
    }
    public int ReportarAlvaria(Produto produto,int quant){
        return quant;
     }
    public Loja(int quantProduto, int quantCliente, int quantFuncionario, int quantFabricante){
        //Construtor da Classe principal.
        produtos = new Produto[quantProduto];
        clientes = new Cliente[quantCliente];
        funcionarios = new Funcionario[quantFuncionario];
        fabricantes = new Fabricante[quantFabricante];
    }
    public String defineHorario(Funcionario funcionario){
        String horario;
        if(funcionario.getSexo() =="feminino"){
            return "Horário Diurno";
        }else{
            return "Horário Noturno";
        }
        
    }
    public String validaIdadeFuncionario(Funcionario funcionario){
        if(funcionario.getIdade() < IDADE_MINIMO){
            return "Funcionário Não pode ser Contratado!!!!";
        }else{
            return "Parabéns Contratado!!!";
        }
    }
    public void cadastrarProduto(Produto produto){
        produtos[contProdutos++] = produto;        
    }
    public void cadastrarFabricante(Fabricante novoFabricante){
        for (Fabricante fabricanteAntigo : fabricantes) {
            
            if ( (fabricanteAntigo != null) && 
                 (fabricanteAntigo.getCnpj() == novoFabricante.getCnpj()) ) {
                return;
            }
        }
        fabricantes[contFabricantes++] = novoFabricante;        
    }
    public void cadastrarFuncionario(Funcionario novoFuncionario) {
        for (Funcionario funcionarioAntigo : funcionarios) {
            
            if ( (funcionarioAntigo != null) && 
                 (funcionarioAntigo.getCpf() == novoFuncionario.getCpf()) ) {
                return;
            }
        }
        funcionarios[contFuncionarios++] = novoFuncionario;
    }
    public void cadastrarCliente(Cliente novoCliente) {
      for (Cliente clienteAntigo : clientes) {
            
            if ( (clienteAntigo != null) && 
                 (clienteAntigo.getCpf() == novoCliente.getCpf()) ) {
                return;
            }
      }
      clientes[contClientes++] = novoCliente;
    }
    public Produto getProduto(int posicao) {
        return produtos[posicao];
    }
    public Fabricante getFabricante(int posicao){
        return fabricantes[posicao];
    }
    public Funcionario getFuncionario(int posicao) {
        return funcionarios[posicao];
    }
    public Cliente getCliente(int posicao) {
        return clientes[posicao];
    }
    public Produto[] getProdutos(){
        return produtos;
     }
    public Cliente[] getClientes(){
        return clientes;
     }
    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }
    public Fabricante[] getFabricantes(){
        return fabricantes;
     }
    public int getCapacidadeFabricantes() {
        return fabricantes.length;
    }
    public int getCapacidadeProdutos() {
        return produtos.length;
    }
    public int getCapacidadeFuncionarios() {
        return funcionarios.length;
    }
    public int getCapacidadeClientes() {
        return clientes.length;
    }
}
