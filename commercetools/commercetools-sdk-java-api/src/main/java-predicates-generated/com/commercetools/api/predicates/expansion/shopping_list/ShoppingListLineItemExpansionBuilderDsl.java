
package com.commercetools.api.predicates.expansion.shopping_list;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShoppingListLineItemExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShoppingListLineItemExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShoppingListLineItemExpansionBuilderDsl of() {
        return new ShoppingListLineItemExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShoppingListLineItemExpansionBuilderDsl of(final List<String> path) {
        return new ShoppingListLineItemExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl productType() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "productType"));
    }

    public com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl variant() {
        return com.commercetools.api.predicates.expansion.product.ProductVariantExpansionBuilderDsl
                .of(appendOne(path, "variant"));
    }
}
