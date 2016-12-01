package com.sun.tools.jdeps.resources;

public final class jdeps_ja extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "artifact.not.found", "\u898B\u3064\u304B\u308A\u307E\u305B\u3093" },
            { "err.exception.message", "{0}" },
            { "err.genmoduleinfo.not.jarfile", "-genmoduleinfo\u30AA\u30D7\u30B7\u30E7\u30F3\u3067\u306F\u3001{0}\u306F\u6709\u52B9\u3067\u306F\u3042\u308A\u307E\u305B\u3093(\u975E\u30E2\u30B8\u30E5\u30E9JAR\u30D5\u30A1\u30A4\u30EB\u306B\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059)" },
            { "err.invalid.arg.for.option", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5F15\u6570\u304C\u7121\u52B9\u3067\u3059: {0}" },
            { "err.invalid.filters", "-package (-p)\u3001-regex (-e)\u3001-requires\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u3044\u305A\u308C\u304B\u3092\u8A2D\u5B9A\u3067\u304D\u307E\u3059" },
            { "err.invalid.inverse.option", "{0}\u306F-inverse\u30AA\u30D7\u30B7\u30E7\u30F3\u3068\u4E00\u7DD2\u306B\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093" },
            { "err.invalid.module.option", "{0}\u306F{1}\u30AA\u30D7\u30B7\u30E7\u30F3\u3068\u4E00\u7DD2\u306B\u8A2D\u5B9A\u3067\u304D\u307E\u305B\u3093\u3002" },
            { "err.invalid.path", "\u7121\u52B9\u306A\u30D1\u30B9: {0}" },
            { "err.inverse.filter.not.set", "{0}\u306F-inverse\u30AA\u30D7\u30B7\u30E7\u30F3\u3068\u4E00\u7DD2\u306B\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093" },
            { "err.missing.arg", "{0}\u306B\u5024\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093" },
            { "err.module.not.found", "\u30E2\u30B8\u30E5\u30FC\u30EB\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093: {0}" },
            { "err.option.after.class", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u30AF\u30E9\u30B9\u306E\u524D\u306B\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059: {0}" },
            { "err.profiles.msg", "\u30D7\u30ED\u30D5\u30A1\u30A4\u30EB\u60C5\u5831\u304C\u3042\u308A\u307E\u305B\u3093" },
            { "err.root.module.not.set", "\u30EB\u30FC\u30C8\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30BB\u30C3\u30C8\u304C\u7A7A\u3067\u3059" },
            { "err.unknown.option", "\u4E0D\u660E\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.prefix", "\u30A8\u30E9\u30FC:" },
            { "jdeps.wiki.url", "https://wiki.openjdk.java.net/display/JDK8/Java+Dependency+Analysis+Tool" },
            { "main.opt.I", "  -I           -inverse             \u4ED6\u306E\u6307\u5B9A\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u3054\u3068\u306B\u4F9D\u5B58\u6027\u3092\u5206\u6790\u3057\u3001\n                                    \u4E00\u81F4\u3059\u308B\u30CE\u30FC\u30C9\u306B\u76F4\u63A5\u304A\u3088\u3073\u9593\u63A5\u7684\u306B\u4F9D\u5B58\u3059\u308B\n                                    \u3059\u3079\u3066\u306E\u30A2\u30FC\u30C6\u30A3\u30D5\u30A1\u30AF\u30C8\u3092\u691C\u51FA\u3057\u307E\u3059\u3002\n                                    \u3053\u308C\u306F\u3001\u30B3\u30F3\u30D1\u30A4\u30EB\u6642\u306E\u8868\u793A\u5206\u6790\n                                    \u304A\u3088\u3073\u51FA\u529B\u4F9D\u5B58\u6027\u30B5\u30DE\u30EA\u30FC\u306E\u9006\u306B\u76F8\u5F53\u3057\u307E\u3059\u3002\n                                    \u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u306F-requires\u3001-package\u307E\u305F\u306F-regex\u30AA\u30D7\u30B7\u30E7\u30F3\u3068\n                                    \u4E00\u7DD2\u306B\u4F7F\u7528\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059\u3002" },
            { "main.opt.P", "  -P           -profile             \u30D1\u30C3\u30B1\u30FC\u30B8\u3092\u542B\u3080\u30D7\u30ED\u30D5\u30A1\u30A4\u30EB\u3092\u8868\u793A\u3057\u307E\u3059" },
            { "main.opt.R", "  -R           -recursive            \u3059\u3079\u3066\u306E\u30E9\u30F3\u30BF\u30A4\u30E0\u4F9D\u5B58\u6027\u3092\u518D\u5E30\u7684\u306B\u30C8\u30E9\u30D0\u30FC\u30B9\u3057\u307E\u3059\u3002\n                                     -R\u30AA\u30D7\u30B7\u30E7\u30F3\u306F-filter:none\u3092\u610F\u5473\u3057\u307E\u3059\u3002-p\u3001-e\u3001-f\n                                     \u30AA\u30D7\u30B7\u30E7\u30F3\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u308B\u5834\u5408\u3001\u4E00\u81F4\u3059\u308B\u4F9D\u5B58\u6027\u306E\u307F\n                                     \u5206\u6790\u3055\u308C\u307E\u3059\u3002" },
            { "main.opt.addmods", "  -addmods <module-name>[,<module-name>...]\n                                    \u5206\u6790\u7528\u306B\u30E2\u30B8\u30E5\u30FC\u30EB\u3092\u30EB\u30FC\u30C8\u30FB\u30BB\u30C3\u30C8\u306B\u8FFD\u52A0\u3057\u307E\u3059" },
            { "main.opt.apionly", "  -apionly                          \u5206\u6790\u3092API\u3001\u3064\u307E\u308A\u3001\u30D1\u30D6\u30EA\u30C3\u30AF\u30FB\u30AF\u30E9\u30B9\u306E\n                                     \u30D1\u30D6\u30EA\u30C3\u30AF\u30FB\u30E1\u30F3\u30D0\u30FC\u304A\u3088\u3073\u4FDD\u8B77\u3055\u308C\u305F\u30E1\u30F3\u30D0\u30FC\u306E\n                                     \u7F72\u540D\u306B\u304A\u3051\u308B\u4F9D\u5B58\u6027(\u30D5\u30A3\u30FC\u30EB\u30C9\u30FB\u30BF\u30A4\u30D7\u3001\u30E1\u30BD\u30C3\u30C9\u30FB\n                                     \u30D1\u30E9\u30E1\u30FC\u30BF\u30FB\u30BF\u30A4\u30D7\u3001\u623B\u3055\u308C\u305F\u30BF\u30A4\u30D7\u3001\u30C1\u30A7\u30C3\u30AF\u3055\u308C\u305F\n                                     \u4F8B\u5916\u30BF\u30A4\u30D7\u306A\u3069)\u306B\u5236\u9650\u3057\u307E\u3059" },
            { "main.opt.check", "  -check <module-name>[,<module-name>...\n                                    \u6307\u5B9A\u3057\u305F\u30E2\u30B8\u30E5\u30FC\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u5206\u6790\u3057\u307E\u3059\n                                    \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30C7\u30A3\u30B9\u30AF\u30EA\u30D7\u30BF\u3001\u5206\u6790\u5F8C\u306E\u7D50\u679C\u30E2\u30B8\u30E5\u30FC\u30EB\u4F9D\u5B58\u6027\n                                    \u304A\u3088\u3073\u9077\u79FB\u524A\u6E1B\u5F8C\u306E\u30B0\u30E9\u30D5\u3092\n                                    \u51FA\u529B\u3057\u307E\u3059\u3002\n                                    \u672A\u4F7F\u7528\u306E\u4FEE\u98FE\u3055\u308C\u305F\u30A8\u30AF\u30B9\u30DD\u30FC\u30C8\u3082\u8B58\u5225\u3057\u307E\u3059\u3002" },
            { "main.opt.cp", "  -cp <path>   -classpath <path>    \u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u691C\u7D22\u3059\u308B\u5834\u6240\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.ct", "  -ct          -compile-time        \u63A8\u79FB\u7684\u306A\u4F9D\u5B58\u6027\u306E\u30B3\u30F3\u30D1\u30A4\u30EB\u6642\u306E\u8868\u793A\n                                    \u4F8B: -R\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u30B3\u30F3\u30D1\u30A4\u30EB\u6642\u306E\u8868\u793A\u3002\n                                    \u4ED6\u306E\u6307\u5B9A\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u3054\u3068\u306B\u4F9D\u5B58\u6027\u3092\u5206\u6790\u3057\u307E\u3059\n                                    \u4F9D\u5B58\u6027\u304C\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3001JAR\u30D5\u30A1\u30A4\u30EB\u307E\u305F\u306F\u30E2\u30B8\u30E5\u30FC\u30EB\u304B\u3089\n                                    \u691C\u51FA\u3055\u308C\u305F\u5834\u5408\u3001\u305D\u306E\u5305\u542B\u3059\u308B\u30A2\u30FC\u30AB\u30A4\u30D6\u306E\n                                    \u3059\u3079\u3066\u306E\u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u304C\u5206\u6790\u3055\u308C\u307E\u3059\u3002" },
            { "main.opt.depth", "  -depth=<depth>                    \u63A8\u79FB\u7684\u306A\u4F9D\u5B58\u6027\u5206\u6790\u306E\u6DF1\u3055\u3092\n                                    \u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.dotoutput", "  -dotoutput <dir>                  DOT\u30D5\u30A1\u30A4\u30EB\u51FA\u529B\u306E\u5B9B\u5148\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA" },
            { "main.opt.e", "  -e <regex> -regex <regex>         \u6307\u5B9A\u306E\u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3059\u308B\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\u3002" },
            { "main.opt.f", "  -f <regex>   -filter <regex>       \u6307\u5B9A\u306E\u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3059\u308B\u4F9D\u5B58\u6027\u3092\n                                     \u30D5\u30A3\u30EB\u30BF\u3057\u307E\u3059\u3002\u8907\u6570\u56DE\u6307\u5B9A\u3055\u308C\u305F\u5834\u5408\u3001\u6700\u5F8C\u306E\u3082\u306E\u304C\n                                    \u4F7F\u7528\u3055\u308C\u307E\u3059\u3002\n  -filter:package                    \u540C\u3058\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306E\u4F9D\u5B58\u6027\u3092\u30D5\u30A3\u30EB\u30BF\u3057\u307E\u3059\u3002\n                                    \u3053\u308C\u304C\u30C7\u30D5\u30A9\u30EB\u30C8\u3067\u3059\u3002\n  -filter:archive                    \u540C\u3058\u30A2\u30FC\u30AB\u30A4\u30D6\u5185\u306E\u4F9D\u5B58\u6027\u3092\u30D5\u30A3\u30EB\u30BF\u3057\u307E\u3059\n  -filter:module                       \u540C\u3058\u30E2\u30B8\u30E5\u30FC\u30EB\u5185\u306E\u4F9D\u5B58\u6027\u3092\u30D5\u30A3\u30EB\u30BF\u3057\u307E\u3059\n  -filter:none                       -filter:package\u304A\u3088\u3073-filter:archive\u306E\u30D5\u30A3\u30EB\u30BF\u30EA\u30F3\u30B0\u306F\n                                    \u884C\u308F\u308C\u307E\u305B\u3093\u3002-filter\u30AA\u30D7\u30B7\u30E7\u30F3\u3067\u6307\u5B9A\u3057\u305F\u30D5\u30A3\u30EB\u30BF\u30EA\u30F3\u30B0\u304C\n                                    \u5F15\u304D\u7D9A\u304D\u9069\u7528\u3055\u308C\u307E\u3059\u3002\n" },
            { "main.opt.genmoduleinfo", "  -genmoduleinfo <dir>              \u6307\u5B9A\u3057\u305F\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u306Bmodule-info.java\u3092\u751F\u6210\u3057\u307E\u3059\u3002\n                                    \u6307\u5B9A\u3057\u305FJAR\u30D5\u30A1\u30A4\u30EB\u3092\u5206\u6790\u3057\u307E\u3059\u3002\n                                    \u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u306F-dotoutput\u307E\u305F\u306F-cp\u3068\u4E00\u7DD2\u306B\n                                    \u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\u3002" },
            { "main.opt.h", "  -h -?        -help                \u3053\u306E\u4F7F\u7528\u65B9\u6CD5\u306E\u30E1\u30C3\u30BB\u30FC\u30B8\u3092\u51FA\u529B\u3057\u307E\u3059" },
            { "main.opt.include", "\n\u5206\u6790\u5BFE\u8C61\u30AF\u30E9\u30B9\u3092\u30D5\u30A3\u30EB\u30BF\u3059\u308B\u30AA\u30D7\u30B7\u30E7\u30F3:\n  -include <regex>                  \u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3059\u308B\u30AF\u30E9\u30B9\u306B\u5206\u6790\u3092\u5236\u9650\u3057\u307E\u3059\n                                     \u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u6307\u5B9A\u3059\u308B\u3068\u3001\u5206\u6790\u5BFE\u8C61\u30AF\u30E9\u30B9\u306E\n                                     \u30EA\u30B9\u30C8\u304C\u30D5\u30A3\u30EB\u30BF\u3055\u308C\u307E\u3059\u3002\u30D1\u30BF\u30FC\u30F3\u3092\u4F9D\u5B58\u6027\u306B\n                                     \u9069\u7528\u3059\u308B-p\u304A\u3088\u3073-e\u3068\u4E00\u7DD2\u306B\u4F7F\u7528\u3067\u304D\u307E\u3059" },
            { "main.opt.jdkinternals", "  -jdkinternals                     JDK\u5185\u90E8API\u306E\u30AF\u30E9\u30B9\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\u3002\n                                    \u30C7\u30D5\u30A9\u30EB\u30C8\u3067\u306F\u3001-include\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u6307\u5B9A\u3057\u306A\u3044\u3068\u3001\n                                     -classpath\u306E\u3059\u3079\u3066\u306E\u30AF\u30E9\u30B9\u3068\u5165\u529B\u30D5\u30A1\u30A4\u30EB\u3092\u5206\u6790\u3057\u307E\u3059\u3002\n                                     \u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u306F-p\u3001-e\u304A\u3088\u3073-s\u30AA\u30D7\u30B7\u30E7\u30F3\u3068\u4E00\u7DD2\u306B\n                                    \u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\u3002\n                                     \u8B66\u544A: JDK\u5185\u90E8API\u306F\u3001\u30A2\u30AF\u30BB\u30B9\u3067\u304D\u306A\u304F\u306A\u308A\u307E\u3059\u3002" },
            { "main.opt.m", "  -m <module-name>                  \u5206\u6790\u7528\u306B\u30EB\u30FC\u30C8\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.mp", "  -mp <module path>...\n  -modulepath <module path>...      \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D1\u30B9\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.p", "\n\u4F9D\u5B58\u6027\u3092\u30D5\u30A3\u30EB\u30BF\u3059\u308B\u30AA\u30D7\u30B7\u30E7\u30F3:\n  -p <pkgname> -package <pkgname>    \u6307\u5B9A\u306E\u30D1\u30C3\u30B1\u30FC\u30B8\u540D\u306B\u4E00\u81F4\u3059\u308B\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\n                                     (\u8907\u6570\u56DE\u6307\u5B9A\u53EF\u80FD)\u3002" },
            { "main.opt.q", "  -q           -quiet               -genmoduleinfo\u51FA\u529B\u3067\u6B20\u843D\u3057\u3066\u3044\u308B\u4F9D\u5B58\u6027\u3092\u8868\u793A\u3057\u307E\u305B\u3093\u3002" },
            { "main.opt.requires", "  -requires <module-name>           \u6307\u5B9A\u306E\u30E2\u30B8\u30E5\u30FC\u30EB\u540D\u306B\u4E00\u81F4\u3059\u308B\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\n                                    (\u8907\u6570\u56DE\u6307\u5B9A\u53EF\u80FD)\u3002\n                                    -package\u3001-regex\u3001-requires\u306F\u76F8\u4E92\u306B\u6392\u4ED6\u7684\u3067\u3059\u3002" },
            { "main.opt.s", "  -s           -summary             \u4F9D\u5B58\u6027\u306E\u30B5\u30DE\u30EA\u30FC\u306E\u307F\u51FA\u529B\u3057\u307E\u3059" },
            { "main.opt.system", "  -system <java-home>               \u4EE3\u66FF\u30B7\u30B9\u30C6\u30E0\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D1\u30B9\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.upgrademodulepath", "  -upgrademodulepath <module path>...  \u30A2\u30C3\u30D7\u30B0\u30EC\u30FC\u30C9\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D1\u30B9\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.v", "  -v           -verbose             \u30AF\u30E9\u30B9\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u3059\u3079\u3066\u51FA\u529B\u3057\u307E\u3059\n                                     -verbose:class -filter:none\u3068\u540C\u7B49\u3067\u3059\u3002\n  -verbose:package                  \u30D1\u30C3\u30B1\u30FC\u30B8\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u51FA\u529B\u3057\u307E\u3059\n                                     (\u30C7\u30D5\u30A9\u30EB\u30C8\u3067\u306F\u3001\u540C\u3058\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306E\u4F9D\u5B58\u6027\u3092\u9664\u304F)\n  -verbose:class                    \u30AF\u30E9\u30B9\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u51FA\u529B\u3057\u307E\u3059\n                                     (\u30C7\u30D5\u30A9\u30EB\u30C8\u3067\u306F\u3001\u540C\u3058\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306E\u4F9D\u5B58\u6027\u3092\u9664\u304F)" },
            { "main.opt.version", "  -version                          \u30D0\u30FC\u30B8\u30E7\u30F3\u60C5\u5831" },
            { "main.usage", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> <path ...>]\n<path>\u306B\u306F\u3001.class\u30D5\u30A1\u30A4\u30EB\u3001\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3001JAR\u30D5\u30A1\u30A4\u30EB\u306E\u30D1\u30B9\u540D\u3092\u6307\u5B9A\u3067\u304D\u307E\u3059\u3002\n\n\u4F7F\u7528\u3067\u304D\u308B\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u6B21\u306E\u3068\u304A\u308A\u3067\u3059:" },
            { "main.usage.summary", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> <path ...>\n\u4F7F\u7528\u53EF\u80FD\u306A\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u30EA\u30B9\u30C8\u306B\u3064\u3044\u3066\u306F\u3001-h\u3001-?\u307E\u305F\u306F-help\u3092\u4F7F\u7528\u3057\u307E\u3059" },
            { "warn.invalid.arg", "\u30D1\u30B9\u304C\u5B58\u5728\u3057\u307E\u305B\u3093: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.replace.useJDKInternals", "JDK\u5185\u90E8API\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u304A\u3089\u305A\u3001JDK\u5B9F\u88C5\u5C02\u7528\u3067\u3059\u304C\u3001\u4E92\u63DB\u6027\u306A\u3057\u3067\n\u524A\u9664\u307E\u305F\u306F\u5909\u66F4\u3055\u308C\u308B\u5834\u5408\u304C\u3042\u308A\u3001\u30A2\u30D7\u30EA\u30B1\u30FC\u30B7\u30E7\u30F3\u3092\u4E2D\u65AD\u3055\u305B\u308B\u53EF\u80FD\u6027\u304C\u3042\u308A\u307E\u3059\u3002\nJDK\u5185\u90E8API\u306E\u4F9D\u5B58\u6027\u3092\u524A\u9664\u3059\u308B\u3088\u3046\u30B3\u30FC\u30C9\u3092\u5909\u66F4\u3057\u3066\u304F\u3060\u3055\u3044\u3002\nJDK\u5185\u90E8API\u306E\u7F6E\u63DB\u306B\u95A2\u3059\u308B\u6700\u65B0\u306E\u66F4\u65B0\u306B\u3064\u3044\u3066\u306F\u3001\u6B21\u3092\u78BA\u8A8D\u3057\u3066\u304F\u3060\u3055\u3044:\n{0}" },
            { "warn.split.package", "\u30D1\u30C3\u30B1\u30FC\u30B8{0}\u306F{1} {2}\u3067\u5B9A\u7FA9\u3055\u308C\u3066\u3044\u307E\u3059" },
        };
    }
}
