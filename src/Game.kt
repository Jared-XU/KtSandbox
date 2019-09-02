fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 80
    val isBlessed = true
    val isImmortal = false

//    val healthStatus = if (healthPoints == 100) {
//        "is in excellent condition!"
//    } else if (healthPoints in 75..89) {
//        if (isBlessed) {
//            "has some minor wounds but is healing quite quickly!"
//        } else {
//            "has some minor wounds."
//        }
//    }  else if (healthPoints in 15..74) {
//
//        "looks pretty hurt."
//
//    } else {
//
//        "is in awful condition!"
//    }
//
//    println("healthStatus:" + healthStatus)
//
//
//    val healthStatus2 =  "${if (isBlessed) "YES" else "NO"}"
//
//    println("(Aura: $auraColor) " +  "(Blessed: ${if (isBlessed) "YES" else "NO"})")
//    println("healthStatus2:" + healthStatus2)

    val healthStatus = formatHealthStatus(healthPoints)
    println(healthStatus)

    //auraColor(isBlessed, healthPoints, isImmortal)

    castFireball(3)

    //printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    `user function`()
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean=true) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }


private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")

private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              healthStatus: String) {
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun `user function` () {
    println("weird function")
}
