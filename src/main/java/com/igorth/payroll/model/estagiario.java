package com.igorth.payroll.model

public class estagiario extends funcionario {
    private double bolsa_estudos;

    public estagiario(String nome, int id, double bolsa_estudos) {
        super(nome, id);
        this.bolsa_estudos = bolsa_estudos;
    }

    @Override
    public double  calcular_salario(){
        return bolsa_estudos;
    }
}
