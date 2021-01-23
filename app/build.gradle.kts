plugins {
    id("com.android.application")
    commonPlugins.forEach { id(it) }
    id("androidx.navigation.safeargs.kotlin")
}

//apply(from = "../dependencies.gradle.kts")
configAndroid()
importCommonDependencies()

android {
    defaultConfig {
        applicationId = Versions.App.id
    }
    dynamicFeatures = mutableSetOf(":feature:auth:Login")
}

dependencies {
    implementation(Dependencies.Navigation.fragmentKtx)
    implementation(Dependencies.Navigation.uiKtx)

    implementation(Dependencies.okhttp)
    implementation(Dependencies.okhttpLogging)
    implementation(Dependencies.Retrofit.core)
    implementation(Dependencies.Retrofit.gsonConverter)
    implementation(Dependencies.Retrofit.rxJavaAdapter)
}
