
package com.commercetools.api.predicates.expansion.cart;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountCodeInfoExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountCodeInfoExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountCodeInfoExpansionBuilderDsl of() {
        return new DiscountCodeInfoExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountCodeInfoExpansionBuilderDsl of(final List<String> path) {
        return new DiscountCodeInfoExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.discount_code.DiscountCodeReferenceExpansionBuilderDsl discountCode() {
        return com.commercetools.api.predicates.expansion.discount_code.DiscountCodeReferenceExpansionBuilderDsl
                .of(appendOne(path, "discountCode"));
    }
}
