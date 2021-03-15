# Struts 
**struts-config.xml**<br/> 
>>Mapea as URLS que os usuários acessam(chamados path). <br/> 
*É usado para mapear a navegação da aplicação. <br/> 
>>__type__ é onde são definidas as classes. <br/> 
>>Dentro da tag __action__ colocamos uma tag forward que define o <br/> 
redirecionamento com um apelido e caminho path; <br/> 
>>Quando fazemos mapping.findForward("ok"), o apelido ok devolve o action forward. <br/> 

**web.xml** <br/> 
Define aonde a requisição deve chegar. 
