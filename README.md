# Struts 
**struts-config.xml**<br/> 
Mapea as URLS que os usuários acessam(chamados path). <br/> 
*É usado para mapear a navegação da aplicação. <br/> 
type é onde são definidas as classes. <br/> 
Dentro da tag action colocamos uma tag forward que define o redirecionamento 
com um apelido e caminho path; <br/> 
Quando fazemos mapping.findForward("ok"), o apelido ok devolve o action forward. <br/> 

**web.xml** <br/> 
Define aonde a requisição deve chegar. 
