
package com.commercetools.api.predicates.expansion.discount_group;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountGroupExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountGroupExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountGroupExpansionBuilderDsl of() {
        return new DiscountGroupExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountGroupExpansionBuilderDsl of(final List<String> path) {
        return new DiscountGroupExpansionBuilderDsl(path);
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
}
