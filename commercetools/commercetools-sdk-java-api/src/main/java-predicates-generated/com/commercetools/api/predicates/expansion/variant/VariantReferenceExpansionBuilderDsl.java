
package com.commercetools.api.predicates.expansion.variant;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class VariantReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private VariantReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static VariantReferenceExpansionBuilderDsl of() {
        return new VariantReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static VariantReferenceExpansionBuilderDsl of(final List<String> path) {
        return new VariantReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.variant.VariantExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.variant.VariantExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
