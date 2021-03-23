# Struts 
**struts-config.xml**<br/> 
>>Mapea as URLS que os usuários acessam(chamados path). <br/> 
*É usado para mapear a navegação da aplicação. <br/> 
>>__type__ é onde são definidas as classes. <br/> 
>>Dentro da tag __action__ colocamos uma tag forward que define o <br/> 
redirecionamento com um apelido e caminho path; <br/> 
>>Quando fazemos mapping.findForward("ok"), o apelido ok devolve o action forward. <br/> 

**web.xml** <br/> 
>>Define aonde a requisição deve chegar. 

**validation-rules.xml** <br/> 
>>É onde conseguimos definir os campos obrigatórios, no nível de layout de campo e página,<br/> 
>>mas pode haver cenários complexos em que a regra de negócios precisa de vários <br/> 
>>campos para verificar a qualidade dos dados. <br/> 
>**formula**: avalida a regra de negócio. Se for avaliada como true, um erro de validação<br/> 
> gerado, caso contrário, é considerado sucesso de validação. <br/>
>**error message**: mensagem de erro a ser exibida na falha de validação <br/>
>**location**: permite que o administrador / desenvolvedor defina a localização <br/> 
>para exibir o erro de validação. 
