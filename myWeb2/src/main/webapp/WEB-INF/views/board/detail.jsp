<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form method="post" name="frm" id="frm">
			<input type="hidden" name="no" value="${board.no}">
			Title : 
			<br><input name="title" value="${board.title}"><br>
			Contents : 
			<br><textarea rows="4" cols="40" name="contents">${board.contents}</textarea><br>
			Writer : 
			<br><input name="writer" value="${board.writer}" readonly><br>
			Wdate : 
			<br><input name="wdate" value="${board.wdate}" readonly><br>
			replyCnt : 
			<br><input name="replyCnt" value="${board.replyCnt}" readonly><br><br>
			<button type="button" id="btn1" onclick='btnsub("upd")'>수정</button>
			<button type="button" id="btn2" onclick='btnsub("del")'>삭제</button>
		</form>
	</div>
	<br><br>
	<!-- 댓글 등록 -->
	<div>
		<form id="commentFrm">
			<input type="hidden" name="boardNo" value="${board.no}">
			<input name="name">
			<input name="content">
			<button type="button" id="btnComments">댓글등록</button>
		</form>
	</div>
	
	<!-- 댓글 목록 -->
	<div id="commentsList">
	</div>
	<div style="display: none;">
		<div class="row">
			<div class="cname col">홍길동</div>
			<div class="ccontent col">댓글내용</div>
			<div class="cregdate col">날짜</div>
			<div class="col">
				<button type="button " class="btnCommentsUpdate">수정</button>
				<button type="button" class="btnCommentsUpdate">삭제</button>
			</div>
		</div>
	</div>
	
	
<script>
	function btnsub(div) {
		if(div == "upd") {
			frm.action = "../update";
		} else {
			frm.action = "../delete";
		}
		frm.submit();
	}
	
	commentsList();
	commentsInsert();
	commentsUpdate();
	commentsDelete();
	
	function commentsList() {
		$.ajax({
			url:"../../comments/${board.no}",
			dataType:"json"
		}).done(function(datas) {
			for(comment of datas) {
				let str = 
					`<div class="row" data-no="\${comment.no}">
						<div class="cname col">\${comment.name}</div>
						<div class="ccontent col">\${comment.content}</div>
						<div class="cregdate col">\${comment.regdate}</div>
						<div class="col">
					`
				if( comment.name == '11') {
					str += `	<button type="button " class="btnCommentsUpdate">수정</button>
								<button type="button" class="btnCommentsUpdate">삭제</button>
							`
				}
					str += `</div></div>`
				$("#commentsList").append(str)
			}
		});
	}
	
	function commentsInsert() {
		$("#btnComments").on("click", function() {
			/* let name = $('[name="name"]').val();
			let content = $('[name="content"]').val(); */
			$.ajax({
				url:"../../comments",
				method:"post",
				data:$("#commentFrm").serialize(),
				// {name:name, content:content}
				dataType:"json"
			}).done(function(datas){
				console.log("등록");
				$("#commentsList").empty();
				commentsList();
			});
		})
	}
	
	function commentsUpdate() {
			
	}
	
	function commentsDelete() {
		$("btnCommentsUpdate").on("click", function() {
			
		})
	}
	
	
	
</script>
</body>
</html>