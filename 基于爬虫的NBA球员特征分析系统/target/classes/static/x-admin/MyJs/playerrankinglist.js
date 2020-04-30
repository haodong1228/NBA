$(function(){
	queryPlayerRFY();
});

/*****S 分页查询相关方法**********/
function queryPlayerRFY(tiaojian){
	
    $.ajax({
       url:"player/getplayers.html",
       data:$("#queryPKLForm").serialize(),
       dataType:'json',
        type:'post',
        async:true,
        success:showUsersTable
    });
}

/*****E 分页查询相关方法**********/


function updatePlayerR(id){
	var url = 'playerR/updatePlayerR.html?playerRId='+id;
	//x_admin_show('修改球员信息',url,600,400);
	//x_admin_show('添加用户','./user-add.html',600,400)
}
/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showUsersTable(pageInfo){
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var playerRs = pageInfo.list;
    $("#memberTbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = playerRs.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr>"
            +'<td>'+index+'</td>'
            //+'<td>'+replaceNull(playerRs[i].playerRId)+'</td>'
            +'<td>'+replaceNull(playerRs[i].name)+'</td>'
            /*+'<td>'+replaceNull(playerRs[i].team.teamName)+'</td>'*/
            +'<td>'+replaceNull(playerRs[i].score)+'</td>'
            +'<td>'+replaceNull(playerRs[i].backboard)+'</td>'
            +'<td>'+replaceNull(playerRs[i].steals)+'</td>'
            +'<td>'+replaceNull(playerRs[i].blockShot)+'</td>'
            +'<td>'+replaceNull(playerRs[i].error)+'</td>'
            +'<td>'+replaceNull(playerRs[i].shootHitRate)+'</td>'   
            +'<td>'+replaceNull(playerRs[i].threeHitRate)+'</td>'
            +'<td>'+replaceNull(playerRs[i].psHitRate)+'</td>'
            +'<td>'+replaceNull(playerRs[i].playRound)+'</td>'
            +'<td>'+replaceNull(playerRs[i].time)+'</td>'
            +'<td>'
            +'<a href=javascript:void(0) title="" onclick="updatePlayerR(\''+playerRs[i].playerRId+'\')"><i class="layui-icon">&#xe642;</i></a>'
           
            +'</td></tr>'
        $("#memberTbody").append(tr);
    }

    //开启分页组件
    playerRsPage(total,pageNum,pageSize);
}

/**
 * layui的分页插件
 * @param total 总数
 * @param pageNum   当前页
 * @param pageSize  页大小
 */
function playerRsPage(total,pageNum,pageSize){
    //使用layui的分页插件
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,layer = layui.layer;

        //执行一个laypage实例
        laypage.render({
            elem: 'pageDiv', //注意，这里的 test1 是 ID，不用加 # 号
            count: total, //数据总数，从服务端得到
            limit:pageSize,//每页显示的条数。laypage将会借助 count 和 limit 计算出分页数。
            curr:pageNum,//当前页号
            limits:[6,10,15,20],
            layout:['limit','prev', 'page', 'next','skip','count'],//显示哪些分页组件
            jump: function(obj, first){//点击页号的时候执行的函数
                //obj包含了当前分页的所有参数，比如：
                // console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                // console.log(obj.limit); //得到每页显示的条数

                $("[name='pageNum']").val(obj.curr);//向隐藏域设置当前页的值
                $("[name='pageSize']").val(obj.limit);//向隐藏域设置当前页的大小
                if(!first){//首次不执行(点击的时候才执行)
                	queryPlayerRFY();//执行查询分页函数(这个函数必须写在这里)
                }
            }

        });
    });
}


function changeColor(obj){
		var id = obj.id;
		var classValue = $("#"+id).attr("class");
		
		$("#tiaojian").val(id);
		//alert($("#tiaojian").val());
		queryPlayerRFY();
		
		$("#defen").attr("class","layui-btn layui-btn-normal");
		$("#toulan").attr("class","layui-btn layui-btn-normal");
		$("#sanfen").attr("class","layui-btn layui-btn-normal");
		$("#faqiu").attr("class","layui-btn layui-btn-normal");
		$("#lanban").attr("class","layui-btn layui-btn-normal");
		$("#shiwu").attr("class","layui-btn layui-btn-normal");
		$("#gaimao").attr("class","layui-btn layui-btn-normal");
		$("#qiangduan").attr("class","layui-btn layui-btn-normal");
		
		if(classValue == "layui-btn layui-btn-normal"){
			$("#"+id).attr("class","layui-btn layui-btn-danger");	
		}else{
			$("#"+id).attr("class","layui-btn layui-btn-normal");
		}
		
		
	};