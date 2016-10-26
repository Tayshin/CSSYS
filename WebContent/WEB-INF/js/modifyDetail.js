
$("input").keyup(function(){
    var value1 = $("#modifyPassword").val();



    if( value1 !=""){
        $("#submitBtn").attr("disabled",false);
    }else{$("#submitBtn").attr("disabled",true);}
});




