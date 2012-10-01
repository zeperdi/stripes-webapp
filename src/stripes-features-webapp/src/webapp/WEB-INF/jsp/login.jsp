<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head profile="http://gmpg.org/xfn/11">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>Stripes Demo - Login</title>
  <style>
	#container {
		padding: 100px 0 0 250px;
		font-family: sans-serif;
	}
	
	#login-box {
		background-color: #2175bc; 
		color: #EBEBEB;
		height: 352px;
		padding: 20px 76px;
		width: 333px;
	}
	
	h2 {
		font: bold 44px "Calibri",sans-serif;
	}
	
	input[type="text"], input[type="password"] {
		width: 300px;
		margin-top: 8px;
		margin-bottom:8px;
		height: 22px;
	}

  </style>
</head>
<body>
	<div id="container">
		<div id="login-box">
			<h2>Stripes demo webapp</h2>
			<form class="login" method="post" action="j_security_check">
				<label>Username</label>
				<input type="text" name="j_username" /> 
				<label>Password</label>
				<input type="password" name="j_password" /> 
				<input type="submit" value="Login" />				
			</form>	
		</div>
	</div>
<body>