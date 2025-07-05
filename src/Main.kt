//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.






    // Taking input from the user
    fun main() {
        println("💬 Hey bbyy... it's me again 😚 Did you take your medicine today? (yes/no/forgot)")

        val answer = readLine()?.trim()?.lowercase()

        when (answer) {
            "yes" -> {
                println("💖 Slayyy bby!! Your ovaries just did a lil TikTok dance 💃💊")
            }
            "no" -> {
                println("🫶 It’s okayyy. Sometimes it slips our mind. Don’t hate yourself, okay?")
                println("💌 Let's just try again tomorrow. You’re healing, not failing 💗")
            }
            "forgot" -> {
                println("🥹 Awww bbyy. Maybe drink some water now and take it if it's not too late? 💧")
                println("✨ You're still doing amazing, I promise.")
            }
            else -> {
                println("🧐 Hmm that wasn’t yes/no/forgot... you okay? Wanna talk about it?")
                println("🧸 I’m here bby. No judgement. Just love.")
            }
        }

        println("\n☀️ Quote of the day: \"You’re not lazy. You’re healing.\"\n")
    }

