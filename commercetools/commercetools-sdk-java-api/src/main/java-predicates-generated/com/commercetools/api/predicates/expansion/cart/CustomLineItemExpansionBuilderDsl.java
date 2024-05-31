
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CustomLineItemExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CustomLineItemExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CustomLineItemExpansionBuilderDsl of() {
        return new CustomLineItemExpansionBuilderDsl(Collections.emptyList());
    }

    public static CustomLineItemExpansionBuilderDsl of(final List<String> path) {
        return new CustomLineItemExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl state() {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "state[*]"));
    }

    public com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl state(long index) {
        return com.commercetools.api.predicates.expansion.order.ItemStateExpansionBuilderDsl
                .of(appendOne(path, "state[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl taxCategory() {
        return com.commercetools.api.predicates.expansion.tax_category.TaxCategoryReferenceExpansionBuilderDsl
                .of(appendOne(path, "taxCategory"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
