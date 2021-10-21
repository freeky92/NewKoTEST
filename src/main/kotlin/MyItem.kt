open class MyItem(var lvl: Int, var weight: Double)

open class Weapon(lvl: Int, weight: Double) : MyItem(lvl, weight) {
    open fun calcDamage(): Int = 42

}

class MagicWeapon(lvl: Int, weight: Double) : Weapon(lvl, weight) {
    override fun calcDamage(): Int = super.calcDamage() * 2
}

fun main() {
    val mw1 = MagicWeapon(1, 10.0)
    println("Damage = ${mw1.calcDamage()}")
}