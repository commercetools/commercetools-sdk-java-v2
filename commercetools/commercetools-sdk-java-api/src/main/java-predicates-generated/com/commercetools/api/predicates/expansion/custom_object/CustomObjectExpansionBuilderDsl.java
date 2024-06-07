
package com.commercetools.api.predicates.expansion.custom_object;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomObjectExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomObjectExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomObjectExpansionBuilderDsl of() {
        return new CustomObjectExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomObjectExpansionBuilderDsl of(final List<String> path) {
        return new CustomObjectExpansionBuilderDsl(path);
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
}
