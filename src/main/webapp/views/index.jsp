<%@page language = "java" %>
<html>
    <head>
        <link rel = "stylesheet" type = "text/css" href = "index.css"/>
    </head>
    <body>
        <form action = "welcome">
            <div class="login wrap">
                <div class="h1">Login</div>
                <input pattern="^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$" placeholder="Email" id="email" name="email" type="text">
                <input placeholder="Password" id="password" name="password" type="password">
                <input value="Login" type="submit">
            </div>
        </form>
    </body>
</html>