import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientes;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Gerente> gerentes;
    

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.gerentes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    
    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void adicionar(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void adicionar(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    
    public void adicionar(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }
    
    public void adicionar(Gerente gerente) {
        this.gerentes.add(gerente);
    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados:");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        }
        else {
            for (Cliente c : this.clientes) {
                System.out.println(c);
            }
        }
    }
    
    public void listarVeiculos() {
        System.out.println("Veículos cadastrados:");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo cadastrado");
        }
        else {
            for (Veiculo v : this.veiculos) {
                System.out.println(v);
            }
        }
    }
    
    public void listarVendedores() {
        System.out.println("Vendedores cadastrados:");

        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado");
        }
        else {
            for (Vendedor v : this.vendedores) {
                System.out.println(v);
            }
        }
    }
    
    public void listarGerentes() {
        System.out.println("Gerentes cadastrados:");

        if (gerentes.isEmpty()) {
            System.out.println("Nenhum gerente cadastrado");
        }
        else {
            for (Gerente g : this.gerentes) {
                System.out.println(g);
            }
        }
    }

    public Cliente localizarCliente(String cpf) {
        for (Cliente c : this.clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }   
    
    public Gerente localizarGerente(String cpf) {
        for (Gerente g : this.gerentes) {
            if (g.getCpf().equals(cpf)) {
                return g;
            }
        }
        return null;
    }
    
    public Vendedor localizarVendedor(String cpf) {
        for (Vendedor v : this.vendedores) {
            if (v.getCpf().equals(cpf)) {
                return v;
            }
        }
        return null;
    }
    
    public void atribuirVendaVendedor(Venda venda, Vendedor vendedor) {
        vendedor.addVenda(venda);
    }
    
    // Relatório mensal
    public void relatorio(int mes, int ano) {
        System.out.println("*** RELATÓRIO DE VENDAS MENSAL DE " + mes + "/" + ano + " ***");
        double total = 0;
        
        for (Vendedor v: vendedores) {
            for (Venda venda : v.getVendidos()) {
                if (venda.getData().getAno() == ano && venda.getData().getMes() == mes) {
                    System.out.println("Vendedor: " + v.getNome() + " (Salário "
                            + "neste mês: R$" + v.getSalario(mes, ano) + ")");
                    System.out.println(venda);
                    System.out.println("***************************************");
                    total = total + (venda.valor());
                }
            }
        }
        System.out.println("Total: R$ " + total);
    }
    
    // Relatório anual
    public void relatorio(int ano) {
        System.out.println("*** RELATÓRIO DE VENDAS ANUAL DE " + ano + " ***");
        double total = 0;
        
        for (Vendedor v: vendedores) {
            for (Venda venda: v.getVendidos()) {
                if(venda.getData().getAno() == ano) {
                    System.out.println("Vendedor: " + v.getNome());
                    System.out.println(venda);
                    System.out.println("***************************************");
                    total = total + (venda.valor());
                }
            }
        }
        System.out.println("Total: R$ " + total);
    }
    
    // Relatório por vendedor
    public void relatorio(Vendedor vendedor) {
        System.out.println("*** RELATÓRIO DE VENDAS DO VENDEDOR ***");
        System.out.println("Vendas do vendedor " + vendedor.getNome() + " :");
        double total = 0;
        
        for (Venda venda: vendedor.getVendidos()) {
            System.out.println(venda);
            System.out.println("***************************************");
            total = total + (venda.valor());
        }
        
        System.out.println("Total: R$" + total);
    }
    
    // Listar turmas (Não entendi muito bem)
    // public void listarTurmas() {
    //}
}


