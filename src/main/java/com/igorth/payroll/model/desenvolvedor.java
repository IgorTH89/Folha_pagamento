package com.igorth.payroll.model

public class desenvolvedor extends funcionario {
    private double salario_fixo;
    private double bonus_project;
    
    public desenvolvedor(String nome, int id, double salario_fixo, double bonus_project) {
        super(nome, id);
        this.salario_fixo = salario_fixo;
        this.bonus_project = bonus_project;
    }

    @Override
    public double calcular_salario(){
        return salario_fixo + bonus_project;
    }


}
