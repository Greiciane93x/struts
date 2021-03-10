public class RemoveContatoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		RemoveContatoForm formulario = ((RemoveContatoForm) form);

		Contato contato = formulario.getContato();

		ContatoDAO dao = new ContatoDAO();
		dao.remove(contato);
		return mapping.findForward("ok");
	}
}