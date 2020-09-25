<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/erpos/resources/css/stock.css">
<body>
	<div class="container">

		<!-- Modal -->
		<div id="stock_content">
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Order Product</h4>
						</div>
						
						<form method="POST" action="/spring/order.action">
						<div class="modal-body">
							<h3 id="modal_title">Order</h3>
							<ul>
								<li id="order_name"></li>
								<li>order date: <input type="text" name="orderdate" value="${now}" required></li>
								<li>order amount: <input id="qty" name="qty" type="text" style="outline: none; text-align: right;" required><span id="order_qty"></span></li>
								<input id="seq" type="hidden" name="stock_seq">
							</ul>


						</div>
						<div class="modal-footer">
							<button type="submit" class="btn btn-primary">Order</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
						</form>
					</div>
				</div>
			</div>

			<h1 id="title">Stock Manage</h1>

			<div id="main">
				<select id="category" class="form-control">
					<option value="1" selected disabled hudden>select stock
						category</option>
					<option value="2">total</option>
					<option value="3">powder</option>
					<option value="4">syrub</option>
					<option value="5">bakery</option>
					<option value="6">fruit</option>
				</select>
				<table class="table table-bordered">
					<tr>
						<th>num.</th>
						<th>name</th>
						<th>stock</th>
						<th>unit</th>
						<th>etc.</th>
					</tr>
					
					<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td data-toggle="modal" data-target="#myModal">${dto.name}</td>
						<td>${dto.qty}</td>
						<td>${dto.unit}</td>
						<td></td>
					</tr>
					</c:forEach>

				</table>


			</div>
		</div>
	</div>

	
	<script>
		$("tr > td:nth-child(2)").click(function(event){
			//alert($(event.target).text());
			//alert($("#order_name").text())
			
			//alert($(event.target).prev().text());
			$("#seq").val($(event.target).prev().text());
			$("#order_name").text("order name: " + $(event.target).text());
			$("#order_qty").text($(event.target).next().next().text());
			
			
		});
	</script>