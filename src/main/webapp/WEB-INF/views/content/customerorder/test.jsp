<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
.tblsomething {
	padding:30px 30px;
	/* border:1px solid black; */
	width:1000px;
	margin-bottom: 50px;
	text-align:center;
	/* float:left; */
}
.tblsomething td{
	width:200px;
	height:150px;
	border:1px solid black;

}

#ordermenu{
	width:400px;
	border:1px solid black;
	float:right;
	
}

#orderbtn{
	border:1px solid black;
	display:block;
	clear:both;
	width:100%;
	height:70px;
}
#paybtn{
	border:1px solid black;
	width:50px;
	display:block;
	width:100%;
	height:70px;
}
#ordertbl{
	width:100%;
	height:665px;
	border:1px solid black;
}
#ordertbl tr th{
	text-align:center;
}
#ordertbl tr{
	border:1px solid black;
	text-align:center;
}
#ordertbl tr td{
	border:1px solid black;

}

</style>

<div style="display: inline-block; margin: 50px 80px;">
<table class="tblsomething" >
	<tr>
		<td>테이블 1</td>
		<td>테이블 2</td>
		<td>테이블 3</td>
		<td>테이블 4</td>
		<td>테이블 5</td>
	</tr>
	<tr>
		<td>테이블 6</td>
		<td>테이블 7</td>
		<td>테이블 8</td>
		<td>테이블 9</td>
		<td>테이블 10</td>
	</tr>
</table>

<table class="tblsomething">
	<tr >
		<td>테이블 11</td>
		<td>테이블 12</td>
		<td>테이블 13</td>
		<td>테이블 14</td>
		<td>테이블 15</td>
	</tr>
	<tr>
		<td>테이블 16</td>
		<td>테이블 17</td>
		<td>테이블 18</td>
		<td>테이블 19</td>
		<td>테이블 20</td>
	</tr>
</table>
</div>

<div id="ordermenu">
	<table id="ordertbl">
		<tr>
			<th colspan="2" style="text-align:center">테이블 번호</th>
		</tr>
		<tr>
			<td>아메리카노 ice</td>
			<td>1</td>
		</tr>
		<tr>
			<td>카페라떼 ice</td>
			<td>1</td>
		</tr>
		<tr>
			<td>버블티</td>
			<td>1</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td style="font-weight:bold">총 합계</td>
			<td style="font-weight:bold">12800원</td>
		</tr>
	</table>
	<input type="button" value="주문 추가" id="orderbtn">
	<input type="button" value="결제" id="paybtn">
</div>
