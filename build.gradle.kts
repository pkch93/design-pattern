plugins {
    id("java")
}

allprojects {
    group = "edu.pkch"
    version = "1.0.0"
}

subprojects {
    apply {
        plugin("java")
    }

    repositories {
        mavenCentral()
    }
}