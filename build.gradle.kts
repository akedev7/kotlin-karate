plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
}

dependencies {
    testImplementation("io.karatelabs:karate-junit5:1.5.2.RC2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}