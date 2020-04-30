var task;

function getwebinfos() {

	var urlstr;
	var flagVal;
	var checked = $("#spyderSelect").val();
	if (checked == "PCplayer") {
		urlstr = "user/spyderPlayerInfo";
		flagVal = "#PCplayerflag";
	} else if (checked == "PCteam") {
		urlstr = "user/spyderTeamInfo";
		flagVal = "#PCteamflag";
	} else {
		return;
	}

	// 执行定时任务
	task = setInterval(function() {
		$.ajax({
			url : urlstr,
			data : {
				"flag" : $(flagVal).val()
			},
			dataType : 'json',
			type : 'post',
			async : false,
			success : function(data) {
				
				if($(flagVal).val()==0){
					$("#legenddesc").text("正在网页数据获取....");
					$("#memberTbody").html('');
				}
				// 进度
				var nowPro = data.nowProgress;
				$("#nowProgressdesc").text(" "+nowPro+"%");
				$("#nowProgress").attr("style","width:"+nowPro+"%");
				
				// 显示信息标识
				var falg = data.numFalg;
				$(flagVal).val(falg);

				var list = data.messageList;

				for (var i = 0, maxNum = list.length; i < maxNum; i++) {
					var indexLength = list[i].indexOf('-->') == -1 ? '3' : '5'
					$("#memberTbody").append(
							// "<tr><th>" + list[i] + "</th></tr>"
							"<li style='color: #777;padding: 2px 0;text-indent: "
									+ indexLength + "em;'>" + list[i] + "</li>"

					)
					
					$("#member-div").scrollTop($("#member-div").scrollHeight);
					
					if ("完毕" == list[i]) {
						closeTask();
						$("#legenddesc").text("从网页数据获取数据完成");
					}

				}

			}
		});

	}, 1500);
 
}

function closeTask() {
	window.clearInterval(task);
}

// 注意进度条依赖 element 模块，否则无法进行正常渲染和功能性操作
layui.use('element', function() {
	var $ = layui.jquery, element = layui.element; // Tab的切换功能，切换事件监听等，需要依赖element模块

});

layui.use('form', function() {
	var form = layui.form;
	form.render();
});