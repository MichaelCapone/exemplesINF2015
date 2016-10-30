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

public class Taxes {
    public static long calculer(long montant, boolean federal, boolean provincial) {
        if (montant <= 0) {
            throw new IllegalArgumentException();
        }
        
        long resultat = montant;
        if (federal) {
            resultat += Math.round(montant * 0.05);
        }
        if (provincial) {
            resultat += Math.round(montant * 0.09975);
        }
        return resultat;
    }
}