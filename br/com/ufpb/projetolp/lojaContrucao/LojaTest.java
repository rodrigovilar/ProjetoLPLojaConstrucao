package br.com.ufpb.projetolp.lojaContrucao;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste LojaTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class LojaTest
{
    /**
     * Construtor default para a classe de teste LojaTest
     */
    public LojaTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TesteProduto()
    {//Este teste é apenas para o cadastro do produto
        Loja loja1 = new Loja(5,0,0,0);
        Produto produto1 = new Produto();
        produto1.setNome("Cano");
        produto1.setMarca("Tigre");
        produto1.setCategoria("Encanamento");
        produto1.setQuant(10);
        produto1.setFabricante("mec");
        produto1.setPreco(1.50);
        loja1.cadastrarProduto(produto1);
        Produto produtoSalvo = loja1.getProduto(0);
        assertEquals(10, produtoSalvo.getQuant(), 0.1);
        assertEquals(1.50, produtoSalvo.getPreco(), 0.1);
        assertEquals("Cano", produtoSalvo.getNome());
        assertEquals("Tigre", produtoSalvo.getMarca());
        assertEquals("mec", produtoSalvo.getFabricante());
        assertEquals("Encanamento", produtoSalvo.getCategoria());
    }

    @Test
    public void Testefuncionario()
    {//Testando cadastro de funcionário
        Loja loja1 = new Loja(5,2,1,0);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Liviany Reis");
        funcionario1.setSexo("Feminino");
        funcionario1.setSetorTrabalho("Estoque");
        funcionario1.setSexo("Feminino");
        funcionario1.setCpf("733.251.202-53");
        funcionario1.setRg("4142667");
        funcionario1.setCargo("Estoquista");
        funcionario1.setEndereco("Rua Beira Rio");
        loja1.cadastrarFuncionario(funcionario1);
        Funcionario funcionarioSalvo = loja1.getFuncionario(0);
        assertEquals("Feminino", funcionarioSalvo.getSexo());
        assertEquals("Estoque", funcionarioSalvo.getSetorTrabalho());
        assertEquals("4142667", funcionarioSalvo.getRg());
        assertEquals("Liviany Reis", funcionarioSalvo.getNome());
        assertEquals("Rua Beira Rio", funcionarioSalvo.getEndereco());
        assertEquals("733.251.202-53", funcionarioSalvo.getCpf());
        assertEquals("Estoquista", funcionarioSalvo.getCargo());
        assertEquals("Rua Beira Rio", funcionarioSalvo.getEndereco());
    }
    
    @Test
    public void testeCliente()
    {//testando cadastro de cliente
        Loja loja1 = new Loja(1,3,1,0);
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Manoel Farias");
        cliente1.setDataNascimento("20/10/1980");
        cliente1.setCpf("133.201.203-72");
        loja1.cadastrarCliente(cliente1);
        Cliente clienteSalvo1 = loja1.getCliente(0);
        assertEquals("Manoel Farias", clienteSalvo1.getNome());
        assertEquals("20/10/1980", clienteSalvo1.getDataNascimento());
        assertEquals("133.201.203-72", clienteSalvo1.getCpf());
    }
    
    @Test
    public void testeFabricante()
    {//testando o cadastro de fabricante
        Loja loja1 = new Loja(1,3,1,5);
        Fabricante fabricante1 = new Fabricante();
        fabricante1.setNomeFantasia("Distribuira Construção");
        fabricante1.setEndereco("Rua 25 de Março, São Pualo");
        fabricante1.setCnpj("0001.4050.60-15");
        loja1.cadastrarFabricante(fabricante1);
        Fabricante fabricanteSalvo = loja1.getFabricante(0);
        assertEquals("Distribuira Construção", fabricanteSalvo.getNomeFantasia());
        assertEquals("Rua 25 de Março, São Pualo", fabricanteSalvo.getEndereco());
        assertEquals("0001.4050.60-15", fabricanteSalvo.getCnpj());
    }
    
    @Test
     public void PosicaoProdutos() {//teste para verificar a posição de cada produto e capacidade de clientes cadastrados.
        Loja loja1 = new Loja(5,0,0,0);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        loja1.cadastrarProduto(produto1);
        loja1.cadastrarProduto(produto2);
        loja1.cadastrarProduto(produto3);
        assertEquals(produto1, loja1.getProduto(0));
        assertEquals(produto2, loja1.getProduto(1));
        assertEquals(produto3, loja1.getProduto(2));
        assertEquals(5, loja1.getCapacidadeProdutos());
        
    }

    @Test
     public void PosicaoFuncionarios() {//testando posição do cliente e também o cpf do funcionario.
        Loja loja1 = new Loja(0,0,5,0);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setCpf("1");
        loja1.cadastrarFuncionario(funcionario1);
        Funcionario funcionario2 = new Funcionario();
        loja1.cadastrarFuncionario(funcionario2);
        funcionario2.setCpf("2");
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setCpf("3");
        loja1.cadastrarFuncionario(funcionario3);
        assertEquals(funcionario1, loja1.getFuncionario(0));
        assertEquals(funcionario2, loja1.getFuncionario(1));
        assertEquals(funcionario3, loja1.getFuncionario(2));
        assertEquals(5, loja1.getCapacidadeFuncionarios());
        
        
    }
    
    @Test
     public void PosicaoClientes() {//testando posição dos clientes e também seu cpf.
        Loja loja1 = new Loja(1,5,1,0);
        Cliente cliente1 = new Cliente();
        cliente1.setCpf("1");
        loja1.cadastrarCliente(cliente1);
        Cliente cliente2 = new Cliente();
        cliente2.setCpf("2");
        loja1.cadastrarCliente(cliente2);
        Cliente cliente3 = new Cliente();
        cliente3.setCpf("3");
        loja1.cadastrarCliente(cliente3);
        Cliente[] clientes = loja1.getClientes();
        assertNotNull( clientes[0] );
        assertNotNull( clientes[1] );
        assertNotNull( clientes[2] );
    }
    
    @Test
    public void testePosicaoCliente()
    {//Neste Método é testado tanto a posição do cliente quanto seus sets e gets.
        Loja loja1 = new Loja(3,3,2,0);
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Ewerton Ferreira");
        cliente1.setDataNascimento("21/12/1984");
        cliente1.setCpf("144.222.333.444-55");
        loja1.cadastrarCliente(cliente1);
        Cliente clienteSalvo = (cliente1);
        assertEquals("Ewerton Ferreira", clienteSalvo.getNome());
        assertEquals("21/12/1984", clienteSalvo.getDataNascimento());
        assertEquals("144.222.333.444-55", clienteSalvo.getCpf());
        assertEquals(3, loja1.getCapacidadeClientes());
        assertEquals(cliente1, loja1.getCliente(0));
    }
    
    @Test
    public void NovoFabricanteeNovoFuncionario()
    {//testanto um novo fabricante e um novo funcionário e também o cnpj do fabricante e cpf do funcionário.
        Loja loja1 = new Loja(1,2,1,1);
        Fabricante fabricante1 = new Fabricante();
        loja1.cadastrarFabricante(fabricante1);
        Funcionario funcionario1 = new Funcionario();
        loja1.cadastrarFuncionario(funcionario1);
        
        Funcionario[] funcionarios = loja1.getFuncionarios();
        assertNotNull( funcionarios[0] );
        Fabricante[] fabricantes = loja1.getFabricantes();
        assertNotNull( fabricantes[0] );
        
    }
    
    @Test
    public void novoCliente()
    {//testando novo cliente e verificando seu cpf.
        Loja loja1 = new Loja(1,2,0,0);
        Cliente cliente1 = new Cliente();
        loja1.cadastrarCliente(cliente1);
        
        Cliente[] clientes = loja1.getClientes();
        assertNotNull( clientes[0] );
        
    }

    @Test
    public void tresClientes()
    {//testando três clientes com cpf diferentes.
        Loja loja1 = new Loja(5,3,1,0);
        Cliente cliente1 = new Cliente();
        cliente1.setCpf("333.555.222-11");
        Cliente cliente2 = new Cliente();
        cliente2.setCpf("111.222.333-22");
        Cliente cliente3 = new Cliente();
        cliente3.setCpf("444.555.666-64");
        loja1.cadastrarCliente(cliente1);
        loja1.cadastrarCliente(cliente2);
        loja1.cadastrarCliente(cliente3);

        Cliente[] clientes = loja1.getClientes();
        assertNotNull( clientes[0] );
        assertNotNull( clientes[1] );
        assertNotNull( clientes[2] );
    }
    
    @Test
    public void doisFabricantes()
    {//testando dois fabricantes e testando seu cnpj.
        Loja loja1 = new Loja(5,3,1,2);
        Fabricante fabricante1 = new Fabricante();
        fabricante1.setCnpj("111.1111.1111-11");
        Fabricante fabricante2 = new Fabricante();
        fabricante2.setCnpj("2222.222.2222-12");
        loja1.cadastrarFabricante(fabricante1);
        loja1.cadastrarFabricante(fabricante2);
        
        Fabricante[] fabricantes = loja1.getFabricantes();
        assertNotNull( fabricantes[0] );
        assertNotNull( fabricantes[1] );

    }
    
    @Test
    public void TresFuncionario()
    {//Testando o Cpf do funcionario. 
        Loja loja1 = new Loja(5,3,3,2);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setCpf("222.333.222-12");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setCpf("231.222.333-33");
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setCpf("122.444.333-73");
        loja1.cadastrarFuncionario(funcionario1);
        loja1.cadastrarFuncionario(funcionario2);
        loja1.cadastrarFuncionario(funcionario3);
        
        Funcionario[] funcionarios = loja1.getFuncionarios();
        assertNotNull( funcionarios[0] );
        assertNotNull( funcionarios[1] );
        assertNotNull( funcionarios[2] );
    }
    
    @Test
    public void TesteCompraCliente()
    {//teste para verificar a compra de um cliente.
        Cliente cliente1 = new Cliente();
        Produto produto1 = new Produto();
        Loja loja1 = new Loja(5, 5, 6, 1);
        cliente1.setNome("Manoel Farias");
        cliente1.setEndereco("Rua Beira Rio");
        cliente1.setDataNascimento("25/03/1995");
        cliente1.setCpf("123");
        loja1.cadastrarCliente(cliente1);
        Cliente clienteSalvo1 =(cliente1);
        assertEquals("Manoel Farias", clienteSalvo1.getNome());
        assertEquals("Rua Beira Rio", clienteSalvo1.getEndereco());
        assertEquals("25/03/1995", clienteSalvo1.getDataNascimento());
        assertEquals("123", clienteSalvo1.getCpf());
        loja1.cadastrarProduto(produto1);
        produto1.setNome("Lampada");
        produto1.setPreco(5.60);
        produto1.setMarca("Inst");
        produto1.setFabricante("insas");
        produto1.setCategoria("Luminária");
        produto1.setQuant(50);
        Produto produtoSalvo1 = (produto1);
        assertEquals(50, produtoSalvo1.getQuant());
        assertEquals(5.6, produtoSalvo1.getPreco(), 0.1);
        assertEquals("Lampada", produtoSalvo1.getNome());
        assertEquals("Inst", produtoSalvo1.getMarca());
        assertEquals("Luminária", produtoSalvo1.getCategoria());
        assertEquals("insas", produtoSalvo1.getFabricante());
        assertEquals(28, loja1.FazerCompraCliente(produto1, 5), 0.1);
    }

    @Test
    public void TesteHorárioEIdade()
    {//testando o cadastro de um funcionário e fazendo o teste quanto seu horário e sua idade.
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Paulo Ferreira");
        funcionario1.setRg("111");
        funcionario1.setSexo("feminino");
        funcionario1.setSetorTrabalho("Vendas");
        funcionario1.setIdade(23);
        Loja loja1 = new Loja(1, 1, 1, 1);
        loja1.cadastrarFuncionario(funcionario1);
        funcionario1.setCargo("Vendedor");
        funcionario1.setEndereco("Rua Epitácio");
        assertEquals("Horário Diurno", loja1.defineHorario(funcionario1));
        assertEquals("Parabéns Contratado!!!", loja1.validaIdadeFuncionario(funcionario1));
    }

    @Test
    public void ReportarAlvaria()
    {//testando Alvaria para um produto. 
        Loja loja1 = new Loja(5, 4, 3, 1);
        Produto produto1 = new Produto();
        produto1.setNome("Caixa de Ar Condicionado");
        produto1.setQuant(100);
        produto1.setPreco(25);
        produto1.setCategoria("Casa");
        produto1.setMarca("Inst");
        produto1.setFabricante("insas");
        produto1.setCategoria("Luminária");
        Produto produtoSalvo2 = (produto1);
        assertEquals(100, produtoSalvo2.getQuant());
        assertEquals(25, produtoSalvo2.getPreco(), 0.1);
        assertEquals("Caixa de Ar Condicionado", produtoSalvo2.getNome());
        assertEquals("Inst", produtoSalvo2.getMarca());
        assertEquals("Luminária", produtoSalvo2.getCategoria());
        assertEquals("insas", produtoSalvo2.getFabricante());
        assertEquals(10, loja1.ReportarAlvaria(produto1, 10));
    }
    

    @Test
    public void ReportarMaisAlvaria()
    {//testanto o cadastro de Alvaria para três produtos diferentes.
        Loja loja1 = new Loja(5, 0, 0, 0);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        loja1.cadastrarProduto(produto1);
        loja1.cadastrarProduto(produto2);
        loja1.cadastrarProduto(produto3);
        assertEquals(10, loja1.ReportarAlvaria(produto1, 10));
        assertEquals(8, loja1.ReportarAlvaria(produto2, 8));
        assertEquals(12, loja1.ReportarAlvaria(produto3, 12));
    }
}