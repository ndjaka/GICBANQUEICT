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
            <div class="card " >
               

                <div class="card-header " style=" background: #3f51b5">
                    <strong class="h3-responsive" style="color: white">Message</strong>
                </div>
                <!--Card content-->
                <div class="card-body ">
                    <form  class="offset-3">
    <p class="h4 text-center mb-4"></p>

   
    
    <!-- Material input subject -->
    <div class="md-form col-md-8">
        
        <input type="text" id="materialFormContactSubjectEx" class="form-control">
        <label for="materialFormContactSubjectEx"><i class="fa fa-tag  grey-text"></i>  Object</label>
    </div>
    
    <!-- Material textarea message -->
    <div class="md-form col-md-8">
     
        <textarea type="text" id="materialFormContactMessageEx" class="form-control md-textarea" rows="3"></textarea>
        <label for="materialFormContactMessageEx"><i class="fa fa-pencil grey-text"></i> Your message</label>
    </div>

    <div class="text-center mt-4" style="position: relative;left:-17%"  >
        <button class="btn btn-primary" type="submit">Send<i class="fa fa-paper-plane-o ml-2"></i></button>
    </div>
    <center></center>
</form>
<!-- Material form contact -->
                      

                </div>
            </div>
        </div>
        <div class="col-md-3"> 
            <%@include file="menu_client.jsp" %>
        </div>
    </div>
    <%@include file="footer.jsp" %>   
     
</div>
