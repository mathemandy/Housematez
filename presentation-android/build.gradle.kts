import Dependencies.AndroidX
import ProjectLib.presentation

plugins {
    androidLibrary
    kotlin(kotlinAndroid)
}

configAndroid()

dependencies {
    implementation(project(presentation))
    implementation(AndroidX.viewModel)
}
