<jsp:include page="headerContext.jsp"></jsp:include>

<%@ page import="com.*"%>
    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a>
                        </li>
                        <li>Checkout - Address</li>
                    </ul>
                </div>

                <div class="col-md-9" id="checkout">

                    <div class="box">
                        <form name="myForm" method="post" action="<%=request.getContextPath() %>/checkout1/${username}" onsubmit="return validateForm()">
                            <h1>Checkout</h1>
                            <ul class="nav nav-pills nav-justified">
                                <li class="active"><a href="#"><i class="fa fa-map-marker"></i><br>Address</a>
                                </li>
                                <li class="disabled"><a href="#"><i class="fa fa-truck"></i><br>Delivery Method</a>
                                </li>
                                <li class="disabled"><a href="#"><i class="fa fa-money"></i><br>Payment Method</a>
                                </li>
                                <li class="disabled"><a href="#"><i class="fa fa-eye"></i><br>Order Review</a>
                                </li>
                            </ul>

                            <div class="content">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="firstname">Firstname</label>
                                            <input type="text" class="form-control"  name="fname">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="lastname">Lastname</label>
                                            <input type="text" class="form-control"  name="lname">
                                        </div>
                                    </div>
                                </div>
                                <!-- /.row -->

                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="company">Company</label>
                                            <input type="text" class="form-control"  name="company">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="address">Address</label>
                                            <input type="text" class="form-control"  name="address">
                                        </div>
                                    </div>
                                </div>
                                <!-- /.row -->

                                <div class="row">
                                    <div class="col-sm-6 col-md-3">
                                        <div class="form-group">
                                            <label for="fname">Street</label>
                                            <input type="text" class="form-control"  name="street">
                                        </div>
                                    </div>
                                    <div class="col-sm-6 col-md-3">
                                        <div class="form-group">
                                            <label for="zip">ZIP</label>
                                            <input type="text" class="form-control"  name="zip">
                                        </div>
                                    </div>
                                    <div class="col-sm-6 col-md-3">
                                        <div class="form-group">
                                            <label for="state">State</label>
                                            <input type="text" class="form-control"  name="state">
                                        </div>
                                    </div>
                                    <div class="col-sm-6 col-md-3">
                                        <div class="form-group">
                                            <label for="country">Country</label>
                                            <input type="text" class="form-control"  name="country">
                                        </div>
                                    </div>

                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="phone">Telephone</label>
                                            <input type="text" class="form-control"  name="phone">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label for="email">Email</label>
                                            <input type="text" class="form-control"  name="email">
                                        </div>
                                    </div>

                                </div>
                                <!-- /.row -->
                            </div>

                            <div class="box-footer">
                                <!-- <div class="pull-left">
                                    <a href="basket.html" class="btn btn-default"><i class="fa fa-chevron-left"></i>Back to basket</a>
                                </div> -->
                                <div class="pull-right">
                                    <input type="submit" class="btn btn-primary" value="Continue to Delivery Method"/><i class="fa fa-chevron-right"></i>
                                    
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.box -->


                </div>
                <!-- /.col-md-9 -->

                
                <!-- /.col-md-3 -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->
</div>
<br>
<jsp:include page="footerContext.jsp"></jsp:include>  

<script>
function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    var a = document.forms["myForm"]["lname"].value;
    var b = document.forms["myForm"]["company"].value;
    var c = document.forms["myForm"]["address"].value;
    var z = document.forms["myForm"]["street"].value;
    var e = document.forms["myForm"]["zip"].value;
    var f = document.forms["myForm"]["state"].value;
    var g = document.forms["myForm"]["country"].value;
    var h = document.forms["myForm"]["phone"].value;
    var i = document.forms["myForm"]["email"].value;
   
   
    
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
    
    if (a == "") {
        alert("Name must be filled out");
        return false;
    }
    if (b == "") {
        alert("Company must be filled out");
        return false;
    }
    if (c == "") {
        alert("Address must be filled out");
        return false;
    }
    
    if (z == "") {
        alert("Street must be filled out");
        return false;
    }
    
    var numbers = /^[0-9]+$/;  
    if(!e.match(numbers))     
    {  
    alert('Please enter valid zip code');  
    //zip.focus();  
    return false;  
    }  
  
    
    if (f == "") {
        alert("State must be filled out");
        return false;
    }
    if (g == "") {
        alert("Country must be filled out");
        return false;
    }
    
    var phoneno = /^[0-9]+$/;  
    if (!h.match(phoneno)) {
        alert('Phone must be filled out');
        return false;
    }
    
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
    if (!i.match(mailformat)) {
        alert("Not a valid e-mail address");
        return false;
    }
}
</script>   