
package com.commercetools.api.predicates.expansion.discount_code;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DiscountCodeReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DiscountCodeReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DiscountCodeReferenceExpansionBuilderDsl of() {
        return new DiscountCodeReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static DiscountCodeReferenceExpansionBuilderDsl of(final List<String> path) {
        return new DiscountCodeReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.discount_code.DiscountCodeExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.discount_code.DiscountCodeExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
