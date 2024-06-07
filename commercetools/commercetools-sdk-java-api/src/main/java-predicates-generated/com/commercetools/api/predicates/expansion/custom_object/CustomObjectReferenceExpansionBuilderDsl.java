
package com.commercetools.api.predicates.expansion.custom_object;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomObjectReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomObjectReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomObjectReferenceExpansionBuilderDsl of() {
        return new CustomObjectReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomObjectReferenceExpansionBuilderDsl of(final List<String> path) {
        return new CustomObjectReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.custom_object.CustomObjectExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.custom_object.CustomObjectExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
