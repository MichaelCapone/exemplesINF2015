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

package parametres;

public class Parametres {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Le programme doit recevoir 2 paramètres.");
            System.exit(1);
        }
        String fichierEntree = args[0];
        String fichierSortie = args[1];

        System.out.println(fichierEntree);
        System.out.println(fichierSortie);
    }
}