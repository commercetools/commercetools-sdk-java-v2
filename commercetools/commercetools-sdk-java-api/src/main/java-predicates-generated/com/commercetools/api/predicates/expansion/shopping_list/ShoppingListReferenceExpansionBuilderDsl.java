
package com.commercetools.api.predicates.expansion.shopping_list;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShoppingListReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShoppingListReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShoppingListReferenceExpansionBuilderDsl of() {
        return new ShoppingListReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShoppingListReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ShoppingListReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.shopping_list.ShoppingListExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.shopping_list.ShoppingListExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
