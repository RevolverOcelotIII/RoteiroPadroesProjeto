/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro7.parte1;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Produto> produtos;
    private List<Cliente> clientes;

    public Database() {
        this.produtos = new ArrayList<Produto>();
        this.clientes = new ArrayList<Cliente>();
        this.produtos.add(new Produto(1, "Prod A", 2.9));
        this.produtos.add(new Produto(2, "Prod B", 3.1));
    }

    public Cliente selectCliente(int id) {
        for (Cliente c : this.clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public Produto selectProduto(int id) {
        for (Produto p : this.produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public void addProduto(Produto p) {
        this.produtos.add(p);
    }

    public void processarPagamento(Cliente c, double total) {
        System.out.println("Processando o pagamento : \n " + c);
        System.out.println("Pagamento realizado com sucesso ! Total = " + total);
    }
}
