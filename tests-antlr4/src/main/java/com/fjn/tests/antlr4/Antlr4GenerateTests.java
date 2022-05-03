package com.fjn.tests.antlr4;

import com.jn.langx.util.Strings;
import com.jn.langx.util.SystemPropertys;
import org.antlr.v4.Tool;

public class Antlr4GenerateTests {
    public static void main(String[] args) throws Exception {
        String workdir = SystemPropertys.getUserWorkDir();

        String packageName = "com.fjn.tests.antlr4";
        String[] cmdArgs = new String[]{
                "-Dlanguage=Java",
                "-lib", workdir + "\\tests-antlr4\\src\\main\\resources\\lexer",
                "-package", packageName,
                "-o", workdir + "\\tests-antlr4\\src\\generated\\java/"+ Strings.replace(packageName,".","/"),
                workdir + "\\tests-antlr4\\src\\main\\resources\\grammar\\ArrayInit.g4",
                workdir + "\\tests-antlr4\\src\\main\\resources\\grammar\\Hello.g4"
        };
        Tool.main(cmdArgs);
    }
}
