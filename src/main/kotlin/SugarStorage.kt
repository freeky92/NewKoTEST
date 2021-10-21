class SugarStorage(var volume: Int = 0) {

    fun decreaseSugar(v: Int) {
        if (v < 0) {
            return
        } else if (volume <= v) {
            volume = 0
            return
        } else {
            volume -= v
        }
    }
    fun increaseSugar(v: Int) {
        if (v < 0) {
            return
        } else {
            volume += v
        }
    }
}