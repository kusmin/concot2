package concot2

class Item {

    String nome

    static belongsTo = [categoria:Categoria]

    static constraints = {
        nome nullable:false, blank:false, maxSize:128
        categoria nullable:false
    }

}
