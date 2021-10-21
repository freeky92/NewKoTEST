class Player(
    private var name: String = "Player",
    private var str: Int = 1,
    private var dex: Int = 1,
    private var XP: Int = 0,
    private var lvl: Int = 1,
    private var nextLvlXP: Int = 10
) {

    fun getStr() {
        this.str
    }

    fun getDex() {
        this.dex
    }

    fun getXP() {
        this.XP
    }

    fun getLvl() {
        this.lvl
    }

    fun getNextLvlXP() {
        this.nextLvlXP
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
    val p1 = Player(name = "Monti", str = 2)
    println(p1)

    p1.receiveXP(10000)
    println(p1)

    p1.receiveXP(500)
    println(p1)
}