
public class ContatoForm extends ActionForm {
	
	private Contato contato = new Contato(); 
	public Contato getContato() {
		return this.contato; 
	}
	


    public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {

        ActionErrors erros = new ActionErrors();

        if (contato.getNome() == null || contato.getNome().equals("")) {
            erros.add("nome", new ActionMessage("erro.campoNome"));
        }

        if (contato.getEmail() == null || contato.getEmail().equals("")) {
            erros.add("email", new ActionMessage("erro.campoEmail"));
        }

        if (contato.getEndereco() == null ||
                contato.getEndereco().equals("")) {
            erros.add("endereco", 
                    new ActionMessage("erro.campoEndereco"));
        }

        return erros;
    }

}
