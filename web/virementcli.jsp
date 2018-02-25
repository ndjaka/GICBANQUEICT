<%-- 
    Document   : message
    Created on : 25 févr. 2018, 02:56:37
    Author     : armel sanou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%@include file="header.jsp" %>
<div class="container-fluid text-center" style="top:99px;position: absolute">
    <div class="row" style="padding-bottom: 26px">
        <div class="col-md-9">
            <div class="card " >
               

                <div class="card-header " style=" background: #3f51b5">
                    <strong class="h3-responsive" style="color: white">Effectuer un virement</strong>
                </div>
                <!--Card content-->
                <div class="card-body ">
                    <form  class="offset-3">
    <p class="h4 text-center mb-4"></p>

   
    
    <!-- Material input subject -->
    <div class="md-form col-md-8 pb-2">
        
        <input type="text" id="materialFormContactSubjectEx" class="form-control">
        <label for="materialFormContactSubjectEx"><i class="fa fa-tag  grey-text"></i>  numero de compte</label>
    </div>
    
    <!-- Material textarea message -->
    <div class="md-form col-md-8 ">
     
        <input type="text" id="materialFormContactMessageEx" class="form-control" ></input>
        <label for="materialFormContactMessageEx"><i class="fa fa-money grey-text"></i> Montant</label>
    </div>

    <div class="text-center mt-4" style="position: relative;left:-17%"  >
        
       
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" type="submit" data-toggle="modal" data-target="#exampleModal">
    valider
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                vous voulez transferer 10000 vers mr <strong></strong> Ndjaka entrer votre code 
                    <div class="md-form col-md-8 pt-lg-5">

                        <input type="text" id="materialFormContactMessageEx" class="form-control black-text" ></input>
                        <label for="materialFormContactMessageEx" class="black-text"> Code</label>
                    </div>
                    <form method="POST" >
                        
                    </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
                                
    </div>
    
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
