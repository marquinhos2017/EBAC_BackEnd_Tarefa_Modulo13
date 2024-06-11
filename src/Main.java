public class Main {
    public static void main(String[] args) {
        // Criando um objeto de PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica("João Silva", "Rua das Flores, 123", "11987654321", "123.456.789-00");
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Endereço: " + pessoaFisica.getEndereco());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("CPF: " + pessoaFisica.getCpf());

        // Criando um objeto de PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Avenida Central, 456", "1133345566", "12.345.678/0001-99");
        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Endereço: " + pessoaJuridica.getEndereco());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    }
}
