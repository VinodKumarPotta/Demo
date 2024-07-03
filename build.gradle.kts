plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.0"
}

group = "org.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    /*implementation("com.intellij:openapi:7.0.3")*/
}

tasks.test {
    useJUnitPlatform()
}

sourceSets{
    main {
        java {
            setSrcDirs(listOf("src/main/java"))
        }
        resources {
            setSrcDirs(listOf("src/main/resources"))
        }
    }
}

intellij {
    version.set("2023.1.4")
    type.set("IU")
    plugins.set(listOf("org.jetbrains.kotlin:231-1.9.0-release-358-IJ8770.65"))
}