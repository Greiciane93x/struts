# Struts 
**struts-config.xml**
Mapea as URLS que os usuários acessam(chamados path). 
*É usado para mapear a navegação da aplicação. 
type é onde são definidas as classes. 
Dentro da tag action colocamos uma tag forward que define o redirecionamento 
com um apelido e caminho path; 
Quando fazemos mapping.findForward("ok"), o apelido ok devolve o action forward. 

**web.xml** 
Define aonde a requisição deve chegar. 
