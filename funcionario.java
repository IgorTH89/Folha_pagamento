public abstract class funcionario {
    private String nome;
    private int id;
    
    public funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract double calcular_salario();

    public void exibir_infos(){
        System.out.println("Nome: " + nome + ", Matricula: " + id);
    }

}
