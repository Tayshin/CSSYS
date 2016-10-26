$("input[name='loginName']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).css("ime-mode", "disabled");


$("input").keyup(function(){
    var value1 = $("#loginName").val();
    var value2 = $("#loginPassword").val();


    if( value1 !=""&& value2 !=""){
        $("#loginBtn").attr("disabled",false);
    }else{$("#loginBtn").attr("disabled",true);}
});