function searchPlayInfo() {

	$.ajax({
		url : "/player/searchMarchingPlayer",
		data : $("#searchMarchingPlayer").serialize(),
		dataType : 'json',
		type : 'post',
		async : false,
		success : function(data) {
			$("#memberTbody").html('');
			var maxNum = data.length;
			for (var i = 0; i < maxNum; i++) {
				var index = i +1;
				$("#memberTbody").append(
						"<tr>" + "<th>" + index + "</th>" + "<th>" + data[i].name
								+ "</th>" + "<th>" + data[i].number + "</th>"
								+ "<th>" + data[i].location + "</th>" + "<th>"
								+ data[i].score + "</th>" + "<th>"
								+ data[i].shootHitRate + "</th>" + "<th>"
								+ data[i].error + "</th>" + "<th>"
								+ data[i].breakRules + "</th>" + "<th>"
								+ data[i].playRound + "</th>" + "<th>"
								+ data[i].blockShot + "</th>" + "<th>"
								+ data[i].backboard + "</th>" + "<th>"
								+ data[i].steals + "</th>" + "<th>"
								+ data[i].height + "</th>" + "<th>"
								+ data[i].weight + "</th>" + "</tr>");
			}

		}
	});

}