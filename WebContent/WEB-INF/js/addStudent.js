$("input[name='addNum']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).css("ime-mode", "disabled");


$("input[name='addName']").keyup(function(){
    $(this).val($(this).val().replace(/[\d]|/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/[\d]|/g,''));
});

$("input[name='addBirth']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
});
$("input[name='addMajor']").keyup(function(){
    $(this).val($(this).val().replace(/[\d]/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/[\d]/g,''));
}).css("ime-mode", "disabled");



$(".form-group input").keyup(function(){
    var value1 = $("#addNum").val();
    var value2 = $("#addName").val();
    var value3 = $("#addPassword").val();
    var value4 = $("#addBirth").val();
    var value5 = $("#addMajor").val();

    if( value1 !=""&& value2 !=""&& value3 !=""&& value4 !=""&& value5 !=""){
        $("#submitBtn").attr("disabled",false);
    }else{$("#submitBtn").attr("disabled",true);}
});




