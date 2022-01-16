plugins {
    id("java")
}

java {
    val javaVersion: String by project
    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}

dependencies {
    val junitVersion: String by project
    testImplementation ("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
}

tasks {
    test {
        useJUnitPlatform()
    }
}