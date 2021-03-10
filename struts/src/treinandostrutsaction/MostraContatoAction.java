
public class MostraContatoAction {


    MostraContatoForm formulario = (MostraContatoForm) form;
    Contato contato = formulario.getContato();
    Contato encontrado = new ContatoDAO().procura(contato.getId());
    request.setAttribute("contato", encontrado);
    
    
    
    

}
