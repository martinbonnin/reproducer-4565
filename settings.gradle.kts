include(":schema", ":feature", ":newmodule")

pluginManagement {
    listOf(repositories, dependencyResolutionManagement.repositories).forEach {
        it.apply {
            mavenCentral()
            maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
    }
}
