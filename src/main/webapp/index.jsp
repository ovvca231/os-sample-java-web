<html>
<body>
<h2 ><font color="#ff1493">Hello World with OpenShift!</font></h2>


<form id="calculator" action="calculator" method="post">
    <p>
        <input name="left">
        <input name="right">
    <p> <input type="submit" value="add"><input type="submit" value="substract"> </p>
    </p>
    <p> Left: <span id="result"><%=request.getAttribute("left")%></span></p>
    <p> Right: <span id="result"><%=request.getAttribute("right")%></span></p>
    <p> Result: <span id="result"><%=request.getAttribute("sum")%></span></p>
</form>


</body>
</html>
