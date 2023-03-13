package cn.lacknb.study

import net.mamoe.mirai.console.MiraiConsole
import net.mamoe.mirai.console.extension.PluginComponentStorage
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.console.util.SemVersion
import net.mamoe.mirai.utils.info
import net.mamoe.mirai.utils.warning

/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/3/10 9:22
 **/
public object FixProtocolVersionPlugin : KotlinPlugin(
    JvmPluginDescription(
        id = "xyz.cssxsh.mirai.fix-protocol-version",
        name = "fix-protocol-version",
        version = "1.1.0",
    ) {
        author("cssxsh")
    }
) {
    override fun PluginComponentStorage.onLoad() {
        if (SemVersion.parseRangeRequirement("<= 2.14.0").test(MiraiConsole.version)) {
            logger.warning { "Mirai版本低于预期，将升级协议版本" }
            FixProtocolVersion.update()
        }
    }

    @Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
    override fun onEnable() {
        logger.info {
            buildString {
                appendLine("当前各协议版本日期: ")
                for ((_, info) in FixProtocolVersion.info()) {
                    appendLine(info)
                }
            }
        }
    }
}