const val kotlinAndroid: String = "android"

object Versions {
    const val kotlin = "1.4.21"
    const val androidGradle = "4.1.2"
    const val material = "1.0.0"
    const val rxJava = "2.2.19"
    const val rxAndroid = "2.1.1"
    const val gson = "2.8.6"
    const val okhttp = "4.7.2"
    const val retrofit = "2.9.0"
    const val koin = "2.1.5"
    const val timber = "4.7.1"
    const val logger = "2.2.0"
    const val epoxy = "3.11.0"
    const val androidBase = "1.0.0"
    const val androidMaven = "2.1"
    const val hilt = "2.31-alpha"

    // Test frameworks
    const val junit = "4.12"
    const val espresso = "3.2.0"
    const val testRunner = "1.2.0"
    const val truth = "1.0.1"

    object Android {
        const val sdk = 29
        const val minSdk = 23
    }

    object AndroidX {
        const val appCompat = "1.1.0"
        const val core = "1.3.2"
        const val constraintLayout = "1.1.3"
    }

    object App {
        const val id = "ng.mathemandy.housematex"
        const val loginID  = "ng.mathemandy.login"
        const val onboardingId  = "ng.mathemandy.onboarding"

        const val versionCode = 1
        const val versionName = "1.0.0"
    }

    object ArchitectureComponents {
        const val lifecycle = "2.1.0"
        const val paging = "2.1.2"
        const val room = "2.2.5"
        const val navigation = "2.3.2"
    }

}

object ProjectLib {
    const val app: String = ":app"
    const val core: String = ":core"
    const val presentation: String = ":presentation"
    const val presentation_android: String = ":presentation-android"
    const val domain: String = ":libraries:domain"
    const val data: String = ":libraries:data"
    const val remote: String = ":libraries:remote"
    const val cache: String = ":libraries:cache"
    const val testUtils: String = ":libraries:testUtils"
}
