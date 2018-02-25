<%-- 
    Document   : soldecli
    Created on : 19 févr. 2018, 14:25:28
    Author     : ndjaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%@include file="header.jsp" %>
<div class="container-fluid text-center" style="top:99px;position: absolute">
    <div class="row" style="padding-bottom: 251px">
        <div class="col-md-9">
            <div class="card" style="height: 159%" >
               

                <div class="card-header" style=" background: #3f51b5">
                    <strong class="h3-responsive" style="color: white">solde</strong>
                </div>
                <!--Card content-->
                <div class="card-body" style="top: 68px; ">
                    <!--Title-->

                    <!--Text-->
                    <p style="font-size: 22px;color: black" class="card-text h3-responsive">cette page permet au client de consulter leurs compte en ligne.<br>
                        votre derniere connexion a ete effectue le <strong>19/02/2018 a 15:36</strong>
                    </p>
                    <h2 class="h2-responsive" style="color: black"> Compte Courant</h2>
                    <h3 class="h3-responsive"> votre solde est de 250000 FCFA</h3>

                </div>
            </div>
        </div>
        <div class="col-md-3"> 
            <%@include file="menu_client.jsp" %>
        </div>
    </div>
    <%@include file="footer.jsp" %>   
     
</div>

    
   


