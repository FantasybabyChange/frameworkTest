<html>
<script type="text/javascript">
    function zLoginCheck() {
        var Account = 'admin';
        var Password = 'DC483E80A7A0BD9EF71D8CF973673924';

        var str = {
            Account: Account,
            Password: Password
        }
        $.ajax({
            type: "POST",
            url: 'localhost:8080',
            dataType: 'json',
            data: JSON.stringify(str),//
            beforeSend: function (request) {
                request.setRequestHeader("Method", "Login");
                request.setRequestHeader("timespan", "1487586970772");
                request.setRequestHeader("Nonce", "726757");
                request.setRequestHeader("Token", "615d1c0ab53315a2");
                request.setRequestHeader("Account", "");
                request.setRequestHeader("Source", "2");
                request.setRequestHeader("Version", "139");
                request.setRequestHeader("Sign", "5329E35A3F60B7DFA147D20EF377888C");
                request.setRequestHeader("Host", "wsmvip.aisidi.com");
                request.setRequestHeader("Content - Length", "76");
            },
            success: function (data) {
                if (data.Code == "0000") {
                    alert(JSON.stringify(data.Data));
                    alert("Token:" + data.Data.Token);
                } else {
                    alert('登录失败:' + data.Message);
                }
            },
            complete: function (XMLHttpRequest, textStatus) {
                this; // 调用本次AJAX请求时传递的options参数
            }
        });
    }
</script>
<body >
<h2>Hello World!</h2>
</body>
</html>
