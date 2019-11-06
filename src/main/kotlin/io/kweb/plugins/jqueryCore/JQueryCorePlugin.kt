package io.kweb.plugins.jqueryCore

import io.kweb.plugins.KwebPlugin

/**
 * Created by ian on 1/9/17.
 */
class JQueryCorePlugin : KwebPlugin(dependsOn = setOf(StaticFilesPlugin(ResourceFolder(resourceFolder), resourceRoute))) {
    override fun decorate(startHead: StringBuilder, endHead: StringBuilder) {
        // Include the plugin, this is straight from the JQuery documentation
        startHead.appendln("""
        <script
                src="$resourceRoute/jquery-3.1.1.min.js"
        crossorigin="anonymous"></script>""".trimIndent()
        )
    }
}

val jqueryCore = JQueryCorePlugin()
