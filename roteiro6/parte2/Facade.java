/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte2;

public class Facade {

    private Database db;
    private Cliente cliente;
    private Produto produto;
    private CarrinhoCompra carrinho;

    public Facade() {
        this.db = new Database();
    }

    public void registrarCliente(String nome, int id) {
        this.cliente = new Cliente(id, nome);
        this.carrinho = new CarrinhoCompra();
        this.cliente.setCarrinho(this.carrinho);
        this.db.addCliente(this.cliente);
    }

    public void comprar(int productID, int clientID) {
        this.cliente = db.selectCliente(clientID);
        this.produto = db.selectProduto(productID);
        this.cliente.getCarrinho().addProduto(this.produto);
    }

    public void finalizarCompra(int clientID) {
        this.cliente = db.selectCliente(clientID);
        double total = this.cliente.getCarrinho().getTotalCompra();
        db.processarPagamento(cliente, total);
    }
}
