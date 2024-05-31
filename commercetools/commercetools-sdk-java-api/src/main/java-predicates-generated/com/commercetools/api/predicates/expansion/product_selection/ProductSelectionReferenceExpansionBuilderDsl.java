
package com.commercetools.api.predicates.expansion.product_selection;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductSelectionReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductSelectionReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductSelectionReferenceExpansionBuilderDsl of() {
        return new ProductSelectionReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductSelectionReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ProductSelectionReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_selection.ProductSelectionExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.product_selection.ProductSelectionExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
