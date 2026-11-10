
package com.commercetools.api.predicates.expansion.cart_discount;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class CartDiscountExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private CartDiscountExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static CartDiscountExpansionBuilderDsl of() {
        return new CartDiscountExpansionBuilderDsl(Collections.emptyList());
    }

    public static CartDiscountExpansionBuilderDsl of(final List<String> path) {
        return new CartDiscountExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.discount_group.DiscountGroupReferenceExpansionBuilderDsl discountGroup() {
        return com.commercetools.api.predicates.expansion.discount_group.DiscountGroupReferenceExpansionBuilderDsl
                .of(appendOne(path, "discountGroup"));
    }
}
