/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro6.parte3;


/**
 *
 * @author aluno
 */
public class TesteComFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.registrarCliente("Jose", 222);
        facade.comprar(1, 222);
        facade.comprar(2, 222);
        facade.finalizarCompra(222);
    }
}
