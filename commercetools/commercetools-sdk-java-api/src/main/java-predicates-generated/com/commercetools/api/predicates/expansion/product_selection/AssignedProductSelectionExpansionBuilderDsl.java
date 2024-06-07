
package com.commercetools.api.predicates.expansion.product_selection;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AssignedProductSelectionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AssignedProductSelectionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AssignedProductSelectionExpansionBuilderDsl of() {
        return new AssignedProductSelectionExpansionBuilderDsl(Collections.emptyList());
    }

    public static AssignedProductSelectionExpansionBuilderDsl of(final List<String> path) {
        return new AssignedProductSelectionExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.product_selection.ProductSelectionReferenceExpansionBuilderDsl productSelection() {
        return com.commercetools.api.predicates.expansion.product_selection.ProductSelectionReferenceExpansionBuilderDsl
                .of(appendOne(path, "productSelection"));
    }
}
