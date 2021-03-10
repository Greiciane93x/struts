package treinandostruts;

import org.apache.struts.action.ActionMapping;

import jakarta.servlet.http.HttpServletRequest;

public class ListaContatosAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		Collection<Contato> lista = new ContadoDAO().getLista(); 
		request.setAttribute("contatos", lista);
		
		if(lista.isEmpty()) {
			return mapping.findForward("vazia"); 
		}else{
			return mapping.findForward("lista)
			
		}
	}
}