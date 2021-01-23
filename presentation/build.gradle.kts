import Dependencies.Test

plugins {
    javaLibrary
    kotlinLib
}

dependencies {
    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.Coroutines.core)
    testImplementation(Test.junit)
    testImplementation(Test.truth)
}
