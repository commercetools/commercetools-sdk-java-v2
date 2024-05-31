
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShippingInfoExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShippingInfoExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShippingInfoExpansionBuilderDsl of() {
        return new ShippingInfoExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShippingInfoExpansionBuilderDsl of(final List<String> path) {
        return new ShippingInfoExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl taxCategory() {
        return com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "taxCategory"));
    }

    public com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodReferenceExpansionBuilderDsl shippingMethod() {
        return com.commercetools.api.predicates.expansion.shipping_method.ShippingMethodReferenceExpansionBuilderDsl
                .of(appendOne(path, "shippingMethod"));
    }
}
