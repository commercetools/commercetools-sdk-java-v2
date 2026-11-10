
package com.commercetools.api.predicates.expansion.discount_group;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountGroupReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountGroupReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountGroupReferenceExpansionBuilderDsl of() {
        return new DiscountGroupReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountGroupReferenceExpansionBuilderDsl of(final List<String> path) {
        return new DiscountGroupReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.discount_group.DiscountGroupExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.discount_group.DiscountGroupExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
