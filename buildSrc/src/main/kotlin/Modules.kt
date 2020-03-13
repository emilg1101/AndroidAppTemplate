import org.gradle.api.artifacts.dsl.DependencyHandler

object Modules {

    const val App = ":app"
    const val Domain = ":domain"
    const val Data = ":data"
    const val Device = ":device"

    fun DependencyHandler.implementDomain() {
        add("api", project(mapOf("path" to Domain)))
    }

    fun DependencyHandler.implementData() {
        add("implementation", project(mapOf("path" to Data)))
    }

    fun DependencyHandler.implementDevice() {
        add("implementation", project(mapOf("path" to Device)))
    }
}
