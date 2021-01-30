plugins {
    id("com.android.dynamic-feature")
    commonPlugins.forEach { id(it) }
}

configAndroid()
importCommonDependencies()

android {
    defaultConfig {
        applicationId = Versions.App.onboardingId
    }
}

dependencies {
    implementation(project(":app"))
    implementation(Dependencies.AndroidX.viewpager)
    implementation (Dependencies.Font.sdp)
    implementation (Dependencies.Font.ssp)
    implementation(Dependencies.circleIndicator)
}
