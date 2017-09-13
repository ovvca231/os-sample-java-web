<html>
<body>
<h2 ><font color="#ff1493">Hello World with OpenShift binary sumator, and almost subtractor!</font></h2>


<form id="calculatorsub" action="calculatorsub" method="post">
    <p>
        <input name="left">
        <input name="right">
    <input type="submit" value="sub">
    </p>
</form>
<form id="calculatoradd" action="calculatoradd" method="post">
    <p>
        <input name="left">
        <input name="right">
        <input type="submit" value="add">
    </p>
</form>
    <p> Left: <span id="result"><%=request.getAttribute("left")%></span></p>
    <p> Right: <span id="result"><%=request.getAttribute("right")%></span></p>
    <p> Result: <span id="result"><%=request.getAttribute("sum")%></span></p>



</body>
</html>
