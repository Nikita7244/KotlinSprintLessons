package lesson_11

class Ingredient (
    val name : String,
    var count: Int,
    val units: String,
) {
    fun changeCount(newCount: Int) {
        if (newCount >= 0) this.count = newCount
    }
}

class Recipe (
    val name : String,
    val ingredients : MutableList<Ingredient>,
    var portion: Int,
    var cookMethod: String,
) {
    fun addIngredient(ingredient: Ingredient) {
        this.ingredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        this.ingredients.remove(ingredient)
    }

    fun editPortion(newPortion: Int) {
        if (newPortion >= 0) this.portion = newPortion
    }

    fun editCookMethod(newCookMethod: String) {
        if (newCookMethod.isNotEmpty()) this.cookMethod = newCookMethod
    }
}

class Category(
    val name : String,
    val recipe: MutableList<Recipe>,
) {
    fun addRecipe(recipe: Recipe) {
        this.recipe.add(recipe)
    }

    fun removeRecipe(recipe: Recipe) {
        this.recipe.remove(recipe)
    }
}
