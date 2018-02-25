<%-- 
    Document   : message
    Created on : 25 févr. 2018, 02:56:37
    Author     : armel sanou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%@include file="header.jsp" %>
<div class="container-fluid text-center" style="top:99px;position: absolute">
    <div class="row" style="padding-bottom: 251px">
        <div class="col-md-9">
            <div class="card" style="height: 159%" >
               

                <div class="card-header" style=" background: #3f51b5">
                    <strong class="h3-responsive" style="color: white">Message</strong>
                </div>
                <!--Card content-->
                <div class="card-body" style="top: 68px; ">
                    <form>
    <p class="h4 text-center mb-4">Wite to us</p>

    <!-- Material input text -->
    <div class="md-form">
        <i class="fa fa-user prefix grey-text"></i>
        <input type="text" id="materialFormContactNameEx" class="form-control">
        <label for="materialFormContactNameEx">Your name</label>
    </div>

    <!-- Material input email -->
    <div class="md-form">
        <i class="fa fa-envelope prefix grey-text"></i>
        <input type="email" id="materialFormContactEmailEx" class="form-control">
        <label for="materialFormContactEmailEx">Your email</label>
    </div>
    
    <!-- Material input subject -->
    <div class="md-form">
        <i class="fa fa-tag prefix grey-text"></i>
        <input type="text" id="materialFormContactSubjectEx" class="form-control">
        <label for="materialFormContactSubjectEx">Subject</label>
    </div>
    
    <!-- Material textarea message -->
    <div class="md-form">
        <i class="fa fa-pencil prefix grey-text"></i>
        <textarea type="text" id="materialFormContactMessageEx" class="form-control md-textarea" rows="3"></textarea>
        <label for="materialFormContactMessageEx">Your message</label>
    </div>

    <div class="text-center mt-4">
        <button class="btn btn-outline-secondary" type="submit">Send<i class="fa fa-paper-plane-o ml-2"></i></button>
    </div>
</form>
<!-- Material form contact -->
                      
<!--Textarea with icon prefix-->
<div class="md-form">
    <i class="fa fa-pencil prefix"></i>
    <textarea type="text" id="textareaPrefix" class="form-control md-textarea" rows="3"></textarea>
    <label for="textareaPrefix">Icon Prefix</label>
</div>

                </div>
            </div>
        </div>
        <div class="col-md-3"> 
            <%@include file="menu_client.jsp" %>
        </div>
    </div>
    <%@include file="footer.jsp" %>   
     
</div>
