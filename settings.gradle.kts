import Modules.App
import Modules.Data
import Modules.Device
import Modules.Domain

listOf(App, Data, Device, Domain).forEach { module -> include(module) }