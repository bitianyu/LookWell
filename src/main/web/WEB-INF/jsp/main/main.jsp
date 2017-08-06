<%--
  Created by IntelliJ IDEA.
  User: gys
  Date: 2017/8/4
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%pageContext.setAttribute("APP_PATH", request.getContextPath());%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../basic.jsp"></jsp:include>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ztree/js/jquery.ztree.core.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ztree/js/jquery.ztree.excheck.min.js"></script>
    <script type="text/javascript">
        var zTree;
        var setting = {
            view: {
                dblClickExpand: false,//双击节点时，是否自动展开父节点的标识
                showLine: true,//是否显示节点之间的连线
                fontCss:{'color':'black','font-weight':'bold'},//字体样式函数
                selectedMulti: false //设置是否允许同时选中多个节点
            },
            check:{
                //chkboxType: { "Y": "ps", "N": "ps" },
                chkStyle: "checkbox",//复选框类型
                enable: true //每个节点上是否显示 CheckBox
            },
            data: {
                simpleData: {//简单数据模式
                    enable:true,
                    idKey: "menuId",
                    pIdKey: "parentId",
                    menu_name: "menuName",
                    rootPId: ""
                }
            },
            callback: {
                beforeClick: function(treeId, treeNode) {
                    zTree = $.fn.zTree.getZTreeObj("user_tree");
                    if (treeNode.isParent) {
                        zTree.expandNode(treeNode);//如果是父节点，则展开该节点
                    }else{
                        zTree.checkNode(treeNode, !treeNode.checked, true, true);//单击勾选，再次单击取消勾选
                    }
                }
            }
        };









        /**
         * 页面初始化
         */
        $(document).ready(function(){
            onLoadZTree();
        });

        /**
         * 加载树形结构数据
         */
        function onLoadZTree(){
            var treeNodes;
            $.ajax({
                async:false,//是否异步
                cache:false,//是否使用缓存
                type:'POST',//请求方式：post
                dataType:'json',//数据传输格式：json
                url:'${pageContext.request.contextPath}/initTree.controller',
                error:function(){
                    //请求失败处理函数
                    alert('亲，请求失败！');
                },
                success:function(data){
                    //console.log(data);
                    //请求成功后处理函数
                    treeNodes = data;//把后台封装好的简单Json格式赋给treeNodes
                    var t = $("#user_tree");
                    t = $.fn.zTree.init(t, setting, treeNodes);
                }
            });

        }
    </script>
</head>
<body>
    <div class="zTreeDemoBackground left">
        <ul id="user_tree" class="ztree" style="border: 1px solid #617775;overflow-y: scroll;height: 500px;"></ul>
    </div>
</body>
</html>
