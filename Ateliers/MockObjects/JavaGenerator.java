/* Copyright 2016 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

import java.io.FileWriter;
import java.io.IOException;

public class JavaGenerator {

    public static void provideHeaderComment(final FileWriter writer)
            throws IOException {
        writer.write("/*\n");
        writer.write(" * This file was generated with the PerGen tool.\n");
        writer.write(" * This code is free to use and distribute.\n");
        writer.write(" */\n\n");
    }

    public static void providePackageDeclaration(final FileWriter writer,
            final String packageName)
            throws IOException {
        writer.write("package " + packageName + ";\n\n");
    }

    public static void provideClassDeclaration(final FileWriter writer,
            final String className)
            throws IOException {
        writer.write("public class " + className + " {\n\n");
    }

    public static void provideDefaultConstructor(final FileWriter writer,
            final String className)
            throws IOException {
        writer.write("    public " + className + "() {\n");
        writer.write("    }\n\n");
    }

    public static void providePOJOsIdGetterSetter(final FileWriter writer)
            throws IOException {
        writer.write("    private Integer id = null;\n\n");

        writer.write("    public Integer getId() {\n");
        writer.write("        return id;\n");
        writer.write("    }\n\n");

        writer.write("    public void setId(Integer newId) {\n");
        writer.write("        id = newId;\n");
        writer.write("    }\n\n");
    }

    public static void provideClassEnd(final FileWriter writer)
            throws IOException {
        writer.write("}\n");
    }

    public static void provideDAOsImports(final FileWriter writer)
            throws IOException {
        writer.write("import java.sql.Connection;\n");
        writer.write("import java.sql.PreparedStatement;\n");
        writer.write("import java.sql.ResultSet;\n");
        writer.write("import java.sql.SQLException;\n");
        writer.write("import java.util.ArrayList;\n\n");
    }
}