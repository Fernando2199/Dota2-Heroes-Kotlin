import dota2.AntiMage
import dota2.CrystalMaiden

fun crearHeroes() {
    // Crear instancias de AntiMage y CrystalMaiden
    val antiMage = AntiMage()
    val crystalMaiden = CrystalMaiden()

    // Imprimir el nombre, rol y habilidad de cada héroe
    println("Héroe: ${antiMage.nombre}, Rol: ${antiMage.rol}, Habilidad: ${antiMage.habilidad()}")
    println("Héroe: ${crystalMaiden.nombre}, Rol: ${crystalMaiden.rol}, Habilidad: ${crystalMaiden.habilidad()}")
}

fun main() {
    crearHeroes()
}
