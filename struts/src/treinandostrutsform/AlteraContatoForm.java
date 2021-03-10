
public class AlteraContatoForm {


    AlteraContatoForm formulario = (AlteraContatoForm) form;
    Contato contato = formulario.getContato();

    new ContatoDAO().altera(contato);
}
