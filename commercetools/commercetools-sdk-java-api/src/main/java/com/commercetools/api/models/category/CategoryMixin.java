
package com.commercetools.api.models.category;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface CategoryMixin extends Referencable<Category>, ResourceIdentifiable<Category> {
    @Override
    public default CategoryResourceIdentifier toResourceIdentifier() {
        return CategoryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default CategoryReference toReference() {
        return CategoryReference.builder().id(getId()).build();
    }
}
