plugins {
    id("kotlin")
}

sourceSets {
    getByName("main").java.srcDir("src/main/kotlin")
}

dependencies {
    api(Libraries.kotlinStd)
    api(Libraries.coroutinesCore)
}