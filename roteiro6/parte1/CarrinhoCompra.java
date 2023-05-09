/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private List<Produto> produtos;

    public CarrinhoCompra() {
        this.produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto p) {
        this.produtos.add(p);
    }

    public double getTotalCompra() {
        double soma = 0;
        for (Produto p : this.produtos) {
            soma = soma + p.getPreco();
        }
        return soma;
    }

    @Override
    public String toString() {
        String result = "";
        for (Produto p : this.produtos) {
            result = result + p.toString();
        }
        return result;
    }
}
