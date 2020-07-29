package structurals.flyweight

class FlyweightFactory {

    fun listVehicles(colors: Array<String>, patents: Array<String>, owners: Array<String>){
        var vehicle: Vehicle
        for (i in patents.indices){
            vehicle = VehicleImpl(colors[i], patents[i], owners[i])
            println("*** Vehicle Info: ***")
            println(vehicle.showDetail())
        }
    }
}