function article(){
    $.ajax({
            url: '../user/article',
            type: 'POST',
            data:"{}",
            dataType:"JSON",
            // headers:getLoginCookie(),
            success: function () {
                alert("success");
            },
            error: function () {
                alert("error");
            }
        }
    )
}