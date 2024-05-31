
package com.commercetools.api.predicates.expansion.type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class TypeReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private TypeReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static TypeReferenceExpansionBuilderDsl of() {
        return new TypeReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static TypeReferenceExpansionBuilderDsl of(final List<String> path) {
        return new TypeReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.type.TypeExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.type.TypeExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
