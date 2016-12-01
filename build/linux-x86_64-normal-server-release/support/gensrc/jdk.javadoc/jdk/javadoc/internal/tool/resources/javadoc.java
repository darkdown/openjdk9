package jdk.javadoc.internal.tool.resources;

public final class javadoc extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "doclet.internal.report.bug", "Please file a bug against the javadoc tool via the Java bug reporting page\n(http://bugreport.java.com) after checking the Bug Database (http://bugs.java.com)\nfor duplicates. Include error messages and the following diagnostic in your report. Thank you." },
            { "javadoc.class_not_found", "Class {0} not found." },
            { "javadoc.error", "error" },
            { "javadoc.error.msg", "{0}: error - {1}" },
            { "javadoc.note.msg", "{1}" },
            { "javadoc.note.pos.msg", "{0}: {1}" },
            { "javadoc.warning", "warning" },
            { "javadoc.warning.msg", "{0}: warning - {1}" },
            { "main.Building_tree", "Constructing Javadoc information..." },
            { "main.Loading_source_file", "Loading source file {0}..." },
            { "main.Loading_source_files_for_package", "Loading source files for package {0}..." },
            { "main.No_modules_packages_or_classes_specified", "No modules, packages or classes specified." },
            { "main.Xusage", "" },
            { "main.Xusage.foot", "\nThese options are non-standard and subject to change without notice." },
            { "main.assertion.error", "assertion failed: \"{0}}\"" },
            { "main.cant.read", "cannot read {0}" },
            { "main.could_not_instantiate_class", "Could not instantiate class {0}" },
            { "main.doclet.usage.header", "\nProvided by the {0} doclet:" },
            { "main.doclet_class_not_found", "Cannot find doclet class {0}" },
            { "main.doclet_could_not_get_location", "Could not get location for {0}" },
            { "main.doclet_could_not_set_location", "Could not set location for {0}" },
            { "main.doclet_no_classloader_found", "Could not obtain classloader to load {0}" },
            { "main.done_in", "[done in {0} ms]" },
            { "main.error", "{0} error" },
            { "main.errors", "{0} errors" },
            { "main.fatal.error", "fatal error encountered: {0}" },
            { "main.file.manager.list", "FileManager error listing files: \"{0}\"" },
            { "main.file_ignored", "File ignored: \"{0}\" (not yet supported)" },
            { "main.file_not_found", "File not found: \"{0}\"" },
            { "main.illegal_class_name", "Illegal class name: \"{0}\"" },
            { "main.illegal_locale_name", "Locale not available: {0}" },
            { "main.illegal_option_value", "Illegal option value: \"{0}\"" },
            { "main.illegal_package_name", "Illegal package name: \"{0}\"" },
            { "main.internal.error", "an internal error has occurred" },
            { "main.invalid_flag", "invalid flag: {0}" },
            { "main.legacy_api", "The old Doclet and Taglet APIs in the packages\ncom.sun.javadoc, com.sun.tools.doclets and their implementations\nare planned to be removed in a future JDK release. These\ncomponents have been superseded by the new APIs in jdk.javadoc.doclet.\nUsers are strongly recommended to migrate to the new APIs.\n" },
            { "main.malformed_locale_name", "Malformed locale name: {0}" },
            { "main.module_not_found", "module {0} not found.\n" },
            { "main.more_than_one_doclet_specified_0_and_1", "More than one doclet specified ({0} and {1})." },
            { "main.no_source_files_for_package", "No source files for package {0}" },
            { "main.only_one_argument_with_equals", "cannot use ''='' syntax for options that require multiple arguments" },
            { "main.opt.J.arg", "<flag>" },
            { "main.opt.J.desc", "Pass <flag> directly to the runtime system" },
            { "main.opt.X.desc", "Print a synopsis of nonstandard options and exit" },
            { "main.opt.Xmaxerrs.arg", "<number>" },
            { "main.opt.Xmaxerrs.desc", "Set the maximum number of errors to print" },
            { "main.opt.Xmaxwarns.arg", "<number>" },
            { "main.opt.Xmaxwarns.desc", "Set the maximum number of warnings to print" },
            { "main.opt.Xmodule.arg", "<module-name>" },
            { "main.opt.Xmodule.desc", "Specify a module to which the classes being compiled belong" },
            { "main.opt.Xold.desc", "Invoke the legacy javadoc tool" },
            { "main.opt.add.exports.arg", "<module>/<package>=<other-module>(,<other-module>)*" },
            { "main.opt.add.exports.desc", "Specify a package to be considered as exported from its\ndefining module to additional modules, or to all unnamed\nmodules if <other-module> is ALL-UNNAMED" },
            { "main.opt.add.modules.arg", "<module>(,<module>)*" },
            { "main.opt.add.modules.desc", "Root modules to resolve in addition to the initial modules,\nor all modules on the module path if <module> is\nALL-MODULE-PATH." },
            { "main.opt.add.reads.arg", "<module>=<other-module>(,<other-module>)*" },
            { "main.opt.add.reads.desc", "Specify additional modules to be considered as required by a\ngiven module. <other-module> may be ALL-UNNAMED to require\nthe unnamed module." },
            { "main.opt.bootclasspath.arg", "<path>" },
            { "main.opt.bootclasspath.desc", "Override location of platform class files used for non-modular\nreleases" },
            { "main.opt.breakiterator.desc", "Compute first sentence with BreakIterator" },
            { "main.opt.class.path.arg", "<path>" },
            { "main.opt.class.path.desc", "Specify where to find user class files" },
            { "main.opt.doclet.arg", "<class>" },
            { "main.opt.doclet.desc", "Generate output via alternate doclet" },
            { "main.opt.docletpath.arg", "<path>" },
            { "main.opt.docletpath.desc", "Specify where to find doclet class files" },
            { "main.opt.encoding.arg", "<name>" },
            { "main.opt.encoding.desc", "Source file encoding name" },
            { "main.opt.exclude.arg", "<pkglist>" },
            { "main.opt.exclude.desc", "Specify a list of packages to exclude" },
            { "main.opt.expand.requires.arg", "<value>" },
            { "main.opt.expand.requires.desc", "Instructs the tool to expand the set of modules to be\ndocumented. By default, only the modules given explicitly on\nthe command line will be documented. A value of \"public\" will\nadditionally include all \"requires public\" dependencies of\nthose modules. A value of \"all\" will include all dependencies\nof those modules." },
            { "main.opt.extdirs.arg", "<dirlist>" },
            { "main.opt.extdirs.desc", "Override location of installed extensions" },
            { "main.opt.help.desc", "Display command line options and exit" },
            { "main.opt.limit.modules.arg", "<module>(,<module>)*" },
            { "main.opt.limit.modules.desc", "Limit the universe of observable modules" },
            { "main.opt.locale.arg", "<name>" },
            { "main.opt.locale.desc", "Locale to be used, e.g. en_US or en_US_WIN" },
            { "main.opt.module.arg", "<module>(,<module>)*" },
            { "main.opt.module.desc", "Document the specified module(s)" },
            { "main.opt.module.path.arg", "<path>" },
            { "main.opt.module.path.desc", "Specify where to find application modules" },
            { "main.opt.module.source.path.arg", "<path>" },
            { "main.opt.module.source.path.desc", "Specify where to find input source files for multiple modules" },
            { "main.opt.package.desc", "Show package/protected/public classes and members" },
            { "main.opt.patch.module.arg", "<module>=<file>(:<file>)*" },
            { "main.opt.patch.module.desc", "Override or augment a module with classes and resources in\nJAR files or directories" },
            { "main.opt.private.desc", "Show all classes and members" },
            { "main.opt.protected.desc", "Show protected/public classes and members (default)" },
            { "main.opt.public.desc", "Show only public classes and members" },
            { "main.opt.quiet.desc", "Do not display status messages" },
            { "main.opt.release.arg", "<release>" },
            { "main.opt.release.desc", "Provide source compatibility with specified release" },
            { "main.opt.show.members.arg", "<value>" },
            { "main.opt.show.members.desc", "Specifies which members (fields, methods, etc.) will be\ndocumented, where value can be one of \"public\", \"protected\",\n\"package\" or \"private\". The default is \"protected\", which will\nshow public and protected members, \"public\" will show only\npublic members, \"package\" will show public, protected and\npackage members and \"private\" will show all members." },
            { "main.opt.show.module.contents.arg", "<value>" },
            { "main.opt.show.module.contents.desc", "Specifies the documentation granularity of module\ndeclarations. Possible values are \"api\" or \"all\"." },
            { "main.opt.show.packages.arg", "<value>" },
            { "main.opt.show.packages.desc", "Specifies which module's packages will be documented. Possible\nvalues are \"exported\" or \"all\" packages." },
            { "main.opt.show.types.arg", "<value>" },
            { "main.opt.show.types.desc", "Specifies which types (classes, interfaces, etc.) will be\ndocumented, where value can be one of \"public\", \"protected\",\n\"package\" or \"private\". The default is \"protected\", which will\nshow public and protected types, \"public\" will show only\npublic types, \"package\" will show public, protected and\npackage types and \"private\" will show all types." },
            { "main.opt.source.arg", "<release>" },
            { "main.opt.source.desc", "Provide source compatibility with specified release" },
            { "main.opt.source.path.arg", "<path>" },
            { "main.opt.source.path.desc", "Specify where to find source files" },
            { "main.opt.subpackages.arg", "<subpkglist>" },
            { "main.opt.subpackages.desc", "Specify subpackages to recursively load" },
            { "main.opt.system.arg", "<jdk>" },
            { "main.opt.system.desc", "Override location of system modules used for modular releases" },
            { "main.opt.upgrade.module.path.arg", "<path>" },
            { "main.opt.upgrade.module.path.desc", "Override location of upgradeable modules" },
            { "main.opt.verbose.desc", "Output messages about what Javadoc is doing" },
            { "main.out.of.memory", "java.lang.OutOfMemoryError: Please increase memory.\nFor example, on the JDK Classic or HotSpot VMs, add the option -J-Xmx\nsuch as -J-Xmx32m." },
            { "main.package_not_found", "Package {0} not found" },
            { "main.release.bootclasspath.conflict", "option {0} cannot be used together with -release" },
            { "main.release.not.standard.file.manager", "-release option specified, but the provided JavaFileManager is not a StandardJavaFileManager." },
            { "main.requires_argument", "option {0} requires an argument." },
            { "main.unexpected.exception", "an unexpected exception was caught: {0}" },
            { "main.unknown.error", "an unknown error has occurred" },
            { "main.unnecessary_arg_provided", "option {0} does not require an argument" },
            { "main.unsupported.release.version", "release version {0} not supported" },
            { "main.usage", "Usage:\n    javadoc [options] [packagenames] [sourcefiles] [@files]\nwhere options include:" },
            { "main.usage.foot", "\nGNU-style options may use '=' instead of whitespace to separate the name of an\noption from its value.\n" },
            { "main.warning", "{0} warning" },
            { "main.warnings", "{0} warnings" },
        };
    }
}
