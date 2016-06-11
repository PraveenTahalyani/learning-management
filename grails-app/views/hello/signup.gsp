<h1> Signup</h1>
<form method="post" action="/learning-management/Form/saveuser">
    Firstname <input type=text name="firstName" placeholder="Enter Firstname:"><br><br>
    Lastname<input type=text name="lastName" placeholder="Enter Lastname:"><br><br>
    Email<input type=text name="email" placeholder="Enter Email:"><br><br>
    DOB<input type=text name="DOB" placeholder="Enter DOB"><br><br>
    <input type="submit" value="Submit">
</form>
%{--firstName: ${firstName}<br>--}%
%{--LastName: ${lastName}<br>--}%
%{--Emailid: ${Emailid}<br>--}%
%{--password: ${password}<br>--}%