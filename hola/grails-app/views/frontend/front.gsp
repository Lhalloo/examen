<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sección 4</title>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
        <g:javascript library='jquery' />
    </head>
    <body>
        <header>
            <div class="container">
                <h1>Ejemplo</h1>
            </div>    
        </header>
        <br>
        <div class="container">
        <p id="cliente"></p>
        <g:javascript  src="cliente.js"/>
        <p>
           Front End 
        </p>
        </div>
        <footer>
            <div class="container">
                <p>Reyes Eduardo</p>
            </div>
        </footer>    
    </body>
</html>
