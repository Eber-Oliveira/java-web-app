<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<c:import url="/common/header.jsp" />

<body>
	<div class="container-fluid">
		<c:import url="/common/titulo.jsp" />
		<div class="row">
			
			<c:import url="/common/side-bar.jsp"/>
		
			<div class="col-9">
				<div class = "container">
					<div class = "row">
						<div class = "col-12">
							<h3>Página Principal</h3>
						</div>
					</div>
					<p>Tela de Boas Vindas</p>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/common/footer.jsp" />
</body>
</html>