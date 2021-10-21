class Player(
    private var name: String = "Player",
    private var str: Int = 1,
    private var dex: Int = 1,
    private var XP: Int = 0,
    private var lvl: Int = 1,
    private var nextLvlXP: Int = 10
) {

    fun getName(): String {
        return this.name
    }

    fun getStr(): Int {
        return this.str
    }

    fun getDex(): Int {
        return this.dex
    }

    fun getXP(): Int {
        return this.XP
    }

    fun getLvl(): Int {
        return this.lvl
    }

    fun getNextLvlXP(): Int {
        return this.nextLvlXP
    }

    fun receiveXP(xp: Int) {
        XP += xp
        while (XP >= nextLvlXP) lvlUp()

    }

    private fun lvlUp() {
        lvl += 1

        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0

        val diffXP = XP - nextLvlXP
        nextLvlXP *= 2

        XP = diffXP
    }

    override fun toString(): String {
        return "$name - lvl: $lvl\n" +
                "str:$str\n" +
                "dex:$dex\n" +
                "XP:${XP}xp/${nextLvlXP}xp\n"
    }


}

fun main() {
    val p1 = Player()
    println(p1)

    p1.receiveXP(10000)
    println(p1)

    p1.receiveXP(500)
    println(p1)

    println(p1)
}