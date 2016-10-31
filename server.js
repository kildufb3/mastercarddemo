var http = require('http');

var server = http.createServer(function(req, res){
    res.writeHead(200, {'Content-Type':'text/html'});
    res.end('<body bgcolor="#808080"> <h1 style="color:#EB001B">Hello </h1> <h1 style="color:#FF5F00"> Mastercard</h1> <p> My name is Brian Kilduff. This simple WebApp was created on the 31st of October 2016 for a presentation at Mastercard</p></body>');
});

var port = Number(process.env.PORT || 3000);

server.listen(port);