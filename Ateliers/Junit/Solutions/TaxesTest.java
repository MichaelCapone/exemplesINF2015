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

import org.junit.Test;
import static org.junit.Assert.*;

public class TaxesTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testMontantNul() {
        Taxes.calculer(0, true, true);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testMontantNegatif() {
        Taxes.calculer(-10, true, true);
    }
    
    @Test
    public void testMontant2Taxes() {
        assertEquals(1150, Taxes.calculer(1000, true, true));
    }
    
    @Test
    public void testAucuneTaxe() {
        assertEquals(1000, Taxes.calculer(1000, false, false));
    }
    
    @Test
    public void testTaxeFederaleSeulement() {
        assertEquals(1050, Taxes.calculer(1000, true, false));
    }
    
    @Test
    public void testTaxeProvincialeSeulement() {
        assertEquals(1100, Taxes.calculer(1000, false, true));
    }
    
    @Test
    public void testGrosMontant() {
        assertEquals(114975000, Taxes.calculer(100000000, true, true));
    }
    
    @Test
    public void testPetitMontant() {
        assertEquals(12, Taxes.calculer(10, true, true));
    }
    
    @Test
    public void testTaxesSansChangement() {
        assertEquals(5, Taxes.calculer(5, true, true));
    }
}