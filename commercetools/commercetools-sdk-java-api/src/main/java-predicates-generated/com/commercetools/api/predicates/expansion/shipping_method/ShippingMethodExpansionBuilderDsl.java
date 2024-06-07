
package com.commercetools.api.predicates.expansion.shipping_method;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShippingMethodExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShippingMethodExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShippingMethodExpansionBuilderDsl of() {
        return new ShippingMethodExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShippingMethodExpansionBuilderDsl of(final List<String> path) {
        return new ShippingMethodExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl taxCategory() {
        return com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "taxCategory"));
    }

    public com.commercetools.api.predicates.expansion.shipping_method.ZoneRateExpansionBuilderDsl zoneRates() {
        return com.commercetools.api.predicates.expansion.shipping_method.ZoneRateExpansionBuilderDsl
                .of(appendOne(path, "zoneRates[*]"));
    }

    public com.commercetools.api.predicates.expansion.shipping_method.ZoneRateExpansionBuilderDsl zoneRates(
            long index) {
        return com.commercetools.api.predicates.expansion.shipping_method.ZoneRateExpansionBuilderDsl
                .of(appendOne(path, "zoneRates[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
