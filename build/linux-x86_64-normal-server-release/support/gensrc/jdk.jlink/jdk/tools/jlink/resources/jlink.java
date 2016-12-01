package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class jlink extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.badpattern", "bad pattern {0}" },
            { "err.bom.generation", "bom file generation failed: {0}" },
            { "err.config.defaults", "property {0} is missing from configuration" },
            { "err.config.defaults.value", "wrong value in defaults property: {0}" },
            { "err.dir.exists", "{0} already exists" },
            { "err.existing.image.invalid", "existing image is not valid" },
            { "err.file.error", "cannot access file: {0}" },
            { "err.file.not.found", "cannot find file: {0}" },
            { "err.image.must.exist", "image {0} does not exist or is not a directory" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "invalid argument for option: {0}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.mods.must.be.specified", "no modules specified to {0}" },
            { "err.modulepath.must.be.specified", "--module-path must be specified" },
            { "err.not.modular.format", "selected module {0} ({1}) not in jmod or modular JAR format" },
            { "err.option.after.class", "option must be specified before classes: {0}" },
            { "err.option.unsupported", "{0} not supported: {1}" },
            { "err.orphan.argument", "orphan argument: {0}" },
            { "err.output.must.be.specified", "--output must be specified" },
            { "err.path.not.found", "path not found: {0}" },
            { "err.path.not.valid", "invalid path: {0}" },
            { "err.signing", "signed modular JAR {0} is currently not supported, use --ignore-signing-information to suppress error" },
            { "err.unknown.byte.order", "unknown byte order {0}" },
            { "err.unknown.option", "unknown option: {0}" },
            { "error.prefix", "Error:" },
            { "main.command.files", "  @<filename>                       Read options from file" },
            { "main.extended.help", "List of available plugins:" },
            { "main.extended.help.footer", "For options requiring a <pattern-list>, the value will be a comma separated list of elements each using one the following forms:\n  <glob-pattern>\n  glob:<glob-pattern>\n  regex:<regex-pattern>\n  @<filename> where filename is the name of a file containing patterns to be used, one pattern per line\n\n" },
            { "main.msg.bug", "An exception has occurred in jlink. Please file a bug at the Java Bug Database (http://bugreport.java.com/bugreport/) after checking the database for duplicates. Include your program and the following diagnostic in your report.  Thank you." },
            { "main.opt.add-modules", "  --add-modules <mod>[,<mod>...]    Root modules to resolve" },
            { "main.opt.endian", "  --endian <little|big>             Byte order of generated jimage (default:native)" },
            { "main.opt.help", "  -h, --help                        Print this help message" },
            { "main.opt.ignore-signing-information", "  --ignore-signing-information      Ignore signing information in modular JARs" },
            { "main.opt.limit-modules", "  --limit-modules <mod>[,<mod>...]  Limit the universe of observable modules" },
            { "main.opt.module-path", "  -p <modulepath>\n  --module-path <modulepath>        Module path" },
            { "main.opt.output", "  --output <path>                   Location of output path" },
            { "main.opt.save-opts", "  --save-opts <filename>            Save jlink options in the given file" },
            { "main.opt.version", "  --version                         Version information" },
            { "main.usage", "Usage: {0} <options> --module-path <modulepath> --add-modules <mods> --output <path>\nPossible options include:" },
            { "main.usage.summary", "Usage: {0} <options> --module-path <modulepath> --add-modules <mods> --output <path>\nuse --help for a list of possible options" },
            { "warn.invalid.arg", "invalid classname or pathname not exist: {0}" },
            { "warn.prefix", "Warning:" },
            { "warn.signing", "signed modular JAR {0} is currently not supported" },
            { "warn.split.package", "package {0} defined in {1} {2}" },
        };
    }
}
