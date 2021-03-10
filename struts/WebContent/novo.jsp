<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

            <html:html>
                <head>
                    <title>Sistema de Teste do Struts</title>
                </head>

                <html:errors/>

                <html:form action="/novoContato" focus="contato.nome">
                    Nome:
                        <html:text  property="contato.nome"/>
                        <br/>

                    Email: 
                        <html:text  property="contato.email"/>
                        <br/>

                    Endereço: 
                        <html:text  property="contato.endereco"/>
                        <br/>

                        <html:submit>Enviar dados</html:submit>
                    <br/>
                </html:form>
                
                
    			<html:errors property="nome"/>
              
            </html:html>