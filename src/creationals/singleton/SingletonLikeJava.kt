package creationals.singleton

class SingletonLikeJava private constructor() {

    private object HOLDER {
        val INSTANCE = SingletonLikeJava()
    }

    fun showMessage(){
        println("Singleton like in java ${instance.hashCode()}")
    }

    companion object {
        val instance: SingletonLikeJava by lazy { HOLDER.INSTANCE }
    }
}

