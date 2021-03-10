
public class AdicionaContatoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		ContatoForm formulario = (ContatoForm) form;

		Contato contato = formulario.getContato();

		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);

		return mapping.findForward("ok");
	}
}