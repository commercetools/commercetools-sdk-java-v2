
package com.commercetools.api.predicates.expansion.type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class TypeExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private TypeExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static TypeExpansionBuilderDsl of() {
        return new TypeExpansionBuilderDsl(Collections.emptyList());
    }

    public static TypeExpansionBuilderDsl of(final List<String> path) {
        return new TypeExpansionBuilderDsl(path);
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
