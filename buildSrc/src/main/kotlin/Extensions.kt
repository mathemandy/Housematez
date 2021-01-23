import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec


val PluginDependenciesSpec.androidLibrary: PluginDependencySpec
    get() = id("com.android.library")


val PluginDependenciesSpec.kotlinLibrary: PluginDependencySpec
    get() = id("kotlin-library")

val PluginDependenciesSpec.javaLibrary: PluginDependencySpec
    get() = id("java-library")

val PluginDependenciesSpec.kotlinLib: PluginDependencySpec
    get() = id("kotlin")

fun RepositoryHandler.maven(url: String) {
    maven {
        setUrl(url)
    }
}


fun RepositoryHandler.applyDefault() {
    google()
    jcenter()
    mavenCentral()
    maven ("https://jitpack.io")
    maven (  "https://plugins.gradle.org/m2/")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}