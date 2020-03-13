data class Version(
    val name: String,
    val major: Int,
    val minor: Int,
    val patch: Int,
    val code: Int
)

object Versioning {
    private const val major = 1
    private const val minor = 0
    private const val patch = 0
    private const val code = 1000000 * major + 1000 * minor + patch

    private val name by lazy {
        "$major.$minor.$patch"
    }

    @JvmStatic
    val version by lazy {
        Version(name, major, minor, patch, code)
    }
}
