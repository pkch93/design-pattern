rootProject.name = "design-pattern"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

include("design-pattern-java")
include("design-pattern-kotlin")