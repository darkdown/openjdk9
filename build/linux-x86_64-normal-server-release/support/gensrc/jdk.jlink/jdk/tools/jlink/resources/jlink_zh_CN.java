package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class jlink_zh_CN extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.badpattern", "\u9519\u8BEF\u7684\u6A21\u5F0F {0}" },
            { "err.bom.generation", "\u672A\u80FD\u751F\u6210 bom \u6587\u4EF6: {0}" },
            { "err.config.defaults", "\u914D\u7F6E\u4E2D\u7F3A\u5C11\u5C5E\u6027 {0}" },
            { "err.config.defaults.value", "\u9ED8\u8BA4\u5C5E\u6027\u4E2D\u7684\u503C\u9519\u8BEF: {0}" },
            { "err.dir.exists", "{0} \u5DF2\u5B58\u5728" },
            { "err.existing.image.invalid", "\u73B0\u6709\u6620\u50CF\u65E0\u6548" },
            { "err.existing.image.must.exist", "\u73B0\u6709\u6620\u50CF\u4E0D\u5B58\u5728\u6216\u8005\u4E0D\u662F\u76EE\u5F55" },
            { "err.file.error", "\u65E0\u6CD5\u8BBF\u95EE\u6587\u4EF6: {0}" },
            { "err.file.not.found", "\u627E\u4E0D\u5230\u6587\u4EF6: {0}" },
            { "err.internal.error", "\u5185\u90E8\u9519\u8BEF: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "\u9009\u9879\u7684\u53C2\u6570\u65E0\u6548: {0}" },
            { "err.missing.arg", "\u6CA1\u6709\u4E3A{0}\u6307\u5B9A\u503C" },
            { "err.mods.must.be.specified", "\u6CA1\u6709\u5C06\u4EFB\u4F55\u6A21\u5757\u6307\u5B9A\u5230{0}" },
            { "err.modulepath.must.be.specified", "\u5FC5\u987B\u6307\u5B9A --modulepath" },
            { "err.option.after.class", "\u5FC5\u987B\u5728\u7C7B\u4E4B\u524D\u6307\u5B9A\u9009\u9879: {0}" },
            { "err.option.unsupported", "\u4E0D\u652F\u6301{0}: {1}" },
            { "err.output.must.be.specified", "\u5FC5\u987B\u6307\u5B9A --output" },
            { "err.path.not.found", "\u627E\u4E0D\u5230\u8DEF\u5F84: {0}" },
            { "err.path.not.valid", "\u65E0\u6548\u8DEF\u5F84: {0}" },
            { "err.unknown.byte.order", "\u672A\u77E5\u7684\u5B57\u8282\u987A\u5E8F {0}" },
            { "err.unknown.option", "\u672A\u77E5\u9009\u9879: {0}" },
            { "error.prefix", "\u9519\u8BEF:" },
            { "main.command.files", "  @<filename>                       \u4ECE\u6587\u4EF6\u4E2D\u8BFB\u53D6\u9009\u9879" },
            { "main.extended.help", "\u53EF\u7528\u63D2\u4EF6\u5217\u8868:" },
            { "main.extended.help.footer", "\u5BF9\u4E8E\u9700\u8981 <\u6A21\u5F0F\u5217\u8868> \u7684\u9009\u9879, \u503C\u5C06\u4E3A\u9017\u53F7\u5206\u9694\u7684\u5143\u7D20\u5217\u8868, \u6BCF\u4E2A\u5143\u7D20\u4F7F\u7528\u4EE5\u4E0B\u683C\u5F0F\u4E4B\u4E00:\n  <glob \u6A21\u5F0F>\n  glob:<glob \u6A21\u5F0F>\n  regex:<\u6B63\u5219\u8868\u8FBE\u5F0F\u6A21\u5F0F>\n  @<\u6587\u4EF6\u540D>, \u5176\u4E2D\u201C\u6587\u4EF6\u540D\u201D\u662F\u5305\u542B\u8981\u4F7F\u7528\u7684\u6A21\u5F0F\u7684\u6587\u4EF6\u540D, \u6BCF\u884C\u4E00\u4E2A\u6A21\u5F0F\n\n" },
            { "main.msg.bug", "jlink \u4E2D\u51FA\u73B0\u5F02\u5E38\u9519\u8BEF\u3002\u5982\u679C\u5728 Java Bug Database (http://bugreport.java.com/bugreport/) \u4E2D\u6CA1\u6709\u627E\u5230\u8BE5\u9519\u8BEF, \u8BF7\u5728\u8BE5\u6570\u636E\u5E93\u4E2D\u5EFA\u7ACB Bug\u3002\u8BF7\u5728\u62A5\u544A\u4E2D\u9644\u4E0A\u60A8\u7684\u7A0B\u5E8F\u548C\u4EE5\u4E0B\u8BCA\u65AD\u4FE1\u606F\u3002\u8C22\u8C22\u3002" },
            { "main.opt.addmods", "  --addmods <mod>[,<mod>...]        \u8981\u89E3\u6790\u7684\u6839\u6A21\u5757" },
            { "main.opt.endian", "  --endian <little|big>             \u6240\u751F\u6210 jimage \u7684\u5B57\u8282\u987A\u5E8F (\u9ED8\u8BA4\u503C: native)" },
            { "main.opt.help", "  --help                            \u8F93\u51FA\u6B64\u5E2E\u52A9\u6D88\u606F" },
            { "main.opt.limitmods", "  --limitmods <mod>[,<mod>...]      \u9650\u5236\u53EF\u89C2\u5BDF\u6A21\u5757\u7684\u9886\u57DF" },
            { "main.opt.modulepath", "  --modulepath <modulepath>         \u6A21\u5757\u8DEF\u5F84" },
            { "main.opt.output", "  --output <path>                   \u8F93\u51FA\u8DEF\u5F84\u7684\u4F4D\u7F6E" },
            { "main.opt.saveopts", "  --saveopts <filename>             \u5C06 jlink \u9009\u9879\u4FDD\u5B58\u5728\u6307\u5B9A\u6587\u4EF6\u4E2D" },
            { "main.opt.version", "  --version                         \u7248\u672C\u4FE1\u606F" },
            { "main.usage", "\u7528\u6CD5: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\n\u53EF\u80FD\u7684\u9009\u9879\u5305\u62EC:" },
            { "main.usage.summary", "\u7528\u6CD5: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\n\u4F7F\u7528 --help \u53EF\u4EE5\u5217\u51FA\u53EF\u80FD\u7684\u9009\u9879" },
            { "warn.invalid.arg", "\u7C7B\u540D\u65E0\u6548\u6216\u8DEF\u5F84\u540D\u4E0D\u5B58\u5728: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.split.package", "\u5DF2\u5728{1} {2}\u4E2D\u5B9A\u4E49\u7A0B\u5E8F\u5305{0}" },
        };
    }
}