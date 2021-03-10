<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <html> 
                       
<!DOCTYPE html>
<html>

	<c:forEach var="contato" items="${contatos}">
		${contatos.id} - ${contatos.nome} <br/> 
		(<a href="removeContato.do?contato.id=${contato.id}">remover</a>)<br/>
        (<a href="mostraContato.do?contato.id=${contato.id}">mostrar</a>)<br/>
	</c:forEach>
</html>