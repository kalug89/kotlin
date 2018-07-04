package simpleclass

class Car(Type:String, Model:String, Owner:String, Price:Int){
    var Type:String? = null
    var Model:String? = null
    var Owner:String? =  null
    var Price:Int? = null
    fun gType():String?{
        return Type
    }

    fun gModel():String?{
        return Model
    }
    fun gOwner():String? {
        return Owner
    }
     fun gPrice():Int?{
         return Price
     }
    init {
        println("Type: $Type")
        println("Mode: $Model")
        println("Owner: $Owner")
        println("Price: $Price")
        this.Type = Type
        this.Model = Model
        this.Owner = Owner
        this.Price = Price
    }

}
