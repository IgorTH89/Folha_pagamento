package com.igorth.payroll.app

import java.util.ArrayList;
import java.util.List;

public class salarios_empresa {
    public static void main(String[] args) {
        gerente g1 = new gerente("Fulano", 01, 8000.00, 2500.00);
        desenvolvedor d1 = new desenvolvedor("Sicrano", 02, 10000.00, 5000.00);
        estagiario e1 = new estagiario("Beltrano", 03, 1500.00);

        List<funcionario> folha_pagamento = new ArrayList<>();
        folha_pagamento.add(g1);
        folha_pagamento.add(d1);
        folha_pagamento.add(e1);

        System.out.println("--- Folha de pagamento mensal ---");


        for(funcionario f : folha_pagamento){
            f.exibir_infos();
            
            double salario = f.calcular_salario();
        
            System.out.printf("Salário Calculado: R$ %.2f%n", salario);
            System.out.println("-----------------------------------");
        }

        


    }
}
