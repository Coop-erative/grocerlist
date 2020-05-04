//package com.Cooper.grocerylist.models;
//
//import com.Cooper.grocerylist.Recipe;
//
//import java.util.ArrayList;
//
//public class RecipeData {
//
//    /**
//     * Returns the results of searching the Jobs data by field and search term.
//     *
//     * For example, searching for employer "Enterprise" will include results
//     * with "Enterprise Holdings, Inc".
//     *
//     * @param column Job field that should be searched.
//     * @param value Value of the field to search for.
//     * @par
//     * am allJobs The list of jobs to search.
//     * @return List of all jobs matching the criteria.
//     */
//    public static ArrayList<Recipe> findByColumnAndValue(String column, String value, Iterable<Recipe> allRecipes) {
//
//        ArrayList<Recipe> results = new ArrayList<>();
//
//        if (value.toLowerCase().equals("all")){
//            return (ArrayList<Recipe>) allRecipes;
//        }
//
//        if (column.equals("all")){
//            results = findByValue(value, allRecipes);
//            return results;
//        }
//        for (Recipe recipe : allRecipes) {
//
//            String aValue = getFieldValue(recipe, column);
//
//            if (aValue != null && aValue.toLowerCase().contains(value.toLowerCase())) {
//                results.add(recipe);
//            }
//        }
//
//        return results;
//    }
//
//    public static String getFieldValue(Recipe recipe, String fieldName)
//    {
//        String theValue;
//        if (fieldName.equals("name")){
//            theValue = recipe.getName();
//        } else if (fieldName.equals("category")){
//            theValue = recipe.getCategory().toString();
//        } else {
//            theValue = recipe.getIngredients().toString();
//        }
//        return theValue;
//    }
//
//    /**
//     * Search all Job fields for the given term.
//     *
//     * @param value The search term to look for.
//     * @param allJobs The list of jobs to search.
//     * @return      List of all jobs with at least one field containing the value.
//     */
//    public static ArrayList<Recipe> findByValue(String value, Iterable<Recipe> allrecipes){
//        ArrayList<Recipe> results = new ArrayList<>();
//        for (Recipe recipe : allrecipes) {
//            if (recipe.getName().toLowerCase().contains(value.toLowerCase())) {
//                results.add(recipe);
//            } else if (recipe.getCategory().toString().toLowerCase().contains(value.toLowerCase())) {
//                results.add(recipe);
//            } else if (recipe.getIngredients().toString().toLowerCase().contains(value.toLowerCase())) {
//                results.add(recipe);
//            }
//        }
//        return results;
//    }
//
//}
