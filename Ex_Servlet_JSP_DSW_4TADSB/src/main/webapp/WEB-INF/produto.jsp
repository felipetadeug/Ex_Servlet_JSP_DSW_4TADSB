<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Lista de Produtos - Ex. JSP / Servletpq</title>
    </head>
    <body>       
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-md-12">
                    <c:forEach items="${listaProdutos}" var="p">
                        <div class="col-xs-12 col-md-4 panel panel-info">
                            <p><c:out value="${p.id}"></c:out></p>
                            <p><c:out value="${p.nome}"></c:out></p>
                            <p><c:out value="${p.descricao}"></c:out></p>
                            <p><c:out value="${p.preco}"></c:out></p>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/Content/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
