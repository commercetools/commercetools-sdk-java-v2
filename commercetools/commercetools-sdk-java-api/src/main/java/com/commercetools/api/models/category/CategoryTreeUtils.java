
package com.commercetools.api.models.category;

import static java.lang.String.format;

import com.commercetools.api.models.Identifiable;

final class CategoryTreeUtils {
    private CategoryTreeUtils() {
    }

    static Category getCategoryOrThrow(final Identifiable<Category> category, final CategoryTree categoryTree) {
        return categoryTree.findById(category.getId())
                .orElseThrow(
                    () -> new IllegalArgumentException(format("%s is not part of the category tree", category)));
    }
}
