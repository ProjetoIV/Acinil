package br.com.acinil.dao;


public class PadraoTeste {
    @Ignore
    @Test
    public void salvar(){
        Carfo cargo = new cargo();
        cargo.setnm_cargo("Rio Grande do Sul");
        cargo.setdescricao("RS");

        estadoDAO estadoDAO = new estadoDAO();
        estadoDAO.salvar(estado);
    }

    @Ignore
    @Test
    public void listar(){
        EstadoDAO estadoDAO = new EstadoDAO();
        List<Estado> resultado = estado.listar();

        System.out.println("Total de Registros Encontrados: " + resultado.size());

        for(Estado estado : resultado){
            System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
        }
    }


    @Ignore
    @Test
    public void buscar (){
        long codigo = 1L;

        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.buscar(codigo);

        if(estado==null){
                System.out.println("Nenhum registro encontrado");
        }else{
            System.out.println("Registro encontrado:");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
        }
    }


    @Ignore
    @Test
    public void excluir(){
        long codigo = 1L;

        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = new EstadoDAO.buscar(codigo);

        if(estado == null){
            System.out.println("Nenhum registro encontrado");
        }else{
            estadoDAO.excluir(estado);
			System.out.println("Registro removido:");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
        }
    }


    @Ignore
    @Test
    public void editar({
        long codigo = 10L;
        EstadoDAO estadoDAO = new EstadoDAO.buscar(codigo);

        if(estado == null){
            System.out.println("Nenhum registro encontrado");
        } else{
            System.out.println("Registro editado - Antes:");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
			
			estado.setNome("Santa Catarina");
			estado.setSigla("SC");
			estadoDAO.editar(estado);
			
			System.out.println("Registro editado - Depois:");
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
        }
    })
}