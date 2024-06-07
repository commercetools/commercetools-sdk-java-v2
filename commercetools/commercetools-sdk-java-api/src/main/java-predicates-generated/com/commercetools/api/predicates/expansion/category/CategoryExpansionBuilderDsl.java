
package com.commercetools.api.predicates.expansion.category;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CategoryExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CategoryExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CategoryExpansionBuilderDsl of() {
        return new CategoryExpansionBuilderDsl(Collections.emptyList());
    }

    public static CategoryExpansionBuilderDsl of(final List<String> path) {
        return new CategoryExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl ancestors() {
        return com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "ancestors[*]"));
    }

    public com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl ancestors(
            long index) {
        return com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "ancestors[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl parent() {
        return com.commercetools.api.predicates.expansion.category.CategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "parent"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
