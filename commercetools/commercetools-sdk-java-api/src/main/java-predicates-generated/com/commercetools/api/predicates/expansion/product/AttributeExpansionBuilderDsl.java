
package com.commercetools.api.predicates.expansion.product;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AttributeExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AttributeExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AttributeExpansionBuilderDsl of() {
        return new AttributeExpansionBuilderDsl(Collections.emptyList());
    }

    public static AttributeExpansionBuilderDsl of(final List<String> path) {
        return new AttributeExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.ObjectExpansionDsl value() {
        return com.commercetools.api.predicates.expansion.ObjectExpansionDsl.of(appendOne(path, "value"));
    }
}
