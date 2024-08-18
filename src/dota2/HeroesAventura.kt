package dota2

// Definición de la clase abstracta Héroe
abstract class Heroe {
    abstract val nombre: String
    abstract val rol: String
}

// Definición de la interfaz AccionHéroe
interface AccionHeroe {
    fun habilidad(): String
}

// Clase AntiMage que hereda de Heroe e implementa AccionHeroe
class AntiMage : Heroe(), AccionHeroe {
    override val nombre: String = "Anti-Mage"
    override val rol: String = "Carry"

    override fun habilidad(): String {
        return "Mana Void: Inflige daño a un enemigo basado en la cantidad de maná que le queda."
    }
}

// Clase CrystalMaiden que hereda de Heroe e implementa AccionHeroe
class CrystalMaiden : Heroe(), AccionHeroe {
    override val nombre: String = "Crystal Maiden"
    override val rol: String = "Support"

    override fun habilidad(): String {
        return "Freezing Field: Lanza un campo de hielo que ralentiza y daña a los enemigos cercanos."
    }
}
