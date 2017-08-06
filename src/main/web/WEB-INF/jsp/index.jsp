<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2017/8/3
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录页面</title>
    <jsp:include page="basic.jsp"></jsp:include>
    <script type="text/javascript">
      $(function () {
          $("#tanchuang").click(function () {
              $("#loginModaljiemian").modal({
                  backdrop:"static"
              })
          })
//<!--                          登录校验模块开始                            -->
          function ele_validate_info(ele,status,msg) {
    //清空样式
              $(ele).parent().removeClass("has-error has-success");
              $(ele).next("span").text("");
    //
              if("error" == status){
                  $(ele).parent().addClass("has-error");
                  $(ele).next("span").text(msg);
              }else{
                  $(ele).parent().addClass("has-success");
                  $(ele).next("span").text(msg);
              }
          }

//          前端校验
          function validate_loginForm() {
//用户名校验
              var username = $("#username").val();
              var nameRegx = /^[a-zA-Z0-9_-]{4,16}$/;
              if(!nameRegx.test(username)){
                  ele_validate_info("#username","error","用户名必须为4-16位字母或数字")
                  return false;
              }else {
                  ele_validate_info("#username","success","用户名格式正确")
              }
//密码校验
              var password = $("#password").val();
              var pwdRegx = /^[a-z0-9_-]{4,16}$/;
              if(!pwdRegx.test(password)){
                  ele_validate_info("#password","error","密码必须为4-16位字母或数字")
                  return false;
              }else{
                  ele_validate_info("#password","success","密码格式正确")
              }

          }
//          单击登录按钮
          $("#loginBtn").click(function(){
              if(validate_loginForm()==false){
                  return false;
              }
              var datas = $("#loginModaljiemian form").serialize();
              $.ajax({
                  url:"${pageContext.request.contextPath}/login.controller",
                  data:datas,
                  type:"post",
                  success:function (result) {

                      if(result.code == 100){
                          window.location.href = '${pageContext.request.contextPath}/toMain.controller';
                      }else {
                          alert(result.extend.msg3);
                      }
                  }
              })
          })

          $("#username").blur(function(){
              $.ajax({
                  url:"${pageContext.request.contextPath}/tbuser/checkTbuser.controller",
                  data:"username="+$("#username").val(),
                  type:"get",
                  success:function(result){
                      if(result.code == 100){
                          ele_validate_info("#username","success","用户名存在");
                      }else {
                          ele_validate_info("#username","error","用户名不存在，请重新输入");
                      }
                  }
              })
          })
//<!--                          登录校验模块结束                            -->
//<!--                          注册校验模块开始                            -->
          $("#addTbuserBtn").click(function () {
              $("#loginModaljiemian").modal('hide');
              $("#addModaljiemian").modal({
                  backdrop:"static"
              })
          })

//<!--                          注册校验模块结束                            -->

          //          前端校验
          function validate_addForm() {
//用户名校验
              var addUsername = $("#addUsername").val();
              var nameRegx = /^[a-zA-Z0-9_-]{4,16}$/;
              if(!nameRegx.test(addUsername)){
                  ele_validate_info("#addUsername","error","用户名必须为4-16位字母或数字")
                  return false;
              }else {
                  ele_validate_info("#addUsername","success","用户名格式正确")
              }
//密码校验
              var addPassword1 = $("#addPassword1").val();
              var pwdRegx = /^[a-z0-9_-]{4,16}$/;
              if(!pwdRegx.test(addPassword1)){
                  ele_validate_info("#addPassword1","error","密码必须为4-16位字母或数字")
                  return false;
              }else{
                  ele_validate_info("#addPassword1","success","密码格式正确")
              }
              var addPassword2 = $("#addPassword2").val();
              if(!pwdRegx.test(addPassword2)){
                  ele_validate_info("#addPassword2","error","密码必须为4-16位字母或数字")
                  return false;
              }else{
                  ele_validate_info("#addPassword2","success","密码格式正确")
              }
              if(addPassword2 != addPassword1){
                  ele_validate_info("#addPassword1","error","");
                  ele_validate_info("#addPassword2","error","");
                  alert("对不起，两次密码不一致");
                  return false;
              }

          }
//          单击保存按钮
          $("#saveUserBtn").click(function(){
              if(validate_addForm()==false){
                  return false;
              }
              $.ajax({
                  url:"${pageContext.request.contextPath}/tbuser/addTbuser.controller",
                  data:{"username":$("#addUsername").val(),"password":$("#addPassword1").val()},
                  type:"post",
                  success:function (result) {

                      if(result.code == 100){
                          alert("success");
                          <%--window.location.href = '${pageContext.request.contextPath}/toMain.controller';--%>
                      }else {
                          if(undefined != result.extend.username){
                              ele_validate_info("#addUsername","error",result.extend.username);
                          }
                          if(undefined != result.extend.password){
                              ele_validate_info("#addPassword1","error",result.extend.password)
                          }
                          if(undefined != result.extend.password){
                              ele_validate_info("#addPassword2","error",result.extend.password)
                          }
                      }
                  }
              })
          })

          $("#addUsername").blur(function(){
              $.ajax({
                  url:"${pageContext.request.contextPath}/tbuser/checkTbuser.controller",
                  data:"username="+$("#addUsername").val(),
                  type:"get",
                  success:function(result){
                      if(result.code == 100){
                          ele_validate_info("#addUsername","error","用户名不可用");
                      }else {
                          ele_validate_info("#addUsername","success","用户名可用");
                      }
                  }
              })
          })
















      })
    </script>
  </head>
  <body>
    <button id="tanchuang">登录</button>
    <div class="modal fade" id="loginModaljiemian" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">登录窗口</h4>
          </div>
          <div class="modal-body">
            <form class="form-horizontal">
              <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名：</label>
                <div class="col-sm-10">
                  <input type="text" name="username" class="form-control" id="username" placeholder="请输入用户名：">
                  <span class="help-block"></span>
                </div>
              </div>
              <div class="form-group">
                <label for="password" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-10">
                  <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码：">
                  <span class="help-block"></span>
                </div>
              </div>
              <div class="col-sm-6">
                <button type="button" class="btn btn-primary col-sm-offset-6" id="loginBtn">登&nbsp&nbsp&nbsp录</button>
              </div>
              <div class="col-sm-6">
                <button type="button" class="btn btn-primary col-sm-offset-1" id="addTbuserBtn">注&nbsp&nbsp&nbsp册</button>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
    </div>

    <div class="modal fade" id="addModaljiemian" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myAddModalLabel">注册窗口</h4>
          </div>
          <div class="modal-body">
            <form class="form-horizontal">
              <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名：</label>
                <div class="col-sm-10">
                  <input type="text" name="username" class="form-control" id="addUsername" placeholder="请输入用户名：">
                  <span class="help-block"></span>
                </div>
              </div>
              <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码：</label>
                <div class="col-sm-10">
                  <input type="password" name="password" class="form-control" id="addPassword1" placeholder="请输入密码：">
                  <span class="help-block"></span>
                </div>
              </div>
              <div class="form-group">
                <label for="password" class="col-sm-2 control-label">确认密码：</label>
                <div class="col-sm-10">
                  <input type="password" name="password" class="form-control" id="addPassword2" placeholder="请输入密码：">
                  <span class="help-block"></span>
                </div>
              </div>
              <div class="col-sm-6">
                <button type="button" class="btn btn-primary col-sm-offset-6" id="saveUserBtn">保&nbsp&nbsp&nbsp存</button>
              </div>
              <div class="col-sm-6">
                <button type="button" class="btn btn-primary col-sm-offset-1" id="clearBtn">清&nbsp&nbsp&nbsp空</button>
              </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
          </div>
        </div>
      </div>
    </div>


  </body>
</html>
