
package com.commercetools.api.predicates.expansion.cart;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DirectDiscountReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DirectDiscountReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DirectDiscountReferenceExpansionBuilderDsl of() {
        return new DirectDiscountReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static DirectDiscountReferenceExpansionBuilderDsl of(final List<String> path) {
        return new DirectDiscountReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

}
