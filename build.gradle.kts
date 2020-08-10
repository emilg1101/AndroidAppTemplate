plugins {
    id(BuildPlugins.detektGradlePlugin) version BuildPlugins.Versions.detektVersion
}

buildscript {

    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.kotlinGradlePlugin)
    }
}

allprojects {
    apply {
        plugin(BuildPlugins.detektGradlePlugin)
    }
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    detekt {
        config = rootProject.files("config/detekt/detekt.yml")
        reports {
            html {
                enabled = true
                destination = file("build/reports/detekt.html")
            }
        }
    }
}

tasks.register("clean").configure {
    delete("build")
}
