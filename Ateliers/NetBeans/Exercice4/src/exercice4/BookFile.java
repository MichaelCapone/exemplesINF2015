/*
 * Copyright 2016 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package exercice4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class BookFile {
    static public void read() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        String path = "livres.txt";
        char[] fullSizeBuffer = new char[(int) new File(path).length()];
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputReader = new InputStreamReader(inputStream, "UTF-8");
        inputReader.read(fullSizeBuffer);
        String content = new String(fullSizeBuffer);
        System.out.println(content);
    }
}