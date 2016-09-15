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

package solutions;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class Exercice1 {

    public static void main(String[] args) {
        String jsonTxt = null;
        try {
            jsonTxt = Utf8File.loadFileIntoString("collection.json");
        } catch (IOException ex) {
            System.out.println("Erreur lors de la lecture du fichier JSON. " + ex.getLocalizedMessage());
            System.exit(1);
        }
        
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);
  
        printAlbumCount(root);
        printSingleCount(root);
        printAlbumListSinceYear(root, 2003);
        printAlbumListWithRating(root, 5);
    }

    private static void printAlbumListWithRating(JSONObject root, int rating) {
        System.out.println("Les albums publiés avec la cote " + rating + " :");
        JSONArray collection = root.getJSONArray("collection");
        for (int i = 0; i < collection.size(); i++) {
            JSONObject item = collection.getJSONObject(i);
            if (item.getString("type").equals("album") && item.getInt("rating") == rating) {
                System.out.println(item.getString("title"));
            }
        }
    }
    
    private static void printAlbumListSinceYear(JSONObject root, int year) {
        System.out.println("Les albums publiés depuis " + year + " :");
        JSONArray collection = root.getJSONArray("collection");
        for (int i = 0; i < collection.size(); i++) {
            JSONObject item = collection.getJSONObject(i);
            if (item.getString("type").equals("album") && item.getInt("publication") >= year) {
                System.out.println(item.getString("title"));
            }
        }
    }
    
    private static void printAlbumCount(JSONObject root) {
        int count = getCountWithType(root, "album");
        System.out.println("Nombre d'albums : " + count);        
    }
    
    private static void printSingleCount(JSONObject root) {
        int count = getCountWithType(root, "single");
        System.out.println("Nombre de singles : " + count);        
    }

    private static int getCountWithType(JSONObject root, String type) {
        int count = 0;
        JSONArray collection = root.getJSONArray("collection");
        for (int i = 0; i < collection.size(); i++) {
            JSONObject item = collection.getJSONObject(i);
            if (item.getString("type").equals(type)) {
                count++;
            }
        }
        return count;        
    }
}