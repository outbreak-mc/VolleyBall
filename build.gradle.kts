plugins {
    `java-library`
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "xyz.jeremynoesen.volleyball"
version = "1.1.7"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/central")
    maven("https://maven.enginehub.org/repo")
    maven("https://libraries.minecraft.net")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.13.2-R0.1-SNAPSHOT")
    compileOnly("com.mojang:authlib:1.5.21")
    implementation("com.sk89q.worldedit:worldedit-bukkit:7.2.15")
}