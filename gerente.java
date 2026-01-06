public class gerente extends funcionario{
    
    private double salario_base;
    private double bonus_performa;

    public gerente(String nome, int id, double salario_base, double bonus_performa) {
        super(nome, id);
        this.salario_base = salario_base;
        this.bonus_performa = bonus_performa;
    }
    
    
    @Override
    public double calcular_salario(){
        return salario_base+bonus_performa;
    }

    
}
