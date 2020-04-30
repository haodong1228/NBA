
window.onload=function(){
	findPlayerInfos();
}

function findPlayerInfos() {
	$.ajax({
				url : "player/findPlayerInfo",
				data : $("#queryDelpForm").serialize(),
				dataType : 'json',
				type : 'post',
				async : true,
				success : function(datas) {
					
					$("#playerid").val("");
					
					$("#checkplayertable1").html("");

					for (var i = 0; i < datas.length; i++) {
						var tr = '<tr style="margin-left:20px;">'
								+ '<td value="'
								+ datas[i].playerId
								+ '" id="'
								+ datas[i].playerId
								+ '" class="btn-sm violetBtn" onclick="checkedPlayer1(this)">'
								+ datas[i].name + '</td></tr>';
						$("#checkplayertable1").append(tr);
					}
					
				}
			});
}

function buildDevolopPlan(id) {
	
	$("#playerid").val(id);
	
//	alert($("#playerid")   );
	
	$.ajax({
		url : "player/buildDevolopPlan",
		data : {"playerid":id},
		dataType : 'json',
		type : 'post',
		async : true,
		success : function(data) {
			var bmi = data.bmi;
			var psrate = data.psrate;
			var hittate = data.hittate;
			var shootrate = data.shootrate;

			// 标准数据
			var bmibz = 21;
			var psratebz = 70;
			var hittatebz = 30;
			var shootratebz = 30;

			var title = {
				tooltip : {
					trigger : 'axis',
					axisPointer : { // 坐标轴指示器，坐标轴触发有效
						type : 'shadow' // 默认为直线，可选为：'line'
					// | 'shadow'
					}
				},
				legend : {
					data : [ '超出标准数', '标准', '球员信息' ]
				},
				toolbox : {
					show : true,
					feature : {
						mark : {
							show : true
						},
						dataView : {
							show : true,
							readOnly : false
						},
						magicType : {
							show : true,
							type : [ 'line', 'bar' ]
						},
						restore : {
							show : true
						},
						saveAsImage : {
							show : true
						}
					}
				},
				calculable : true,
				xAxis : [ {
					type : 'value'
				} ],
				yAxis : [ {
					type : 'category',
					axisTick : {
						show : false
					},
					data : [ '三分命中率', '投篮命中率', '罚球命中率', '体质指数BMI' ]
				} ],
				series : [
						{
							name : '高于标准数',
							type : 'bar',
							itemStyle : {
								normal : {
									label : {
										show : true,
										position : 'inside'
									}
								}
							},
							data : [ hittate - hittatebz,
									shootrate - shootratebz, psrate - psratebz,
									bmi - bmibz ]
						},
						{
							name : '球员信息',
							type : 'bar',
							stack : '总量',
							barWidth : 5,
							itemStyle : {
								normal : {
									label : {
										show : true
									}
								}
							},
							data : [ hittate, shootrate, psrate, bmi ]
						},
						{
							name : '标准',
							type : 'bar',
							stack : '总量',
							itemStyle : {
								normal : {
									label : {
										show : true,
										position : 'left'
									}
								}
							},
							data : [ -hittatebz, -shootratebz, -psratebz,
									-bmibz ]
						} ]

			};
			myChart.setOption(title);
			
			$("#adviseDesc").html('');
			if ((hittate - hittatebz) < 0) {
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#FF5151;">'+
						'三分命中率偏低，需加强'+
						'</p>'
				);
			}else{
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#96C;">'+
						'三分命中率较好，继续保持'+
						'</p>'
				);
			}
			if ((shootrate - shootratebz) < 0) {
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#FF5151;">'+
						'投篮命中率偏低，需加强'+
						'</p>'
				);
			}else{
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#96C;">'+
						'投篮命中率较好，继续保持'+
						'</p>'
				);
			}
			if ((psrate - psratebz) < 0) {
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#FF5151;">'+
						'罚球命中率偏低，需加强'+
						'</p>'
				);
			}else{
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#96C;">'+
						'罚球命中率较好，继续保持'+
						'</p>'
				);
			}
			if ((bmi - bmibz) < 0) {
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#FF5151;">'+
						'体质指数率偏低，需加强锻炼'+
						'</p>'
				);
			}else{
				$("#adviseDesc").append(
						'<p  class="btn btn-sm btn-success" style="margin:4px;background-color:#96C;">'+
						'体质指数率较好，继续保持'+
						'</p>'
				);
			}

		}
	});

}

function checkedPlayer1(obj) {

	var id = obj.id;

	if ($("#" + id).attr("class") == "btn-sm violetBtn") {
		
		$("#checkplayertable1").find("td").attr("class", "btn-sm violetBtn");
		$("#" + id).attr("class", "btn-sm violetBtn btn-success");
		buildDevolopPlan(id);
		
	} else {
		$("#" + id).attr("class", "btn-sm violetBtn");
	}

};