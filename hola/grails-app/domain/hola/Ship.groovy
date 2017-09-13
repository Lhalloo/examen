package hola

import grails.rest.*

@Resource(uri='/ship')
class Ship {
    
    int capacidad
    String nombre
    String tamaño
    String tipo

    static constraints = {
        capacidad maxSize: 150
    }
}
