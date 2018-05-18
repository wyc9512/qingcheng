<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">

<title>Dashboard Template for Bootstrap</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">
<link href="static/css/dashboard.css" rel="stylesheet">
<style type="text/css">
	img[id]{
		border:3px #f1b10b solid;
	}
	img{
		height:150px;
		width:250px;
		margin:10px;
	}
</style>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">网站后台管理</a>
	</div>
	</nav>

	<div class="container-fluid">
		<div class="col-sm-3 col-md-2 sidebar">
			<!--树形多级菜单-->
			<div id="treeview2" class=""></div>
		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h2 class="sub-header">展示图片：</h2>
					<div class="center-block" style="border:1px #516bee solid;height:350px;width:820px" id="homepic">
<!-- 					<img  src="static/images/qcs1.jpg"  class="img-rounded" > -->
<!-- 					<img  src="static/images/qcs2.jpg"  class="img-rounded" > -->
<!-- 					<img  src="static/images/qcs3.jpg"  class="img-rounded" > -->
<!-- 					<img  src="static/images/qcs4.jpg"  class="img-rounded" > -->
<!-- 					<img  src="static/images/qcs5.jpg"  class="img-rounded" > -->
					</div>
				<!-- onsubmit="return chooseCheck()" -->
				<form enctype="multipart/form-data" id="loadForm" >
					<input id="inp" type="file" name="file" accept="image/*" class="col-md-offset-1"/>
					<br/>
					<input id="change_btn" type="button" class="btn btn-info center-block" style="height:40px;width:90px" value="更换"/>
				</form>
		</div>
	</div>
	
	<script src="static/js/jquery.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/jquery.form.js"></script>

	<script src="static/js/bootstrap-treeview.js"></script>
	<script type="text/javascript">
		var picid = null;
		$(function(){
			$.ajax({
				url:"list",
				type:"get",
				success:function(data){
					$.each(data,function(index,homepic){
							var	img = $("<img/>").addClass("img-rounded").attr("src","static/img/"+homepic.pic).attr("picid",homepic.id);
// 							console.log(img);
							img.appendTo("#homepic");
							img.click(function(){
								$(".img-rounded").removeAttr("id");
								//给当前图片设置id
								$(this).attr("id","ipc");
								picid = $(this).attr("picid");
// 								alert($(this).attr("picid"));
							});
					});
					
				}
			});
		});
		
		$("#change_btn").click(function(){
			var clickItem = null;
			$(".img-rounded").each(function(){
				if($(this).attr("id") != null){
					clickItem++;
				}
			});
			//如果选择的有图片
			if(clickItem == 1){
				$("#loadForm").ajaxSubmit({
					type:'post',
					url:'backstage/fileLoad?picid='+picid,
					success:function(data){
						$("#ipc").attr("src","static/img/"+data);
						//清空file文件
						$("#inp").val("");
						//取消图片的选择
						$(".img-rounded").removeAttr("id");
					}
				});
			}
		});
		
		$(function() {
			var defaultData = [ {
				text : '首頁',
				href : '#parent1',
				tags : [ '0' ]
			}, {
				text : '美景速覽',
				href : 'main1.html',
				tags : [ '0' ]
			}, {
				text : '美麗鄉村',
				href : '#parent3',
				tags : [ '1' ],
				nodes : [ {
					text : '鄉村管理',
					href : '#child1',
					tags : [ '0' ],
				} ]
			}, {
				text : '多彩青城山',
				href : '#parent4',
				tags : [ '6' ],
				nodes : [ {
					text : '度假活動',
					href : '#child1',
					tags : [ '0' ],
				}, {
					text : '美食盛會',
					href : '#child2',
					tags : [ '0' ]
				}, {
					text : '地方名宿',
					href : '#child3',
					tags : [ '0' ]
				}, {
					text : '度假酒店',
					href : '#child4',
					tags : [ '0' ]
				}, {
					text : '交通攻略',
					href : '#child5',
					tags : [ '0' ]
				}, {
					text : '名俗風情',
					href : '#child6',
					tags : [ '0' ]
				} ]
			}, {
				text : '青城養生',
				href : '#parent5',
				tags : [ '4' ],
				nodes : [ {
					text : '養生活動',
					href : '#child1',
					tags : [ '0' ],
				}, {
					text : '養生食品',
					href : '#child2',
					tags : [ '0' ]
				}, {
					text : '康療活動',
					href : '#child3',
					tags : [ '0' ]
				}, {
					text : '康療服務',
					href : '#child4',
					tags : [ '0' ]
				} ]
			}, {
				text : '特產直達',
				href : '#parent6',
				tags : [ '0' ]
			}, {
				text : '青城攻略',
				href : '#parent7',
				tags : [ '0' ]
			} ];

			$('#treeview2').treeview({
				levels : 1,
				data : defaultData
			});
		});
		$(function() {
			$("#treeview2").find("ul li").first().addClass("node-selected");
			if ($("#treeview2").find("ul li").first().hasClass("node-selected")) {
				$("#treeview2").find("ul li").first().css({
					"color" : "#FFFFFF",
					"background-color" : "#428bca"
				});
			}
		});
		
	</script>
</body>

</html>