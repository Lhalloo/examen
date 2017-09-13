package com.mydomain.myapp

class TestController {

    def index() { 
         redirect(action:'greet')
    }
    def greet(){
        render "<h2>Saludos</h2>"
    }
}