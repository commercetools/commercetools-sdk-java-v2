
package com.commercetools.api.predicates.expansion.product_type;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AttributeNestedTypeExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AttributeNestedTypeExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AttributeNestedTypeExpansionBuilderDsl of() {
        return new AttributeNestedTypeExpansionBuilderDsl(Collections.emptyList());
    }

    public static AttributeNestedTypeExpansionBuilderDsl of(final List<String> path) {
        return new AttributeNestedTypeExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl typeReference() {
        return com.commercetools.api.predicates.expansion.product_type.ProductTypeReferenceExpansionBuilderDsl
                .of(appendOne(path, "typeReference"));
    }
}
