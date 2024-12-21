public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Adan Leonardo");
        aluno.setIdade(17);
        aluno.setMatricula("123456789");
        
        Cliente cliente = new Cliente();
        cliente.setendereco( "RUA JOÃO VITAL GUEDES");
        cliente.setNome("joão");

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setcnpj("08.993.917/0001-46.");
        fornecedor.setNome("tilibra");

        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setcargo("cordenador");
        funcionarios.setNome("ronaldo");

        Professor professor = new Professor();
        professor.setdisciplina("POO");
        professor.setNome("CLAYTON");

        System.out.println("\n nome fornecedor: " + fornecedor.getNome());
        System.out.println("cnpj fornecedor: " + fornecedor.getcnpj());

        System.out.println("\n nome professor: " + professor.getNome());
        System.out.println("disciplina professor: " + professor.getdisciplina());

        System.out.println("\n nome funcionario: " + funcionarios.getNome());
        System.out.println("cargo funcionario: " + funcionarios.getcargo());

        System.out.println("\n nome do cliente : " + cliente.getNome());
        System.out.println("endereco cliente: " + cliente.getendereco());

        System.out.println("\n Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
}
}