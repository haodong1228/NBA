
function querybar1(){
    $.ajax({
        url:"radarplay.html",
        data:$("#form1").serialize(),
        dataType:'json',
         type:'post',
         async:true,
         success:function(datas){
         	$("#checkplayertable1").html("");
         	
         	for(var i=0;i<datas.length;i++){
         		 var tr = '<tr style="margin-left:20px;">'
         	            +'<td value="'+datas[i].playerId+'" id="-a'+datas[i].playerId+'" class="btn-sm violetBtn" onclick="checkedPlayer1(this)">'
         	            + datas[i].name+'</td></tr>';
         		 $("#checkplayertable1").append(tr);
         	}
         }
     });
}

function querybar2(){
    $.ajax({
        url:"radarplay.html",
        data:$("#form2").serialize(),
        dataType:'json',
         type:'post',
         async:true,
         success:function(datas){
         	$("#checkplayertable2").html("");
         	
         	for(var i=0;i<datas.length;i++){
         		 var tr = '<tr style="margin-left:20px;">'
         	            +'<td value="'+datas[i].playerId+'" id="-b'+datas[i].playerId+'" class="btn-sm violetBtn" onclick="checkedPlayer2(this)">'
         	            + datas[i].name+'</td></tr>';
         		 $("#checkplayertable2").append(tr);
         	}
         }
     });
}

function checkedPlayer1(obj){
	
	var id = obj.id.substring(2);
	var player2id = $("#player2").val();
	if(id == player2id){
		alert("请选择不同的球员");
		return;
	}
	$("#player1").val(id);
	if($("#-a"+id).attr("class") == "btn-sm violetBtn"){
		$("#checkplayertable1").find("td").attr("class","btn-sm violetBtn");
		$("#-a"+id).attr("class","btn-sm violetBtn btn-success");
		finddetail(id);
	}else{
		$("#-a"+id).attr("class","btn-sm violetBtn");
	}
	
}



function checkedPlayer2(obj){
	
	var id = obj.id.substring(2);
	var player2id = $("#player1").val();
	if(id == player2id){
		alert("请选择不同的球员");
		return;
	}
	$("#player2").val(id);
	if($("#-b"+id).attr("class") == "btn-sm violetBtn"){
		$("#checkplayertable2").find("td").attr("class","btn-sm violetBtn");
		$("#-b"+id).attr("class","btn-sm violetBtn btn-success");
		finddetail(id);
	}else{
		$("#-b"+id).attr("class","btn-sm violetBtn");
	}
	
}

function finddetail(id){
	 
	 $.ajax({
	       url:"getPlayerByIds.html",
	       data:$("#queryradarForm").serialize(),
	       dataType:'json',
	        type:'post',
	        async:true,
	        success:function(data){
	        	
	        	var name1 = replace(data[0].name);
	        	var score1 = replace(data[0].score);
	        	var fs1 = replace(data[0].blockShot);
	        	var zz1 = replace(data[0].remark1);
	        	var wx1 = replace(data[0].threeHitRate);
	        	var nx1 = replace(data[0].psHitRate);
	        	var zh1 = replace(data[0].remark2);
	        	
	        	var name2 = replace(data[1].name);
	        	var score2 = replace(data[1].score);
	        	var fs2 = replace(data[1].blockShot);
	        	var zz2 = replace(data[1].remark1);
	        	var wx2 = replace(data[1].threeHitRate);
	        	var nx2 = replace(data[1].psHitRate);
	        	var zh2 = replace(data[1].remark2);
	        	
	        	//alert(wx1+":"+nx1);
	        	//在echartsExample.js中定义myChart
	        	var title = {
	        		    title : {
	        		        text: name1 +"/"+ name2,
	        		        subtext: '网络数据'
	        		    },
	        		    tooltip : {
	        		        trigger: 'axis'
	        		    },
	        		    legend: {
	        		        data:[name1,name2]
	        		    },
	        		    toolbox: {
	        		        show : true,
	        		        feature : {
	        		            mark : {show: true},
	        		            dataView : {show: true, readOnly: false},
	        		            magicType : {show: true, type: ['line', 'bar']},
	        		            restore : {show: true},
	        		            saveAsImage : {show: true}
	        		        }
	        		    },
	        		    calculable : true,
	        		    xAxis : [
	        		        {
	        		            type : 'category',
	        		            data : ['得分','防守','组织','外线','内线','综合']
	        		        }
	        		    ],
	        		    yAxis : [
	        		        {
	        		            type : 'value'
	        		        }
	        		    ],
	        		    series : [
	        		        {
	        		            name:name1,
	        		            type:'bar',
	        		            data:[score1, fs1, zz1, wx1, nx1, zh1],
	        		           
	        		        },
	        		        {
	        		            name:name2,
	        		            type:'bar',
	        		            data:[score2, fs2, zz2, wx2, nx2, zh2],
	        		            
	        		        }
	        		        
	        		    ]
	        		};
	        	myChart.setOption(title);
	        	
	        }
	    });
	
}

function replace(str){
	if(str==null){
		return "";
	}
	return str;
}