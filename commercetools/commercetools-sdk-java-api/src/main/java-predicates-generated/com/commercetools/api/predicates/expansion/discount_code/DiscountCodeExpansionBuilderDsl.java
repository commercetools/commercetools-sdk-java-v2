
package com.commercetools.api.predicates.expansion.discount_code;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountCodeExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountCodeExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountCodeExpansionBuilderDsl of() {
        return new DiscountCodeExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountCodeExpansionBuilderDsl of(final List<String> path) {
        return new DiscountCodeExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl cartDiscounts() {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "cartDiscounts[*]"));
    }

    public com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl cartDiscounts(
            long index) {
        return com.commercetools.api.predicates.expansion.cart_discount.CartDiscountReferenceExpansionBuilderDsl
                .of(appendOne(path, "cartDiscounts[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl references() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "references[*]"));
    }

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl references(long index) {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "references[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
