<%-- 
    Document   : soldecli
    Created on : 19 févr. 2018, 14:25:28
    Author     : ndjaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%@include file="header.jsp" %>
<div class="container-fluid text-center" style="top:99px;position: absolute">
    <div class="row" style="padding-bottom: 20px">
        <div class="col-md-9">
            <div class="card">
               

                <div class="card-header" style=" background: #3f51b5">
                    <strong class="h3-responsive" style="color: white">Informations</strong>
                </div>
                <!--Card content-->
                <div class="card-body h3-responsive">
                    <div class="pb-4" ><label><h2><strong class="black-text">NOM :</strong></h2> </label><label><h1> &nbsp;ndjaka</h1></label></div> 
                    <div class="pb-4" ><label><h2><strong class="black-text">TELEPHONE:</strong></h2> </label><label><h1> &nbsp;678127584</h1></label></div> 
                     <div class="pb-4" ><label><h2><strong class="black-text">CODE :</strong></h2> </label><label><h1> &nbsp;154789plkj</h1></label></div>
                   <div class="pb-4" ><label><h2><strong class="black-text">LOGIN :</strong></h2> </label><label><h1> &nbsp;ndjaka</h1></label></div>
                   <div class="pb-4" ><label><h2><strong class="black-text">NUMERO DE COMPTE :</strong></h2> </label><label><h1> &nbsp;789</h1></label></div>
                            
                </div>
            </div>
        </div>
        <div class="col-md-3"> 
            <%@include file="menu_client.jsp" %>
        </div>
    </div>
    <%@include file="footer.jsp" %>   
     
</div>

    
   


