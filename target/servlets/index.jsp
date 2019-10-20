<html>
<head>
    <link rel="Stylesheet" href="wyglad.css">
</head>
<body>

<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Sign In </h2>
        <h2 class="inactive underlineHover"><a href="/servlets/Rejestracja.html">Sign Up </a></h2>


        <!-- Login Form -->
        <form action="/servlets/Registation"
              method="post">
            <input type="text" id="login" class="fadeIn second" name="userName" placeholder="login">
            <input type="password" id="password" class="fadeIn third" name="pass" placeholder="password">
            <input type="submit" class="fadeIn fourth" value="Zaloguj">
        </form>




    </div>
</div>

</body>
</html>
