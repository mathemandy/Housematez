import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories.applyDefault()

    dependencies {
        classpath(Dependencies.androidGradlePlugin)
        classpath(Dependencies.Kotlin.gradlePlugin)
        classpath(Dependencies.Navigation.safeArgs)
        classpath(Dependencies.androidMaven)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories.applyDefault()
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions.freeCompilerArgs +=
            "-Xuse-experimental=" +
                    "kotlin.Experimental," +
                    "kotlinx.coroutines.ExperimentalCoroutinesApi," +
                    "kotlinx.coroutines.InternalCoroutinesApi," +
                    "kotlinx.coroutines.ObsoleteCoroutinesApi," +
                    "kotlinx.coroutines.FlowPreview"
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
