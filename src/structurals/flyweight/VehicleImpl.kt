package structurals.flyweight

class VehicleImpl(
    private val color: String,
    private val patent: String,
    private val owner: String
) : Vehicle {
    override fun showDetail(): String {
        return "Patent: $patent \n Color: $color \n Owner: $owner"
    }
}