package hola

class BootStrap {

    def init = { servletContext ->
        new Ship(capacidad: 250, nombre:"Louisa", tamaño:"Mediano", tipo:"Crucero").save()
        new Ship(capacidad: 10, nombre:"Adventure", tamaño:"Pequeño", tipo:"Pasajeros").save()
        new Ship(capacidad: 20, nombre:"Voyager", tamaño:"Pequeño", tipo:"Pasajeros").save()
        
    }
    def destroy = {
    }
}
