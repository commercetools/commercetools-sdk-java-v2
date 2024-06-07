
package com.commercetools.api.predicates.expansion.category;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CategoryReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CategoryReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CategoryReferenceExpansionBuilderDsl of() {
        return new CategoryReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CategoryReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CategoryReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.category.CategoryExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.category.CategoryExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
