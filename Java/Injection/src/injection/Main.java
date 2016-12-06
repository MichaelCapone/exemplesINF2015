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
package injection;

import apres.NameListWithInjection;
import avant.NameList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        readNamesWithoutInjection();
        readNamesWithInjection();
    }

    private static void readNamesWithInjection() throws FileNotFoundException {
        Scanner file = new Scanner(new File("names.txt"));
        NameListWithInjection names = new NameListWithInjection(file);
        List<String> list = names.load();
        file.close();
        displayNames(list);
    }

    private static void readNamesWithoutInjection() throws FileNotFoundException {
        NameList names = new NameList("names.txt");
        List<String> list = names.load();
        displayNames(list);
    }

    private static void displayNames(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}