$(function(){
	//myChart.setOption({title : {text :'sssss' }});
});



function queryradaar(){
    $.ajax({
       url:"radarplay.html",
       data:$("#queryradarForm").serialize(),
       dataType:'json',
        type:'post',
        async:true,
        success:function(datas){
        	$("#checkplayertable1").html("");
        	
        	for(var i=0;i<datas.length;i++){
        		 var tr = '<tr style="margin-left:20px;">'
        	            +'<td value="'+datas[i].playerId+'" id="'+datas[i].playerId+'" class="btn-sm violetBtn" onclick="checkedPlayer1(this)">'
        	            + datas[i].name+'</td></tr>';
        		 $("#checkplayertable1").append(tr);
        	}
        }
    });
}



function checkedPlayer1(obj){
	
	var id = obj.id;
	if($("#"+id).attr("class") == "btn-sm violetBtn"){
		$("#checkplayertable1").find("td").attr("class","btn-sm violetBtn");
		$("#"+id).attr("class","btn-sm violetBtn btn-success");
		finddetail(id);
		
	}else{
		$("#"+id).attr("class","btn-sm violetBtn");
	}
	
};

function finddetail(id){
	$("#playerid").val(id);
	var maxsroce = $("#maxsorce").val();
	
	 $.ajax({
	       url:"getPlayerById.html",
	       data:$("#queryradarForm").serialize(),
	       dataType:'json',
	        type:'post',
	        async:true,
	        success:function(data){
	        	var name1 = data.name;
	        	var d1 = data.defen;
	        	var d2 = data.fangshou;
	        	var d3 = data.zuzhi;
	        	var d4 = data.waixian;
	        	var d5 = data.neixian;
	        	var d6 = data.zonghe;
	        	
	        	var m1 = data.maxdefen;
	        	var m2 = data.maxfangshou;
	        	var m3 = data.maxzuzhi;
	        	var m4 = data.maxwaixian;
	        	var m5 = data.maxneixian;
	        	var m6 = data.maxzonghe;
	        	//alert(m2);
	        	//在echartsExample.js中定义myChart
	        	var title = {
	        		    title : {
	        		        text: name1,
	        		        subtext: '完全实况球员数据'
	        		    },
	        		    tooltip : {
	        		        trigger: 'axis'
	        		    },
	        		    legend: {
	        		        x : 'center',
	        		        data:[d1,d2,d3,d4,d5,d6]
	        		    },
	        		    toolbox: {
	        		        show : true,
	        		        feature : {
	        		            mark : {show: true},
	        		            dataView : {show: true, readOnly: false},
	        		            restore : {show: true},
	        		            saveAsImage : {show: true}
	        		        }
	        		    },
	        		    calculable : true,
	        		    polar : [
	        		        {
	        		            indicator : [
	        		                {text : '得分', max  : parseFloat(m1)},
	        		                {text : '防守', max  : parseFloat(m2)},
	        		                {text : '组织', max  : parseFloat(m3)},
	        		                {text : '外线', max  : parseFloat(m4)},
	        		                {text : '内线', max  : parseFloat(m5)},
	        		                {text : '综合', max  : parseFloat(m6)}
	        		            ],
	        		            radius : 130
	        		        }
	        		    ],
	        		    series : [
	        		        {
	        		            name: '完全实况球员数据',
	        		            type: 'radar',
	        		            itemStyle: {
	        		                normal: {
	        		                    areaStyle: {
	        		                        type: 'default'
	        		                    }
	        		                }
	        		            },
	        		            data : [
	        		                {
	        		                    value : [d1,d2,d3,d4,d5,d6],
	        		                    name : name1
	        		                }
	        		            ]
	        		        }
	        		    ]
	        		};
	        	
	        	myChart.setOption(title);
	        	
	        }
	    });
	
}

function checkedPlayer2(obj){
	
	var id = obj.id;
	
	if($("#"+id).attr("class") == "btn-sm violetBtn"){
		
		$("#checkplayertable2").find("td").attr("class","btn-sm violetBtn");
		$("#"+id).attr("class","btn-sm violetBtn btn-success");
		
	}else{
		$("#"+id).attr("class","btn-sm violetBtn");
	}
	
};