package com.company;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua vendedor");
        endereco.setBairro("Bairro do vendedor");
        endereco.setComplemento("Complemento do vendedor");


        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua Operador");
        endereco2.setBairro("Bairro do Operador");
        endereco2.setComplemento("Complemento do Operador");

        Endereco endereco3 = new Endereco();
        endereco3.setRua("Rua Gerente");
        endereco3.setBairro("Bairro do Gerente");
        endereco3.setComplemento("Complemento do Gerente");


        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Mário Bueno");
        vendedor.setDocumento("123456789");
        vendedor.setEndereco(endereco);
        vendedor.setValorSalario(1000d);
        vendedor.calculaBonificacao(20.0);
        System.out.println(vendedor);
        System.out.println("____________________________________________________");

        OperadorCaixa operadorCaixa = new OperadorCaixa("Felipe", "123456", 2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("____________________________________________________");

        Gerente gerente = new Gerente();
        gerente.setNome("Luciano");
        gerente.setDocumento("78945625");
        gerente.setEndereco(String.valueOf(endereco3));
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        System.out.println(gerente);
        System.out.println("____________________________________________________");


    }


}
