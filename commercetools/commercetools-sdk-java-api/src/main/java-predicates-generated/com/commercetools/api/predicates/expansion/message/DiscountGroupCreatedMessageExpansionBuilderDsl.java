
package com.commercetools.api.predicates.expansion.message;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountGroupCreatedMessageExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountGroupCreatedMessageExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountGroupCreatedMessageExpansionBuilderDsl of() {
        return new DiscountGroupCreatedMessageExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountGroupCreatedMessageExpansionBuilderDsl of(final List<String> path) {
        return new DiscountGroupCreatedMessageExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl resource() {
        return com.commercetools.api.predicates.expansion.common.ReferenceExpansionBuilderDsl
                .of(appendOne(path, "resource"));
    }

    public com.commercetools.api.predicates.expansion.discount_group.DiscountGroupExpansionBuilderDsl discountGroup() {
        return com.commercetools.api.predicates.expansion.discount_group.DiscountGroupExpansionBuilderDsl
                .of(appendOne(path, "discountGroup"));
    }
}
