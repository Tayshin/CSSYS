$("input[name='addCourseNum']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).css("ime-mode", "disabled");


$("input[name='addCourseName']").keyup(function(){
    $(this).val($(this).val().replace(/[\d]|/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/[\d]|/g,''));
});

$("input[name='addCourseCredit']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
});
$("input[name='addCourseLeft']").keyup(function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
}).bind("paste",function(){
    $(this).val($(this).val().replace(/\D|^0/g,''));
});

//$("input[name='addCredit']").keyup(function(){
//    $(this).val($(this).val().replace(/\D|^0/g,''));
//}).bind("paste",function(){
//    $(this).val($(this).val().replace(/\D|^0/g,''));
//}).css("ime-mode", "disabled");

$(".form-group input").keyup(function(){
    var value1 = $("#addCourseNum").val();
    var value2 = $("#addCourseName").val();
    var value3 = $("#addCourseCredit").val();
    var value4 = $("#addCourseLeft").val();


    if( value1 !=""&& value2 !=""&& value3 !=""&& value4 !=""){
        $("#submitBtn").attr("disabled",false);
    }else{$("#submitBtn").attr("disabled",true);}
});




