
package com.commercetools.api.predicates.expansion.store;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ProductSelectionSettingExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ProductSelectionSettingExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ProductSelectionSettingExpansionBuilderDsl of() {
        return new ProductSelectionSettingExpansionBuilderDsl(Collections.emptyList());
    }

    public static ProductSelectionSettingExpansionBuilderDsl of(final List<String> path) {
        return new ProductSelectionSettingExpansionBuilderDsl(path);
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
